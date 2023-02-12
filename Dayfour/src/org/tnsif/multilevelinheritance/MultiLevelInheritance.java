package org.tnsif.multilevelinheritance;
import java.util.Scanner;
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int modelno=sc.nextInt();
		String version=sc.nextLine();
		String slottype=sc.nextLine();
		Iphone i=new Iphone();
		Iphone i1=new Iphone(modelno,version,slottype);
		i1.setModelno(modelno);
		i1.setSlottype(slottype);
		i1.setVersion(version);
		i1.getModelno();
		i1.getSlottype();
		i1.getVersion();
		i1.slot();
		i1.version();
		i1.display();
		System.out.println(i1);

	}

}
