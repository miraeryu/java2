package com.micol.prj.game;

import java.util.Scanner;

public class Mabangjin {
	private Scanner sc = new Scanner(System.in);

	public void run() {
		mabangjin();

	}

	private void mabangjin() {
		System.out.println("=====마  방  진=====");
		int size = sc.nextInt();
		if (size % 2 == 0) {
			System.out.println("홀수만 입력하세요.");
		}
		int[][] arr = new int[size][size]; // 배열 생성
		int num = 1;
		System.out.println(size + " * " + size + "의 마방진을 실행합니다.");
		for (int i = 0, j = size / 2; num <= size * size; num++) {
			arr[i][j] = num;
			if (num % size == 0) {
				i++;
			} else {
				i--;
				j++;
				if (i < 0) {
					i = size - 1;
				} else if (j > size - 1) {
					j = 0;
				}
			}
		}
		
		//출력 호출
		toPrint(arr);

	}
	private void toPrint(int[][] result) {
		for(int[] num : result) {
			for (int n : num) {
				System.out.printf("%3d", n);
			}
			System.out.println();
		}
	}

}
