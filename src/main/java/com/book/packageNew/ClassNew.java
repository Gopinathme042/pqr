package com.book.packageNew;

public class ClassNew {

	public static void main(String[] args) throws InterruptedException {
		int num=8;
		if(num%2==0) {
			System.out.println(num+" is Even number");
			Thread.sleep(3000);
		}
		else {
			System.out.println(num+" is Odd number");
			Thread.sleep(3000);
		}

	}

}
