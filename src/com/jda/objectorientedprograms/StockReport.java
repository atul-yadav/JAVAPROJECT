package com.jda.objectorientedprograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.StockPortfolio;

public class StockReport {
	public static void main(String args[]) throws IOException, ParseException {

		JSONParser parser = new JSONParser();

		JSONObject stockobj = (JSONObject) parser.parse(new FileReader("C:\\Users\\1023340\\eclipse-workspace\\JAVAPROJECT\\src\\com\\jda\\objectorientedprograms\\input\\stock.txt"));
		String[] stocks = { "facebook", "alphabet"};
		HashMap<String, ArrayList<StockPortfolio>> StockMap = new HashMap();
		for (String stock : stocks) {
			StockMap.put(stock, StockMethods.readJsonArray(stockobj, stock));
		}
		StockMethods.printValue(StockMap);

	}

}
