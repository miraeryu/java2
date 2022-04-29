package com.micol.prj.game;

import java.util.Scanner;

public class Lotto {
	private Scanner sc = new Scanner(System.in);

	private void insertMoney() {
		// 1~45까지의 숫자를 랜덤, 겹치지 않게
		// 사용자가 출력하는 것과 내가 갖고 있는 것을 비교
		// 맞으면 맞다 틀리면 틀리면 실패의 결과가 나오도록
		System.out.println("게임은 한 게임당 1000원입니다.");
		System.out.println("몇 게임을 진행하시겠습니까?");
		System.out.print("입력>>");

	}

	private void LottoGame() {
		insertMoney();
		int count = sc.nextInt();
		System.out.println(count * 1000 + "원으로 " + count + "회의 게임을 진행합니다.");

		boolean b = true;
		while (b) {
			if (count > 0) {

				// 사용자의 숫자 출력 부분
				UserGame();

				// 시스템의 랜덤 숫자 출력 부분
				System.out.println("시스템 게임을 뽑고 있습니다.");
				SystemGame();

				// 사용자와 컴퓨터의 숫자 비교 부분
				System.out.println("시스템과 유저의 숫자를 비교합니다.");
				checkGame();
				count--;

			} else if (count == 0) {
				System.out.println("횟수를 모두 소진했습니다.");
				System.out.println("게임을 종료합니다.");
				b = false;
			}
		}

	}

	private void SystemGame() {
		int[] com = new int[6];
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");

		}
		System.out.println();

	}

	private void UserGame() {
		int[] user = new int[6];
		System.out.println("1 ~ 45까지 6개의 숫자를 입력하세요.");
		System.out.println("하나씩 입력합니다.");
		System.out.print("입력>>");
		for (int i = 0; i < user.length; i++) {
			int insert = sc.nextInt();
			if (insert > 45) {
				System.out.println("45 미만의 숫자를 입력해 주십시오.");
				break;
			} else {
				if (user[i] == 0) {
					user[i] = insert;
				}
			}
			for (int j = 0; j < i; j++) {
				if (user[i] == user[j]) {
					System.out.println("같은 수가 이미 있습니다.");
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.println("로 게임을 진행합니다.");
	}

	private void checkGame() {

	}

	public void run() {
		System.out.println("=====로 또 게 임=====");
		LottoGame();
	}

}
