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
		
		
		
		//3�� �ִ����� ����
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
		

		//7��
		
		//8��
		
		//9��
		
		//10��
		
		//11��
		
		//12��
		
		//13��
		
		//14��
		
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
		
		
		//19��
		
//		System.out.print("ù ���� �Է� (��~��) : ");
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
