package com.jda.objectorientedprograms;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jda.utility.StockPortfolio;

public class StockMethods {
	
	public static ArrayList<StockPortfolio> readJsonArray(JSONObject stock, String stockname) {
		ArrayList<StockPortfolio> items = new ArrayList<>();
		for (Object astock : (JSONArray) stock.get(stockname)) {
			items.add(new StockPortfolio((JSONObject) astock));
		}
		System.out.println(items);
		return items;
	}
	
	
	public static void printValue(HashMap<String, ArrayList<StockPortfolio>> stockMap) {

		for (String key : stockMap.keySet()) {
			System.out.println(key + " is worth " + calculateValueOf(stockMap.get(key)));
			System.out.println("------------");
		}
		
	}

	public static long calculateValueOf(ArrayList<StockPortfolio> types) {
		long value = 0;
		for (int i = 0; i < types.size(); i++) {
			System.out.println(types.get(i).getname() + " price is " + types.get(i).value());
			value += types.get(i).value();

		}
		
		return value;

	}
	

}
