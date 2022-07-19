package com.java8;
interface I3{
	public String m3();
}
public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Lalman";
		I3 i3=()->{return name;};
		System.out.println(i3.m3());
		

	}

}
