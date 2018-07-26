package com.jda.objectorientedprograms;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jda.utility.Inventory;
import com.jda.utility.Utility2;

public class Inve {
	public static void main(String args[]) throws Exception {
		Utility2 utility = new Utility2();
		JSONParser parser = new JSONParser();
	

		JSONObject inventoryobj = (JSONObject) parser.parse(new FileReader("C:\\Users\\1023340\\eclipse-workspace\\JAVAPROJECT\\src\\com\\jda\\objectorientedprograms\\input\\rpw.txt"));
		String[] inventories = { "rice", "pulses", "wheat" };
		HashMap<String, ArrayList<Inventory>> MapofInventory = new HashMap();
		for (String inventory : inventories) {
			 MapofInventory.put(inventory, InventoryMehtods.readJsonArray(inventoryobj, inventory));
			
		}
		System.out.println(MapofInventory);
		
		int choice;
		do {
			System.out.println("please enter the operation you want to perform,To add product(1),To remove product(2), To print value of a inventory(3)");
			System.out.println("");
			choice = utility.inputInteger();
			switch (choice) {
			case 1: {
				InventoryMehtods.additem(MapofInventory);
				break;
			}
			case 2: {
				System.out.println("please enter the inventory name in which you want to remove  product");
				String inventorytodelete = utility.inputString();
				System.out.println("please enter the product name");
				String delete = utility.inputString();

				InventoryMehtods.removeitem(MapofInventory, inventorytodelete, delete);
				break;

			}
			case 3: {
				InventoryMehtods.printValue(MapofInventory);
				break;
			}
			
			}
		} while (choice != 0);

	}

	

}