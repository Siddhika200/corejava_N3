package org.tnsif.finalkeyword;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		FinalMethodExample s=new FinalMethodExample();
		s.setFlavour("Mixed flovour");
		//System.out.println(s.getFlavour());
        s.display();
        s.setPrice(240);
        s.display(s.getPrice());
	}

}
 