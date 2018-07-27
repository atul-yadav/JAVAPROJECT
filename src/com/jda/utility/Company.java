package com.jda.utility;

public class Company {
		private String company;
		private long share;
		private long price;
		
		
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public long getShare() {
			return share;
		}
		public void setShare(long share) {
			this.share = share;
		}
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
		
		public String toString() {
			return "{" + "\"name\":\"" + company + ",\"" + "\"noofshare\":\"" + share + ",\"shareprice\":\"" + price + "}";

		}
		
	}
	


