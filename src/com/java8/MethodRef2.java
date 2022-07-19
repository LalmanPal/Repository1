package com.java8;

public class MethodRef2 {

	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		Thread t=new Thread(MethodRef2::ThreadStatus);
		t.start();

	}

}
