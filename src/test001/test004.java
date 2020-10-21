package test001;

public class test004 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//1번
//		int a = 2;
//		int b = 1;
//		b++;
//		
//		while(b<15) {
//			a += 1;
//			b += a;
//		}
//		System.out.println("a 값 : " + a + " b값 : " + b);
//		
//
//		for(b++; b<15; b+=a) {
//			
//		}
//		System.out.println("a 값 : " + a + " b값 : " + b);
		
		//2번 

		
//		for(int i=1; i<=100; i++) {
//			System.out.print(i+"의 약수:");
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					System.out.print(j+",");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		//3번 최대공약수 안함
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i;
//		
//		System.out.print("둘의 공통된 약수:");
//		for(i=1; i<=100; i++) {
//			if(a%i==0&&b%i==0) {
//				System.out.print(i+" ");
//			}
//			
//		}
		

		
		//4번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("숫자입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i;
//		
//		for(i=a; i>0; --i) {
//			if(a%i==0 && b%i==0) {
//				System.out.print("최대 공약수"+i);
//				break;
//			}
//		}
		
		
		//5번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		int sum=0;
//		
//		for(int i=a; i<=100; i++) {
//			sum += i;
//			if(sum>100)
//				break;
//			System.out.println(sum);
//			
//		}
		
		
		//6번
		

		//7번
		
		//8번
		
		//9번
		
		//10번
		
		//11번
		
		//12번
		
		//13번
		
		//14번
		
		//15번
//		System.out.print("1-9 중 선택");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		for(int i=a; i<=a; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+" ");
//			}
//			System.out.println();
//		}
		
		
		//16번
//		System.out.print("숫자입력");
//		int a = Integer.parseInt(sc.nextLine());
//		int count=0;
//		
//		
//		for(int i=1; i<=1000; i++) {
//			if(i%a==0) {
//				System.out.println(i);
//				count++;
//		}
//			
//		}
//		System.out.println(a + "의 배수 개수는 " + count + "개");
		
		
		//17번
//		System.out.print("행입력");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("열입력");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i,j,k=1;
//		
//		for( i=1; i<=a; i++) {
//			for( j=1; j<=b; j++) {
//				System.out.print(k+"\t");
//				k++;
//				if(k>100) {
//					break;
//				}
//			}
//			System.out.println();
//		}
		

		//18번
		
//		int i,j,k=1;
//		for(i=1; i<=4; i++) {
//			if(i==1) {
//				for(j=1; j<=5; j++) {
//				System.out.print(k+"\t");
//				k++;
//				}
//			}else if(i==2) {
//				k=10;
//				for(j=1; j<=5; j++) {
//					System.out.print(k+"\t");
//					k--;
//				}
//			}else if(i==3) {
//				k=11;
//				for(j=1; j<=5; j++) {
//					System.out.print(k+"\t");
//					k++;
//					}
//			}else if(i==4) {
//				k=21;
//				for(j=1; j<=5; j++) {
//					System.out.print(k+"\t");
//					k++;
//				}
//			}
//			System.out.println();
//		}
		
		
		//19번
		
//		System.out.print("첫 요일 입력 (일~토) : ");
//		String days=sc.nextLine();
//		System.out.print("마지막 일 입력 (~31): ");
//		int last=Integer.parseInt(sc.nextLine());
//		int day;
//		
//		
//		System.out.println();
//		System.out.print("일\t월\t화\t수\t목\t금\t토");
//		System.out.println();
//		
//		switch(days) {
//		case "일":
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if(day%7==0)
//				System.out.println();
//			}
//			break;
//		case "월":
//			System.out.print("\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+1)%7==0)
//				System.out.println();
//			}
//			break;
//		case "화":
//			System.out.print("\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+2)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "수":
//			System.out.print("\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+3)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "목":
//			System.out.print("\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+4)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "금":
//			System.out.print("\t\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+5%7)==0)
//				System.out.println();
//			}
//			break;
//		case "토":
//			System.out.print("\t\t\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+6)%7==0)
//				System.out.println();
//			}
//			break;
//		default:
//			System.out.print("입력 오류");
//		}
		
		//20번 
//		int right=0;
//		int wrong=0;
//
//		while(true) {
//		System.out.print("선택(0.앞면 1.뒷면 3.종료) : ");
//		int or=Integer.parseInt(sc.nextLine());
//		int coin = (int)(Math.random()*2);
//		if(or==coin) {
//			right++;
//		}else {
//			wrong++;
//		}
//		if(or==3) {
//		System.out.print("총"+(right+wrong)+"번의 게임 중  맞춘횟수:"+right+"틀린횟수:"+wrong);
//			break;
//		}
//		System.out.println("결과 / 내 선택:"+or+" 컴퓨터 값:"+coin+" 맞춘횟수 : "+right+", 틀린횟수 : "+wrong+" /총 게임 실행 횟수:"+(right+wrong)+"\n");
//		}

		//21번
		
//		int right=0;
//		int wrong=0;
//		
//		
//		
//
//		while(true) {
//			System.out.print("주사위 값 입력 / 7.종료 : ");
//			int die=Integer.parseInt(sc.nextLine());
//			
//			int dice = (int)(Math.random()*6)+1;
//			
//			if(die==dice) {
//				right++;
//			}else {
//				wrong++;
//			}
//			if(die==7) {
//				System.out.print("총"+(right+wrong)+"번의 게임 중 맞춘횟수 : "+right+"  틀린횟수 : "+wrong);
//				break;
//			}
//			System.out.println("결과 / 내 주사위:"+die+" 컴퓨터 주사위:"+dice+" 맞춘횟수 : "+right+", 틀린횟수 : "+wrong+" /총 게임 실행 횟수:"+(right+wrong)+"\n");
//			
//			
//		}
	
		
	}

}
