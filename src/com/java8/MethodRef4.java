package com.java8;

interface MR4{
	public void say() ;
}
public class MethodRef4 {

	public void saySome() {
		System.out.println("Hi what are you doing bro...!");
	}
	public static void main(String[] args) {
		MR4 i4=new MethodRef4()::saySome;
		i4.say();
	}

}
