package com.jda.objectorientedprograms;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jda.utility.Inventory;
import com.jda.utility.Utility2;

public class Simple {
	
	public static void main(String args[]) throws Exception {
		Utility2 utility = new Utility2();
		JSONParser parser = new JSONParser();
	

		JSONObject inventoryobj = (JSONObject) parser.parse(new FileReader("C:\\Users\\1023340\\eclipse-workspace\\JAVAPROJECT\\src\\com\\jda\\objectorientedprograms\\input\\rpw.txt"));
		String[] inventories = { "rice", "pulses", "wheat" };
		HashMap<String, ArrayList<Inventory>> mapOfInventory = new HashMap();
		for (String inventory : inventories) {
			 mapOfInventory.put(inventory, InventoryMehtods.readJsonArray(inventoryobj, inventory));
			
		}
		System.out.println(mapOfInventory);
		
		InventoryMehtods.printValue(mapOfInventory);

}
	
}
