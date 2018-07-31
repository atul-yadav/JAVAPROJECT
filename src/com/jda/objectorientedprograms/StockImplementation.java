package com.jda.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Stack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.jda.utility.Utility2;

public class StockImplementation {
	
	static JSONObject transaction = new JSONObject();
	static LinkedList<JSONObject> customerList = new LinkedList<JSONObject>();
	static LinkedList<JSONObject> stockList = new LinkedList<JSONObject>();
	static Stack<JSONObject> transactionStack = new Stack<JSONObject>();
	
	public static JSONArray readCustomerFile() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("C:\\\\Users\\\\1023340\\\\eclipse-workspace\\\\JAVAPROJECT\\\\src\\\\com\\\\jda\\\\objectorientedprograms\\\\input\\\\Customer.json"));
		JSONObject jo = (JSONObject) obj;
		JSONArray array = (JSONArray) jo.get("Customer");
		return array;
	}
	
	public static JSONArray readStockFile() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("C:\\\\Users\\\\1023340\\\\eclipse-workspace\\\\JAVAPROJECT\\\\src\\\\com\\\\jda\\\\objectorientedprograms\\\\input\\\\Company.json"));
		JSONObject jo = (JSONObject) obj;
		JSONArray array = (JSONArray) jo.get("Stocks");
		return array;
	}
	
	//total value of account
	public static Double valueOf() throws FileNotFoundException, IOException, ParseException {
		JSONArray stockArray = readStockFile();
		//Iterator itr1 = stockArray.iterator(), itr2;
		double value = 0, totalValue = 0;
		for(int i =0; i< stockArray.size(); i++) {
			JSONObject object = (JSONObject) stockArray.get(i);
			String temp = (String) object.get("company");
			double shares = Double.parseDouble((String) object.get("sharesAvailable")) ;
			double price = Double.parseDouble((String) object.get("pricePerShare")) ;
			value = price * shares;
			System.out.println("The value of shares of " + temp + " = " +value);
			System.out.println();
			totalValue += value;
		}
		return totalValue;	
	}
	
	//subtract shares of stock from account
	public static void sell(int amount, String symbol) throws FileNotFoundException, IOException, ParseException {
		JSONArray stockArray = readStockFile();
		JSONArray customerArray = readCustomerFile();
		Utility2 utility = new Utility2();
		for(int i =0; i<stockArray.size(); i++) {
			JSONObject obj = (JSONObject) stockArray.get(i);
			if(obj.get("type").equals(symbol)) {
				LinkedHashMap m = new LinkedHashMap(2);
				int price = Integer.parseInt((String) obj.get("price")) ;
				double sharesPurchased = amount/price;
				System.out.println(sharesPurchased);
				if(sharesPurchased >= 1) {
					System.out.println("Give the name of the customer that wants to buy");
					utility.inputString();
					String name = utility.inputString();
					for(int j =0; j< customerArray.size(); j++) {
						JSONObject temp = (JSONObject) customerArray.get(j);
						if(temp.get("name").equals(name)) {
							m.put("CustomerName", name);
							int buffer = Integer.parseInt((String) temp.get("investment")) ;
							buffer = buffer - amount;
							temp.put("investment", Integer.toString(buffer));
							updateCustomer(temp,j);
							break;
						}
						else if(!(temp.get("name").equals(name)) && j == customerArray.size()-1)
							System.out.println("There is no such customer in the database");
					}
				}
				else {
					System.out.println("Purchase not possible");
					break;
				}
				int temp = Integer.parseInt((String) obj.get("sharesAvailable"));
				temp -= sharesPurchased;
				obj.put("sharesAvailable", Integer.toString(temp));
				updateStocks(obj, i);
				m.put("StockPurchased", symbol);
				m.put("NumberOfShares", Double.toString(sharesPurchased));
				m.put("Date", LocalDate.now().toString());
				m.put("Time", LocalTime.now().toString());
				transaction.put("recent",m);
			}

		}
	}
	
	//save account to file
	public static void save(String transactions) throws IOException, ParseException {
		JSONObject jo = new JSONObject();
		JSONObject jo1 = new JSONObject();
		JSONParser parser = new JSONParser();
		jo = (JSONObject) parser.parse(new FileReader(transactions));
		JSONArray array = (JSONArray) jo.get("Transactions");
		for(int i =0; i<array.size(); i++)
			transactionStack.push((JSONObject) array.get(i));
		transactionStack.push((JSONObject) transaction.get("recent"));
		jo1.put("Transactions", transactionStack);
		PrintWriter pw = new PrintWriter(transactions);
        pw.write(jo1.toJSONString());
        pw.flush();
        pw.close();
	}
	
	//print a detailed report of stocks and values
	public static void printReport() throws FileNotFoundException, IOException, ParseException {
		JSONObject jo = new JSONObject();
		/*jo = transactionStack.pop();
		System.out.println("CustomerName : " + jo.get("CustomerName"));
		System.out.println("StockPurchased : " + jo.get("StockPurchased"));
		System.out.println("NumberOfShares : " + jo.get("NumberOfShares"));
		System.out.println("Date : " + jo.get("Date"));
		System.out.println("Time : " + jo.get("Time"));*/
		JSONParser parser = new JSONParser();
		jo = (JSONObject) parser.parse(new FileReader("Input\\Transactions.json"));
		JSONArray ja = (JSONArray)jo.get("Transactions");
		JSONObject object = (JSONObject) ja.get(ja.size()-1);
		System.out.println("CustomerName : " + object.get("CustomerName"));
		System.out.println("StockPurchased : " + object.get("StockPurchased"));
		System.out.println("NumberOfShares : " + object.get("NumberOfShares"));
		System.out.println("Date : " + object.get("Date"));
		System.out.println("Time : " + object.get("Time"));
	}
	
	public static void updateCustomer(JSONObject obj, int k) throws FileNotFoundException, IOException, ParseException {
		JSONArray array = readCustomerFile();
		for(int i =0; i<array.size(); i++) 
			customerList.add((JSONObject) array.get(i));
		customerList.remove(k);
		customerList.add(obj);
		
		JSONObject jo = new JSONObject();
		jo.put("Customer", customerList);
		PrintWriter pw = new PrintWriter("Input//CustomerInfo.json");
        pw.write(jo.toJSONString());
        pw.flush();
        pw.close();
		
	}
	
	public static void updateStocks(JSONObject obj, int k) throws FileNotFoundException, IOException, ParseException {
		JSONArray array = readStockFile();
		for(int i =0; i<array.size(); i++) 
			stockList.add((JSONObject) array.get(i));
		stockList.remove(k);
		stockList.add(obj);
		
		JSONObject jo = new JSONObject();
		jo.put("Stocks", stockList);
		PrintWriter pw = new PrintWriter("Input//CompanyShares.json");
        pw.write(jo.toJSONString());
        pw.flush();
        pw.close();
	}
}
	
	
	



