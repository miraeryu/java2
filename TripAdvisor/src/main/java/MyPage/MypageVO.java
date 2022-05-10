package MyPage;

import java.util.Date;

import lombok.Data;
@Data
public class MypageVO {
	private String subject;
	private String index;
	private int BoardNum;
	private String writer;
	private Date writeDate;
	
	
	
	public List<MypageVO>(String subject, int boardNum, Date writeDate) {
		super();
		this.subject = subject;
		BoardNum = boardNum;
		this.writeDate = writeDate;
	}



	public String toString() {
		return "MypageVO [subject=" + subject + ", index=" + index + ", BoardNum=" + BoardNum + ", writer=" + writer
				+ ", writeDate=" + writeDate + "]";
	}
	
	

}
