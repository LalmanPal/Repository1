package com.java8;
interface I1{
	public void m1();
}
public class Lambda1 {

	public static void main(String[] args) {
		I1 i1=()->System.out.println("Hi This is my first lambda");
		
		i1.m1();

	}

}
