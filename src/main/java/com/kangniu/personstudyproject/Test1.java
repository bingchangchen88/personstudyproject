package com.kangniu.personstudyproject;

import org.bingchangchen.first.CbcTest;
import org.bingchangchen.first.CbcTest2;
import org.bingchangchen.first.CbcTest3;

public class Test1 {
	
	static {
		f();
	};
	
	public static void f() {
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("teststsetestsetst!!!!!!");
		}
	}
	public static void main(String[] args) {
		CbcTest3.ff();
		CbcTest2.ff();
		CbcTest.ff();
		
	}

}
