package org.tnsif.thiskeyword;

class banking
{
	int num;
	banking(){
}
	banking(int num){
		this.num=num;
		}
	    void print() {
		System.out.println("Num:"+num);
}
}
public class ThisKeywordExample {
	public static void main(String[] args) {
		banking b=new banking();
		banking b1=new banking(2555777);
        b1.print();
	}

}
