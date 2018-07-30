package com.jda.stock;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jda.utility.Utility2;




public class StockReport {

	public static void main(String[] args) throws IOException {
		
		Utility2 utility = new Utility2();
		JsonUtil jsonUtil = new JsonUtil();
		
		System.out.println("Number of stocks : ");
		int numberOfStocks = utility.inputInteger();
		//utility.emtpyLine();
		
		JSONObject jsonObject = new JSONObject();
		JSONArray stockArrayJSON =  new JSONArray();
		
		String stockPortfolio = new String();
		
		//Enter stocks information
		for(int i=0;i<numberOfStocks;i++) {
			StockInfo stockObject = new StockInfo();
			
			System.out.println("Stock Code : ");
			String stockCode = utility.inputString();
			stockObject.setStockName(stockCode);
			
			System.out.println("Stock Price : ");
			double stockPrice = utility.inputDouble();
			stockObject.setStockPrice(stockPrice);
			
			System.out.println("Number of shares : ");
			int stockQuantity = utility.inputInteger();
			stockObject.setStockQuantity(stockQuantity);
			
			//utility.emtpyLine();
			
			//Add stock information to the JSONArray
			stockArrayJSON.add(stockObject);
			stockPortfolio += stockObject.stockPortFolio();
			
		}
		
		//Add stockArray to the JSONObject
		jsonObject.put("stocks", stockArrayJSON);
		
		String output = jsonUtil.convertJavaToJson(jsonObject);
		
		//create JSON file 
		try{
			PrintWriter pw = new PrintWriter("C:\\Users\\1023340\\eclipse-workspace\\JAVAPROJECT\\src\\com\\jda\\objectorientedprograms\\input\\stock.txt");
			pw.write(output);
			pw.flush();
			pw.close();
			System.out.println("File created with stocks information.");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(stockPortfolio);
		
	}

}
