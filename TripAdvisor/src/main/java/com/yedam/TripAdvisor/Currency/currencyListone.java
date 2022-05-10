package com.yedam.TripAdvisor.Currency;

import java.util.List;
import java.util.Scanner;

public class currencyListone {
	Scanner sc = new Scanner(System.in);

	public void execute() {
		CurrencyDataImpl service = new CurrencyDataImpl();
		List<CurrencyDataVO> list = service.listCurrency();
		int cnt = 1;
		boolean run = true;
		for (int i = 0; i<7; i++) {
			System.out.printf("%d) %s %s", cnt++, list.get(i).getCountryId(), list.get(i).getCountryName());
			System.out.println();
			
		}
		while (run) {
			int pagenum = 1;
			if (pagenum == 1) {
				System.out.println("9) 다음으로\n0) 프로그램 종료");
			} else if (pagenum > 1) {
				System.out.println("8) 이전으로\n9) 다음으로\n0) 프로그램 종료");
			}
			System.out.println("****************************");
			System.out.printf("입력>>");
			int choice = sc.nextInt();
			if (choice < 8) {

			} else if (choice == 8) {
				page((pagenum+1));

			} else if (choice == 9) {
				page((pagenum+1));

			} else if (choice == 0) {
				System.out.println("프로그램 종료");
				run = false;
				return;
			}
		}
//		cnt => 9, 8반복.
		// 메소드 선언해서 이전값으로 돌릴수 있는방법/이후값으로 넘기는 방법 설정
		// 페이지넘버를 부여해서 9번->이전페이지 pagenum-- 10번->다음페이지 pagenum++
	}

	public int page(int pagenum) {
		CurrencyDataImpl service = new CurrencyDataImpl();
		List<CurrencyDataVO> list = service.listCurrency();
		
		int pageStart = 7 * (pagenum - 1);
		int pageEnd = (7 * pagenum) - 1;
		int cnt = 1;
		
		for (int i = 0 ; i <list.size(); i++) {
			if (i >= pageStart && i<=pageEnd) {
				System.out.printf("%d) %s %s", cnt++, list.get(i).getCountryId(), list.get(i).getCountryName());
				System.out.println();
			}
//			System.out.printf("%d) %s %s", cnt, vo.getCountryId(), vo.getCountryName());
//			System.out.println();
//			cnt++;
//			if (cnt == 7) {
//				break;
//			}
		}
		return pagenum++;
		

	}

	public int nextPaging(int count) {
		CurrencyDataImpl service = new CurrencyDataImpl();
		List<CurrencyDataVO> list = service.listCurrency();
		int save = count;
		int cnt = 1;
		int nextcnt = 1;
		for (CurrencyDataVO vo : list) {
			cnt++;
			if (cnt == count + 1) {
				System.out.printf("%d) %s %s", nextcnt++, vo.getCountryId(), vo.getCountryName());
				System.out.println();
				count++;
			} else if ((save + 8) < count) {
				save = count;
				break;
			}
		}

		return cnt;
	}

	public void CurList1() {
		System.out.println("1.USD 미국 달러");
		System.out.println("2.EUR 유럽연합 유로");
		System.out.println("3.JPY 일본 엔");
		System.out.println("4.CNH 중국 위안");
		System.out.println("5.AUD 호주 달러");
		System.out.println("6.CAD 캐나다 달러");
		System.out.println("7.HKD 홍콩 달러");
		System.out.println("8.SGD 싱가포르 달러");
		System.out.println("9.NZD 뉴질랜드 달러");
		System.out.println("0.다음 목록");
		System.out.println("****************************");
		System.out.print("입력>>");

		int currencyselect = sc.nextInt();
		boolean go = true;
		while (go) {
			switch (currencyselect) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				break;
			case 0:
				CurList21();
				break;

			}
		}
	}

	public void CurList21() {
		System.out.println("1.GBP 영국 파운드");
		System.out.println("2.THB 태국 바트");
		System.out.println("3.AED 아랍에미리트 디르함");
		System.out.println("4.ATS 오스트리아 실링");
		System.out.println("5.BEF 벨기에 프랑");
		System.out.println("6.BHD 바레인 디나르");
		System.out.println("7.CHF 스위스 프랑");
		System.out.println("8.DEM 독일 마르크");
		System.out.println("9.이전 목록");
		System.out.println("0.다음 목록");
		System.out.println("****************************");
		System.out.print("입력>>");
		int currencyselect = sc.nextInt();
		boolean go = true;
		while (go) {
			switch (currencyselect) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				CurList1();
				break;
			case 0:
				CurList3();
				break;

			}
		}
	}

	public void CurList3() {
		System.out.println("1.DKK 덴마크 크로네");
		System.out.println("2.ESP 스페인 페세타");
		System.out.println("3.FIM 핀란드 마르카");
		System.out.println("4.FRF 프랑스 프랑");
		System.out.println("5.IDR 인도네시아 루피아");
		System.out.println("6.ITL 이탈리아 리라");
		System.out.println("7.KWD 쿠웨이트 디나르");
		System.out.println("8.MYR 말레이시아 링기트");
		System.out.println("9.이전 목록");
		System.out.println("0.다음 목록");
		System.out.println("****************************");
		System.out.print("입력>>");
		int currencyselect = sc.nextInt();
		boolean go = true;
		while (go) {
			switch (currencyselect) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				CurList21();
				break;
			case 0:
				CurList4();
				break;

			}
		}
	}

	public void CurList4() {
		System.out.println("1.NLG 네덜란드 길더");
		System.out.println("2.NOK 노르웨이 크로네");
		System.out.println("3.SAR 사우디아라비아 리얄");
		System.out.println("4.SEK 스웨덴 크로나");
		System.out.println("5.XOF 서아프리카 프랑");
		System.out.println("9.이전 목록");
		System.out.println("0.계산기 종료");
		System.out.println("****************************");
		System.out.print("입력>>");
		int currencyselect = sc.nextInt();
		boolean go = true;
		while (go) {
			switch (currencyselect) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				break;
			case 9:
				CurList3();
				break;
			case 0:
				System.out.println("계산기를 종료합니다.");
				go = false;
				return;
			}
		}
		return; // 메소드 종료
	}

}
