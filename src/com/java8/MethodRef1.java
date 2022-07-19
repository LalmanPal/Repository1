package com.java8;
interface MR1{
	void m1();
}

public class MethodRef1 {
	public static void saySomething(){
		System.out.println("Hello this is method reference!");
	}

	public static void main(String[] args) {
		MR1 mr=MethodRef1::saySomething;
		mr.m1();
	}

}
