package org.tnsif.application;

import org.tnsif.framework.NoramlAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String accnm, float charges, float delieveryCharges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accno, accnm, charges, isPrime);
		return p;
	}

	@Override
	public NoramlAcc getNewNoramlAcc(int accno, String accnm, float charges, float delieveryCharges, boolean isPrime) {
		GSNoramlAcc n=new GSNoramlAcc(accno, accnm, charges, delieveryCharges);
		return n;
	}

}
