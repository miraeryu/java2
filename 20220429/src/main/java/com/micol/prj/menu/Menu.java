package com.micol.prj.menu;

import java.util.Scanner;

import com.micol.prj.game.Lotto;
import com.micol.prj.game.Mabangjin;
import com.micol.prj.game.Tetris;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Lotto lotto = new Lotto();
	private Mabangjin mabangjin = new Mabangjin();
	private Tetris tetris = new Tetris();
	
	private void mainTitle() {
		System.out.println("===================");
		System.out.println("=====게 임 모 음=====");
		System.out.println("===1. 로 또 게 임====");
		System.out.println("===2. 마  방  진====");
		System.out.println("===3. 테 트 리 스====");
		System.out.println("===4. 게 임 종 료====");
		System.out.println("===================");
		System.out.println("하고싶은 게임을 선택하세요.");
		System.out.print("입력>>");
		
	}
	
	private void mainMenu() {
		boolean menu = true;
		do {
			mainTitle();
			int select = sc.nextInt();
			switch(select) {
			case 1:
				//로또게임
				lotto.run();
				break;
				
			case 2:
				//마방진
				mabangjin.run();
				break;
				
			case 3:
				//테트리스
				tetris.run();
				break;
			
			case 4:
				menu = false;
				System.out.println("***GOOD BYE***");
				System.out.println("END OF PROGRAM");
				sc.close();//열었으면 닫아주기!!
				break;
			}
		}while(menu);
	}
	
	public void run() {
		mainMenu();
	}

}
