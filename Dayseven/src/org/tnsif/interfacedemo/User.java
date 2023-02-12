package org.tnsif.interfacedemo;

public class User implements SBI,HDFC {
	@Override
	public String LoanType() {
		return "Personal Loan";
		}

	@Override
	public float getInterest() {
		return 12.8f;
}
}
