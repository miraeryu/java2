package co.micol.menuTest;

import java.util.Scanner;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	
	private void mainMenu() {
		boolean run = true;
		while (run) {
			menuTitle();
			System.out.println("원하는 작업을 선택하세요.");
			System.out.print("입력>>");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				subTitle();
				break;
			case 2:
				run = false;
				break;
			}
			sc.close();
		}
		
		
	}
	private void menuTitle() {
		System.out.println("=================");
		System.out.println("==== 1. 입 력 ==== ");
		System.out.println("==== 2. 종 료 ==== ");
		System.out.println("=================");
	}
	private void subTitle() {
		System.out.println("=================");
		System.out.println("===== 이  름 ===== ");
		System.out.println("= 1. 돌 아  가 기 = ");
		System.out.println("=================");
		int ll = sc.nextInt();
	}
	public void exe() {
		mainMenu();
	}

}
