package org.tnsif.thiskeyword;

class HR{
	void display(HR obj) {
		System.out.println("HR....");
}
	void accept() {
		display(this);
	}
}
public class ThisExecutor {

	public static void main(String[] args) {
		HR a=new HR();
		a.accept();	

	}

}
