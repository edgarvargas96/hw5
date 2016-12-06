package cecs174bank;

import java.util.GregorianCalendar;
import java.util.Date;


public class BankAccount {
	public String AccountOwner;
	public enum AccountType {
		CHECKING("checking"), SAVINGS("savings"), MONEY_MARKET("money market");
		
		private String typeOfAccount;
		private AccountType(String type)
		{
			this.typeOfAccount = type;
		}
		public String toString()
		{
			return this.typeOfAccount;
		}
	}
	
	public float CurrentBalance;
	public float InterestRate;
	public Date DateOpened = new Date();
	
	
	
}


