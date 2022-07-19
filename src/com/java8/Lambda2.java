package com.java8;
interface I2{
	public void m2(int a,int b);
}
public class Lambda2 {

	public static void main(String[] args) {
		I2 i2=(a,b)->System.out.println("Sum== "+(a+b));
		i2.m2(10, 20);
	}
}