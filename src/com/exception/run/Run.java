package com.exception.run;

import com.exception.controller.A_UnCheckedException;
import com.exception.controller.B_CheckedException;

public class Run {

	public static void main(String[] args) {

		A_UnCheckedException a = new A_UnCheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		//b.method1();
		/*try {
			b.method3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		b.method5();
	}

}
