package com.java8;
interface I4{
	public String m4(String name);
}
public class Lambda4 {

	public static void main(String[] args) {
          I4 i1=(name)->{return name;};
          System.out.println("Name1="+i1.m4("Lalman"));
	}
}
          
          