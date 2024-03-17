package java0920;


import java.util.Scanner;
import java0921.*;

public class CandyDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CandyData cd = new CandyData();
		Scanner sc = new Scanner(System.in, "x-windows-949");
		Scanner sc2 = new Scanner(System.in);

		CandyBuget budget = CandyBuget.getBuget();
		CandyInven inv = CandyInven.getInstance();

		String op;
		String key;
		boolean runFlag = true;
		boolean noData = true;
		int quantity;
		int sum;
		int minus;
		int candyCnt = 0;
		
		CandyCustomerInfo[] csd = new CandyCustomerInfo[6];
		CandyEployeeExtends[] cee = new CandyEployeeExtends[4];
		
		
		for (int i = 0; i < csd.length; i++)
			csd[i] = new CandyCustomerInfo();

		for (int i = 0; i < cee.length; i++)
			cee[i] = new CandyEployeeExtends();

		csd[0].setCusInfo("오성숙", "2010/05/01", "010-1111-2222", 60, "121212-34343434");
		csd[1].setCusInfo("임창영", "2009/07/03", "010-1234-5678", 65, "765455-99887766");
		csd[2].setCusInfo("박현우", "2007/04/11", "010-3232-8787", 70, "635675-22554433");
		csd[3].setCusInfo("이헌우", "2004/12/08", "010-7766-4422", 69, "385451-54638991");
		csd[4].setCusInfo("신성영", "2003/06/22", "010-7755-6543", 77, "325648-94684681");
		csd[5].setCusInfo("이유환", "2003/06/22", "010-7755-6543", 77, "325648-94684681");

		cee[0].setInfo("토순이", "2000/01/01", "010-0000-0000", 50, "432311-7647653", "사장", "경영");
		cee[1].setInfo("춘식이", "2000/01/02", "010-5422-8764", 49, "653544-9876346", "부장", "카운터");
		cee[2].setInfo("망글곰", "2000/02/04", "010-3426-8637", 44, "876546-2332329", "직원", "매장관리");
		cee[3].setInfo("치이카와", "1999/03/04", "010-3226-8333", 11, "876546-2332329", "직원", "주방관리");

		System.out.println("고객번호\t고객이름\t가입날짜\t\t전화번호\t\t나이\t계좌번호");
		for (int i = 0; i < csd.length; i++)
			System.out.println(csd[i].getAllCusInfo());

		System.out.println("================================================================================");
		System.out.println("직원번호\t직원이름\t입사날짜\t\t전화번호\t\t나이\t계좌번호\t직급\t담당업무");
		for (int i = 0; i < cee.length; i++)
			System.out.println(cee[i].getAllCusInfo());

		while (runFlag) {
			System.out.println("================================================================================");
			System.out.println("1.고객전체조회\n2.직원전체조회\n3.고객검색\n4.직원검색\n5.거래\n6.거래포인트조회\n7.직원별실적조회"
					+ "\n8.전체판매실적조회\n9.직급변경\n10.잔고조회\n11.월급지급\n12.재고조회\n13.재고입고\n14.판매수량\n15.종료");
			System.out.print(">>");
			op = sc.next();

			switch (op) {

			case "15": // 종료
				runFlag = false;
				break;
				
			case "1": // 고객 전체 조회
				System.out.println("고객번호\t고객이름\t가입날짜\t\t전화번호\t\t나이\t계좌번호");
				for (int i = 0; i < csd.length; i++)
					System.out.println(csd[i].getAllCusInfo());
				break;

			case "2": // 직원 전체 조회
				System.out.println("직원번호\\t직원이름\\t입사날짜\\t\\t전화번호\\t\\t나이\\t계좌번호\\t직급\\t담당업무");
				for (int i = 0; i < cee.length; i++)
					System.out.println(cee[i].getAllCusInfo());
				break;

			case "3" : // 고객 검색
				System.out.print("고객이름 : ");
				key = sc.next();
				for(int i=0;i < csd.length;i++)
					if(csd[i].getName().equals(key)) {
						System.out.println(csd[i].getAllCusInfo());
						noData = false;
					}
				if(noData)
					System.out.println("대상이 없습니다.");					
				noData = true;
				
				break;
			
			case "4" : //직원 검색
				System.out.print("직원이름 : ");
				key = sc.next();
				for(int i=0;i < cee.length;i++)
					if(cee[i].getName().equals(key)) {
						System.out.println(cee[i].getAllInfo());
						noData = false;
					}
				if(noData)
					System.out.println("대상이 없습니다.");					
				noData = true;
				break;
				
			case "5" : // 거래
				System.out.print("판매한 직원이름 : ");
				key = sc.next();
				for(int i=0;i < cee.length;i++)
					if(cee[i].getName().equals(key)) {
						cee[i].doSale();
						noData = false;
					}
					
				if(noData) {
					System.out.println("대상이 없습니다.");
					break;
				}
				noData = true;
				
				
				System.out.print("구매한 고객이름 : ");
				key = sc.next();
				for(int i=0;i < csd.length;i++) {
					if(csd[i].getName().equals(key)) {
						System.out.println("구매한 탕후루 종류 : 딸기 샤인머스킷 포도 귤 >>");
						key = sc.next();
						minus = 0;
						noData = false;
						switch(key) {
							
							case "딸기" :
								System.out.print("수량: ");
								minus = sc.nextInt();
								System.out.println(minus+" 개를 구매");
						        if (inv.isSoldOut(key)) {
						            System.out.println("품절되었습니다");
						            break;
						        }
								budget.doDeposit(4000*minus); 
								inv.sale(key, minus);
								budget.setCntPerDay(minus);
								csd[i].doPurchase();								
								break;
						
							case "샤인머스킷" :
								System.out.print("수량: ");
								minus = sc.nextInt();
								System.out.println(minus+" 개를 구매");
						        if (inv.isSoldOut(key)) {
						            System.out.println("품절되었습니다");
						            break;
						        }
								budget.doDeposit(5000*minus); 
								inv.sale(key, minus);
								budget.setCntPerDay(minus);
								csd[i].doPurchase();								
								break;
									
							case "포도" :
								System.out.print("수량: ");
								minus = sc.nextInt();
								System.out.println(minus+" 개를 구매");
						        if (inv.isSoldOut(key)) {
						            System.out.println("품절되었습니다");
						            break;
						        }
								budget.doDeposit(4000*minus); 
								inv.sale(key, minus);
								budget.setCntPerDay(minus);
								csd[i].doPurchase();								
								break;
								
							case "귤" :
								System.out.print("수량: ");
								minus = sc.nextInt();
								System.out.println(minus+" 개를 구매");
						        if (inv.isSoldOut(key)) {
						            System.out.println("품절되었습니다");
						            break;
						        }
								budget.doDeposit(6000*minus); 
								inv.sale(key, minus);
								budget.setCntPerDay(minus);
								csd[i].doPurchase();								
								break;
								
						}			
					}
				}
				
			if(noData)
				System.out.println("대상이 없습니다.");					
			noData = true;
				
				break;			
				
			case "6": // 포인트 조회
				System.out.print("고객이름 : ");
				key = sc.next();
				for (int i = 0; i < csd.length; i++)
					if (csd[i].getName().equals(key))
						System.out.println(csd[i].getPoint() + "점 입니다.");
				break;
				
			case "7": // 직원별실적조회
				System.out.print("직원이름 : ");
				key = sc.next();
				for (int i = 0; i < cee.length; i++)
					if (cee[i].getName().equals(key))
						cee[i].showSalePerform();
				break;
				
			case "8": // 전체 판매 실적 조회
				sum = 0;
				for (int i = 0; i < cee.length; i++) {
					sum += cee[i].getSalePerform();
					cee[i].showSalePerform();
				}
				System.out.println("전체 " + sum + "개 판매하였습니다.");
				break;
				
				
				
			case "9" : // 직급변경
				System.out.print("직원이름 : ");
				key = sc.next();
				for(int i=0;i < cee.length;i++)
					if(cee[i].getName().equals(key)) {
						System.out.print("변경할 직급 : ");
						String pos = sc.next();
						cee[i].setPosition(pos);
						System.out.println(cee[i].getName()+"의 직급이 "+cee[i].getPosition()+"으로 변경되었습니다.");
					}
				break;
				
				
			case "10" : // 잔고조회
				System.out.println(budget.getBalance()+"원 입니다.");
				break;
				
			case "11" : // 월급지급
				System.out.print("직원이름 : ");
				key = sc.next();
				for(int i=0;i < cee.length;i++)
					if(cee[i].getName().equals(key))
						cee[i].giveSalary();
				break;

			case "12" : // 재고조회
				System.out.println("딸기 : " + inv.getstawberry() + "개");
				System.out.println("샤인머스킷 : " + inv.getShineMusket() + "개");
				System.out.println("포도 : " + inv.getGrape() + "개");
				System.out.println("귤 : " + inv.getTangerine() + "개");
				break;
				
			case "13" : // 재고 입고 
				System.out.println("과일 :");
				key = sc.next();
				System.out.println("수량 :");
				sum = sc.nextInt();
				inv.store(key, sum);
				break;		

			case "14" : // 총 판매 수량 				
				System.out.println("오늘 총 판매한 수량은 " + budget.getCntPerDay() + "개 입니다.");
				break;
				
			default:
				System.out.println("이해할 수 없는 명령입니다.");
			}

		}

		System.out.println("종료되었습니다.");
	}

}
