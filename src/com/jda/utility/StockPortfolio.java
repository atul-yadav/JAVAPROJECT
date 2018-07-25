package com.jda.utility;

import org.json.simple.JSONObject;

public class StockPortfolio {
	private String name;
	private long noofshare;
	private long shareprice;
	public StockPortfolio(JSONObject jsonobject) {
		name = (String) jsonobject.get("stockNames");
	    noofshare= (long) jsonobject.get("quantity");
	    shareprice = (long) jsonobject.get("sharePrice");
	}
		public StockPortfolio(String name, long noofshare, long shareprice) {
			this.noofshare = noofshare;
			this.shareprice = shareprice;
			this.name = name;
		}

		public long getnoofshare() {
			return noofshare;
		}

		public String getname() {

			return name;
		}

		public long getshareprice() {
			return shareprice;
		}

		public void setnoofshare(long noofshare) {
			this.noofshare = noofshare;
		}

		public void setshareprice(long shareprice) {
			this.shareprice= shareprice;
		}

		public void setname(String name) {
			this.name = name;
		}

		public long value() {
			return noofshare*shareprice;
		}

		@Override
		public String toString() {
			return "{" + "\"name\":\"" + name + ",\"" + "\"noofshare\":\"" + noofshare + ",\"shareprice\":\"" + shareprice + "}";

		}
	

}