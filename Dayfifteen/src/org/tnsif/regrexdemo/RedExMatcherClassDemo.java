package org.tnsif.regrexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedExMatcherClassDemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("siddhika");
		Matcher m=p.matcher("My name is siddhika");
        while(m.find())
        {
        	System.out.println("Pattern found at:"+m.start()+" "+m.end());
        }
        		
	}

}
