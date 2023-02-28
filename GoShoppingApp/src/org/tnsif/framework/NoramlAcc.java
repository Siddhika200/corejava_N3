package org.tnsif.framework;

public abstract class NoramlAcc extends ShopAcc {
   final private float delieveryCharges;
	public NoramlAcc(int accno, String accnm, float charges,float delieveryCharges) {
		super(accno, accnm, charges);
		this.delieveryCharges=delieveryCharges;
	}
	@Override
	public String toString() {
		return "NoramlAcc [delieveryCharges=" + delieveryCharges + "]";
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Acc no"+this.getAccno()+"Acc name :"+this.getAccnm()+"Delivery Charges :"+(charges+this.delieveryCharges));
		
	
	}
}
