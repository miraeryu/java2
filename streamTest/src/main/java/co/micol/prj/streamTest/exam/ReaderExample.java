package co.micol.prj.streamTest.exam;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public void run() {
		try {
			Reader reader = new FileReader("c:\\Temp\\test1.txt");
			while(true) {
				int data = reader.read();
				if(data ==  -1)break;
				System.out.println((char)data);
			}
			reader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
