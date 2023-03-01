package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;

public class client {

	public static void main(String[] args) {
		BankFactory f=new MMBankFactory();
		MMCurrentAcc c=new MMCurrentAcc(1001,"Pooja Ghule",22000.0f,1000);
		MMSavingAcc s=new MMSavingAcc(1002,"Siddhika Ghule",2000.0f,true);
		
		System.out.println("Current Account");
        System.out.println(c);
        c.withdraw(c.getAccBal());
       
        
        System.out.println("Saving Account");
        System.out.println(s);
        s.withdraw(s.getAccBal());
	}

}
