package ex02_scanner;

import  java.util.Scanner;


public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		
		int age = scan.nextInt();
		System.out.printf("제 나이는 %d세 입니다.\n" ,age);
		System.out.println("--------");
		//제 이름은 김지수입니다.
		//제 나이는 28살입니다.
		//제 주소는 인천입니다.
		//제키는 182.0cm입니다.
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력하세요 : ");
		int myAge = scan.nextInt();
		scan.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = scan.nextLine();
		System.out.printf("키를 입력하세여 : ");
		float height = scan.nextFloat();
		
		
		
		System.out.printf("제 이름은 %s입니다.\n",name);
		System.out.printf("제 나이는 %d세입니다.\n",age);
		System.out.printf("제 주소는 %s입니다.\n",address);
		System.out.printf("제 키는 %.1fcm입니다.\n", height);
		
	
		
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
	

	}

}
