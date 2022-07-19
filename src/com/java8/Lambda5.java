package com.java8;
interface I5{
	public String m5(String messg);
}
public class Lambda5 {

	public static void main(String[] args) {
	   I5 i5=(msg)->{
		   String str1="I would like to say ";
		   String str2=str1+msg;
		   return str2;
	   };
	   System.out.println("Message : "+i5.m5("time is precious"));

	}

}
