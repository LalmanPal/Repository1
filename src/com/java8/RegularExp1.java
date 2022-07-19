package com.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp1 {

	public static void main(String[] args) {
		//1st way
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		
		//2nd way
		boolean matches = Pattern.compile(".s").matcher("as").matches();
		
		//3rd way
		boolean matches2 = Pattern.matches(".s", "as");
		System.out.println(b+"  "+matches+"  "+matches2);		
	}

}
