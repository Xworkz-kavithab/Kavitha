package com.xworkz.z.util;

import com.xworkz.z.bank.SBIBank;

public class BankUtil {
	public static void main(String[] args) {
		
		SBIBank b=new SBIBank("fort","1234556","SBI2345670");
	
//		b.address="chandraLayout";
//		b.IFSCCode="098765";
//		b.accountNumber="SBI09876";
//		System.out.println(b.address+" "+b.IFSCCode+" "+b.IFSCCode);		

		System.out.println(b.getAddress()+" "+b.getIFSCCode()+" "+b.getAccountNumber()); 
	}

}
