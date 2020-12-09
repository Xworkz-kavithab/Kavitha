package com.xworkz.z.bank;

public class Bank {
//	public String address;
//public	String accountNumber;
//	public String IFSCCode;
//	
	private String address;
	private	String accountNumber;
		private String IFSCCode;
	
public Bank(String address,String accountNumber,String IFSCCode) {
		this.address=address;
		this.accountNumber=accountNumber;
		this.IFSCCode=IFSCCode;
		
	}
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIFSCCode() {
		return IFSCCode;
	}

	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	
	

}
