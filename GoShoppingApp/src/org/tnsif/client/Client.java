package org.tnsif.client;

import org.tnsif.application.GSNoramlAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory f= new GSShopFactory();
		GSPrimeAcc p=new GSPrimeAcc(1234,"Siddhika Ghule",1050f,true);
		GSNoramlAcc n=new GSNoramlAcc(1204,"Pooja Ghule",1050f,60f);
		
        System.out.println("Prime Acc");
        System.out.println(p);
        p.bookProduct(p.getCharges());
        
        System.out.println("Normal acc");
        System.out.println(n);
        n.bookProduct(n.getCharges());
	}

}
