package co.micol.prj.app;

import java.util.Arrays;

import co.micol.prj.SelectionSort;

public class MainApp {
	public static void main(String[] args) {
////		SelectionSort selectSort = new SelectionSort();
//		int data[] = {5,1,4,3,2};
//		for (int d : data) {
//			System.out.println(d);
//		}
//		System.out.println("=====================");
////		data = selectSort.sort(data);
//		Arrays.sort(data); //오름차순 정렬 위와 동일
//		for (int i = 0; i < data.length;i++) {
//			System.out.println(data[i]);
//		}
		SelectionSort selectSort = new SelectionSort();
		int data[] = {5,1,4,3,2};
		selectSort.sort(data);

	
	
	
	}

}
