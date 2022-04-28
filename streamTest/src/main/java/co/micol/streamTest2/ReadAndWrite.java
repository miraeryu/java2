package co.micol.streamTest2;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
//reader와 writer의 필드를 지정하고 한 메소드 안에서 copy로도 가능하다.


public class ReadAndWrite {
	public void read(char index) {
		try {
			Reader reader = new FileReader("c:\\Temp\\source.txt");
			while(true) {
				int data = reader.read();
				if(data ==  -1)break;
				System.out.print((char)data);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void write(char index) {
		
	}

}
