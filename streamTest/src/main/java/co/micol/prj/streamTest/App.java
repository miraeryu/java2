package co.micol.prj.streamTest;

import co.micol.prj.streamTest.exam.ReadExample;
import co.micol.prj.streamTest.exam.ReaderExample;
import co.micol.prj.streamTest.exam.WriteExample;

public class App {
	public static void main(String[] args) {
		
//		WriteExample wr = new WriteExample();
//		wr.run();
//		
//		ReadExample re = new ReadExample();
//		re.run();
		
		ReaderExample rs = new ReaderExample();
		rs.run();
		
	}
}
