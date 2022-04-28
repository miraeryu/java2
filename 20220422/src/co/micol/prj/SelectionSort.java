package co.micol.prj;

//범위지시자[public > private > protected, default(인터페이스에서만)]

public class SelectionSort {

	private int i;
	private int j;
	private int min;
	// 외부적으로 사용할땐 getter setter필요하지만 내부적으로 사용할땐 필요X

	public void sort(int[] arr) {
		// 초기데이터 출력
		arrprint(arr);

		for (i = 0; i < arr.length - 1; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) { // 요소비교
				if (arr[min] < arr[j]) { // 부등호의 방향으로 오름차순 내림차순 결정
					min = j;
				}
			}
			if (min != i) { // swap
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}

		}

		resultprint(arr);

	}

	private void arrprint(int[] arr) {
		System.out.println("====== 초기 데이터 ======");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("======================");// 줄바꿈
	}

	private void resultprint(int[] arr) {
		System.out.println("====== 결과 데이터 ======");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("======================");// 줄바꿈
	}

	@Override
	public String toString() {
		return "SelectionSort [i=" + i + ", j=" + j + ", min=" + min + "]";
	}
}
