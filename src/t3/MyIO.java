package t3;

import java.io.*;
import java.util.*;

class MyIOWriteFile {
	final int bufSize = 128;
	
	public void executeWrite() throws IOException {
		FileWriter f = new FileWriter("a.txt");
		BufferedWriter bw = new BufferedWriter(f);
		byte readBuf[] = new byte[bufSize];
		int count;
		String str = null;
		
		try {
			while(str == null || (str != null && !str.equals("bye\r\n"))) {
		
				count = System.in.read(readBuf, 0, bufSize);
				
				if (count != 0) {
					str = new String(readBuf, 0, count);
				
					bw.write(str+'\n');
					
				}
			}
			
			bw.flush();
			bw.close();
			f.close();
			
		}
		catch (IOException IOe) {
			String fullName = this.getClass().getName();
			System.err.println("in "+fullName.substring(0, fullName.lastIndexOf('$'))+": " + IOe);
			
			throw(IOe);
		}
		
	}
}

public class MyIO {
	
	public MyIO() throws IOException {
		System.out.println("in constructor of MyIO");
		runMyIO();

	}
	
	public void runMyIO() throws IOException {
		MyIOWriteFile MyWriter = new MyIOWriteFile();
		
		try {
			MyWriter.executeWrite();
		}
		catch (IOException IOe) {
			String fullName = this.getClass().getName();
			System.err.println("in "+fullName.substring(0, fullName.lastIndexOf('$'))+": " + IOe);
			
			throw(IOe);
		}
	}
}

