package com.yedam.TripAdvisor.List;

import java.util.Scanner;

import com.yedam.TripAdvisor.Main;
import com.yedam.TripAdvisor.Currency.CurrencyApp;
import com.yedam.TripAdvisor.Member.MemberVO;

import MyPage.MypageMethod;

public class AppList {
	

	
	// 메뉴 출력 1.~5.
	public void MainList() {
		Main main = new Main();
		System.out.println("****************************");
		System.out.println();
		System.out.println("    환영합니다. 트립 어드바이저    ");
		System.out.println();
		System.out.println("****************************");
		System.out.println("원하는 메뉴를 선택해주세요.");
		System.out.println("**1.여행지검색");
		System.out.println("**2.커뮤니티");
		System.out.println("**3.마이페이지");
		System.out.println("**4.환율계산기");
		System.out.println("**5.로그아웃");
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		int menuselect = sc.nextInt();
		boolean run = true;
		while (run) {
			switch (menuselect) {
			case 1:
				AppList.Sights();

			case 2:
				AppList.Community();

			case 3:
				AppList.Mypage();

			case 4:
				AppList.Currency();
				break;

			case 5:
				Logout();
				run = false;
				break;
			}
		}
	}

	// 메뉴1.
	private static void Sights() {

	}

	// 메뉴2.
	private static void Community() {

	}

	// 메뉴3.
	private static void Mypage() {
		System.out.println("****************************");
		System.out.println();
		System.out.println("        마 이 페 이 지         ");
		System.out.println();
		System.out.println("****************************");
		System.out.println("1.내정보\n2.관심여행지\n3.내게시글\n4.돌아가기");
		System.out.println("입력>>");
		Scanner sc = new Scanner(System.in);
		int mypageSelect = sc.nextInt();
		boolean run = true;
		MypageMethod mypageMethod = new MypageMethod();
		while(run) {
			switch(mypageSelect) {
			case 1:
				//실행되는지 확인 필요
				MemberVO member = new MemberVO();
				member.toString();
			case 2:
				
			case 3:
			case 4:
				System.out.println("메뉴로 돌아갑니다.");
				return;
			}
		}

	}

	// 메뉴4.
	private static void Currency() {
		CurrencyApp CRUN = new CurrencyApp();
		CRUN.Crun();

	}
	public void Logout() {
		// 로그아웃하면 로그인화면으로 돌아가거나 시스템이 종료되도록 설정
		System.out.println("시스템 로그아웃 중입니다.");
		System.out.println("다음에 또 만나요!");

	}
}
