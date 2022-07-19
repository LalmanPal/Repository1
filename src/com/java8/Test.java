package com.java8;

public class Test {

	public static void main(String[] args) {
		int a=10;
		try {
		int b=10/0;
		System.out.println(b);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}

}
