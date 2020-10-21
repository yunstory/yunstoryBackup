package test001;

public class test004 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//1번
//		int a = 2;
//		int b = 1;
//		b ++ ;
//		
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
//			System.out.println(sum);
//			if(sum>100)
//				break;
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
		System.out.print("행입력");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("열입력");
		int b = Integer.parseInt(sc.nextLine());
		
		int i,j,k;
		
		for( i=1; i<=a; i++) {
			for( j=1; j<=b; j++) {
				for( k=1; k<=b; k++) {
					if(k==100) {
						break;
					}
					System.out.print(k);
				}
				System.out.println();
			}
		}
		//18번
		
		//19번
		
		//20번
		
		//21번
		
		
		
		
		
		
		
	}

}
