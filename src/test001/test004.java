package test001;

public class test004 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//1��
//		int a = 2;
//		int b = 1;
//		b++;
//		
//		while(b<15) {
//			a += 1;
//			b += a;
//		}
//		System.out.println("a �� : " + a + " b�� : " + b);
//		
//
//		for(b++; b<15; b+=a) {
//			
//		}
//		System.out.println("a �� : " + a + " b�� : " + b);
		
		//2�� 

		
//		for(int i=1; i<=100; i++) {
//			System.out.print(i+"�� ���:");
//			for(int j=1; j<=i; j++) {
//				if(i%j==0) {
//					System.out.print(j+",");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		//3�� 
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i;
//		
//		System.out.print("���� ����� ���:");
//		for(i=1; i<=100; i++) {
//			if(a%i==0&&b%i==0) {
//				System.out.print(i+" ");
//			}
//			
//		}
		
		//��Ǯ�� 
		
//		int a=10;
//		int b=20;
//		int i=1;
//		
//		
//		for(i=0; i<a; i++) {
//		if(a%i==0) { // ������ 0 �̸� ���
//			System.out.println(i);
//			}
//		}
//		
//		for(i=0; i<b; i++) {
//		if(b%i==0) { // ������ 0 �̸� ���
//			System.out.println(i);
//			}
//		}
//		
//		//�����
//		
//		int ab=a<b?a:b; //���׿����� ?���� true �̸� a: ?����  false�̸� :b ���� ����
//		for(i=1; i<=ab; i++) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i);
//			}
//		}
//		
//		
//		
//		//���� ū ���� ������ �ϴ� �� ������ ���� ������ ��
//		
//		int ab=a<b?a:b; 
//		int max=1;
//		for(i=1; i<=ab; i++) {
//			if(a%i==0 && b%i==0) {
//				max=i;
//				System.out.println(i);
//			}
//		}
//		System.out.println(max);
		
		

		
		//4��
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i;
//		
//		for(i=a; i>0; --i) {
//			if(a%i==0 && b%i==0) {
//				System.out.print("�ִ� �����"+i);
//				break;
//			}
//		}
		
		
		//5��
//		System.out.print("�����Է�");
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
		
		
		//6��
//		int count=0, missCount=0, sum=0;
//		
//		for(int i=1; i<=3; i++) {
//			System.out.println("�� ���� �����Է�");
//			int a=Integer.parseInt(sc.nextLine());
//			if(1<=a && a<=10) {
//				count++;
//				sum += a;
//			}else {
//				missCount++;
//			}
//		}
//		System.out.println("�߸��Է��� �� : "+missCount+" /�ùٸ��Է� �� : "+count+" /�ùٸ� �Է� ���� ���� : "+sum);

		
		
		//7��
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int num=0;
//		
//		for(int i=a; i<=a*b; i++) {
//			if(i%a==0 && i%b==0) {
//				num=i;
//				break;
//			}
//		}
//		System.out.println("�ּ� �����: " + num);
		
		//��Ǯ��
//		//2 �� ������ϱ� i�� 2�� ������� �Ǻ��ϸ鼭 i�� �����غ���
//		int result=0;
//		for(int i=1; i<100; i++) {
////			if(i%2==0) {
////				System.out.println(i);
////			}
////			if(i%3==0) {
////				System.out.println(i);
////			}
//			
////			if(i%2==0||i%3==0) {
////				System.out.println(i);
////			}
//			
//			if(i%2==0&&i%3==0) {
//				result=i;
//				System.out.println(i);
//				break;
//			}
//		}
//		System.out.println(result);
		
		
		//8��
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		int max,min;
//		
//		if (a>b){
//			max=a;
//			min=b;
//		}else {
//			max=b;
//			min=a;
//		}
//		if(max>c) {
//			max=max;
//			min=c;
//		}else {
//			max=c;
//			min=min;
//		}
//		
//		System.out.println("���� ū �� �� : " + max + " ���� ���� �� : " + min);

		
		
		//9��
//		int count=0;
//		
//		for(int i=1; i<=5; i++) {
//			System.out.print("�����Է� : ");
//			int score=Integer.parseInt(sc.nextLine());
//			
//			if(score<=60) {
//				count++;
//			}
//		}
//		System.out.println("Ż���� : " + count);
		
		//��Ǯ��
		
//		int failCount=0; //Ż���� ��
//		
//		for(int i=0; i<5; i++) {
//			int input = Integer.parseInt(sc.nextLine());
//			if(input<=100) {
//				if(input<=60) {
//					failCount++;
//				}
//			}else {
//				i--;
//			}
//			
//		}
//		System.out.println(failCount);
		
		
		//10��		
//		int sum=0;
//		for(int i=1; i<=100; i++) {
//			sum += i;
//			if(sum>100) {
//				break;
//			}
//			System.out.println(i+":"+sum);
//		}
		
		//��Ǯ��
//		int sum=0;
//		for(int i=0; sum<100; i++) {
//			if(sum<100) {
//				sum += i;
//				if(sum>100) {
//					break;
//				}
//				System.out.println(i+":"+sum);
//			}
//		}
		
		
		
		//11��
		
//		System.out.print("���ڿ��Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int i=0;
//		
//		while(i<=a) {
//			System.out.println(b);
//			i++;
//		}


		
		
		//12��
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		int sum=0;
//
//		if(a>b) {
//			int temp = a;
//			a = b; 
//			b = temp;
//		}
//		for(int i=a+1; i<b; i++) {
//			sum += i;
//
//		}
//		System.out.println("�� �� ������ �� : " + sum);
		
		
		//13��
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		for(;;) {
//		if(a%2==1) {
//			System.out.println("�Ҽ�");
//			break;
//		}else {
//			System.out.println("�Ҽ��ƴ�");
//			break;
//		}
//		}
		
		
		//14��
//		System.out.print("�����Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("�����Է�");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		for(int i=0; i<b; i++) {
//			System.out.println(a);
//			a++;
//		}


		
		//15��
//		System.out.print("1-9 �� ����");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		for(int i=a; i<=a; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+" ");
//			}
//			System.out.println();
//		}
		
		
		//16��
//		System.out.print("�����Է�");
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
//		System.out.println(a + "�� ��� ������ " + count + "��");
		
		
		//17��
//		System.out.print("���Է�");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.print("���Է�");
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
//		

		//18��
		
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
		
		//��Ǯ��
//		int count=5;
//		int lineCount=0;
//		int total=25;
////		for(int i=1; i<=25; i++) {
////			if(i%5==1) {
////				System.out.print(i+"\t");
////			}else {
////				System.out.print(i+"\t");
////			}
////			if(i%5==0) {
////				System.out.println();
////			}
////		}
//		for(int i=1; i<=total+1; i++) {
//			if(i%count==1) {
//				lineCount++;
//			}
//			if(lineCount%2==0) {
//				System.out.print(count*lineCount-(i-1)%5+"\t");
//			}else {
//				System.out.print(i+"\t");
//			}
//			if(i%count==0) {
//				System.out.println();
//			}
//		}
		
		
		//19��
		
//		System.out.print("���� �Է� (��~��) : ");
//		String days=sc.nextLine();
//		System.out.print("������ �� �Է� (~31): ");
//		int last=Integer.parseInt(sc.nextLine());
//		int day;
//		
//		
//		System.out.println();
//		System.out.print("��\t��\tȭ\t��\t��\t��\t��");
//		System.out.println();
//		
//		switch(days) {
//		case "��":
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if(day%7==0)
//				System.out.println();
//			}
//			break;
//		case "��":
//			System.out.print("\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+1)%7==0)
//				System.out.println();
//			}
//			break;
//		case "ȭ":
//			System.out.print("\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+2)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "��":
//			System.out.print("\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+3)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "��":
//			System.out.print("\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+4)%7==0) 
//				System.out.println();
//			}
//			break;
//		case "��":
//			System.out.print("\t\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+5%7)==0)
//				System.out.println();
//			}
//			break;
//		case "��":
//			System.out.print("\t\t\t\t\t\t");
//			for(day=1; day<=last; day++) {
//			System.out.print(day+"\t");
//			if((day+6)%7==0)
//				System.out.println();
//			}
//			break;
//		default:
//			System.out.print("�Է� ����");
//		}
		
		//20�� 
//		int right=0;
//		int wrong=0;
//
//		while(true) {
//		System.out.print("����(0.�ո� 1.�޸� 3.����) : ");
//		int or=Integer.parseInt(sc.nextLine());
//		int coin = (int)(Math.random()*2);
//		if(or==coin) {
//			right++;
//		}else {
//			wrong++;
//		}
//		if(or==3) {
//		System.out.print("��"+(right+wrong)+"���� ���� ��  ����Ƚ��:"+right+"Ʋ��Ƚ��:"+wrong);
//			break;
//		}
//		System.out.println("��� / �� ����:"+or+" ��ǻ�� ��:"+coin+" ����Ƚ�� : "+right+", Ʋ��Ƚ�� : "+wrong+" /�� ���� ���� Ƚ��:"+(right+wrong)+"\n");
//		}

		//21��
		
//		int right=0;
//		int wrong=0;
//		
//		
//		
//
//		while(true) {
//			System.out.print("�ֻ��� �� �Է� / 7.���� : ");
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
//				System.out.print("��"+(right+wrong)+"���� ���� �� ����Ƚ�� : "+right+"  Ʋ��Ƚ�� : "+wrong);
//				break;
//			}
//			System.out.println("��� / �� �ֻ���:"+die+" ��ǻ�� �ֻ���:"+dice+" ����Ƚ�� : "+right+", Ʋ��Ƚ�� : "+wrong+" /�� ���� ���� Ƚ��:"+(right+wrong)+"\n");
//			
//			
//		}
	
		
	}

}
