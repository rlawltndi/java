package ex03_method;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		//TimesTable객체생성
		int num;
		TimesTable tt = new TimesTable();
		Scanner sc =new Scanner(System.in);
			System.out.println("출력할 단을 입력 :");
			
			num=sc.nextInt();
			
			tt.showTable(num);
			
		
		

	}

}
