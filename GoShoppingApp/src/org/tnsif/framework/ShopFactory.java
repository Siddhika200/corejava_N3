package org.tnsif.framework;

public abstract class ShopFactory {
	
     public abstract PrimeAcc getNewPrimeAcc(int accno,String accnm,float charges,float delieveryCharges,boolean isPrime);
     public abstract NoramlAcc getNewNoramlAcc(int accno,String accnm,float charges,float delieveryCharges,boolean isPrime);
}
