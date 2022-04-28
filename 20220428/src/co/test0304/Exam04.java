package co.test0304;

public class Exam04 {
	public static void main(String[] args) {
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };

		// 뒤에서 1자리로 남녀인지 구분 판정
		int man = 0;
		int woman = 0;
		for (int i = 0; i < arr.length; i++) {
			char sex = arr[i].charAt(7);

			switch (sex) {
			case '1':
			case '3':
				man++;
				break;
			case '2':
			case '4':
				woman++;
				break;

			}
		}
		System.out.println("남 " + man + " 여 " + woman);
	}

}
