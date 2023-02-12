package org.tnsif.thiskeyword;

class Account{
    int a;
    int b;
    public void setdata(int a,int b) {
    	//this give null value
//    	a=a;
//    	b=b;
    	
    	//chancing varaible name will get the values
//    	a=a1;
//    	b=b1;
    	
    	this.a=a;
    	this.b=b;
    }
    public void showdata() {
    	System.out.println("Value od A = "+a);
    	System.out.println("Value od B = "+b);
    }
}

	public class ThisKeywordDemo{
		public static void main(String args[]) {
			Account obj=new Account();
			obj.setdata(4,9);
			obj.showdata();
			
		}
	}
