package com.jda.utility;

public class Customer {
	
		public String mobileno;
		private String customerName;
		private String amount;
		public Customer(String customerName, String mobileno,  String amount){
			this.mobileno = mobileno;
			this.customerName = customerName;
			this.amount = amount;
		}
		

		public void setCustomerName(String customerName)
		{
			this.customerName = customerName;
		}
		public void setMobileno(String mobileno)
		{
			this.mobileno = mobileno;
		}
		public void setAmount(String amount)
		{
			this.amount = amount;
		}
		public String getcustomerName()
		{
		
			return customerName;
		}
		public String getMobileno()
		{
			return mobileno;
		}
		public String getAmount()
		{
			return amount;
		}
		
		@Override
		public String toString(){
			//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
			return "{" + "\"amount\":\"" + amount + ",\"" + "\"mobileno\":\"" + mobileno + ",\"customerName\":\"" + customerName + "}";
		}


}