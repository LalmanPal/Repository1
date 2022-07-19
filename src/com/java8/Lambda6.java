package com.java8;

public class Lambda6 {

	public static void main(String[] args)  {
		Runnable rb=()->{
			
			try {
				for(int i=0;i<5;i++) {
				System.out.println("Hi this is run method body!");
				Thread.sleep(5000);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			};
		
	    Thread t=new Thread(rb);
	    t.start();

	}

}
