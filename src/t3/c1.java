package t3;

import java.io.*;
import java.util.*;

abstract class c3{
	abstract void print();
}

abstract class c5{
	abstract void another_print();
}

class c2 extends c3 implements i1,i2, Intf1{
	private int a;

	public void print() {
		System.out.print("in c2\n");
	}

	public void i_print() {
		System.out.print("in c2, i_print\n");
	}

	public void i_print_2() {
		System.out.print("in c2, i_print_2\n");
	}
	
}

class c4 extends c3{
	private
		int a;

	public
	void print() {
		System.out.print("in c4\n");
	}
}

interface i1{
	final int a1 = 1;
	
	void i_print();
}

interface i2 extends i1{
	void i_print_2();
	
}


public class c1{
	public static void main(String[] argv) throws IOException {	

/*		
		c2 o2 = new c2();
		c4 o4 = new c4();
		
		System.out.print("Hello\n");
		o2.print();
		o4.print();
		o2.i_print();
		o2.i_print_2();
		
		System.out.print("Now for IO\n");
		
		MyIO myIO = new MyIO();

		System.out.println("End of IO");
		
*/		
		try {
			StdIOTester t1 = new StdIOTester();
			t1.test1();
		}catch (IOException IOe) {
			System.err.println(IOe);
		}

	}
}
