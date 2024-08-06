package ex01_switch;
import  java.util.Scanner;
public class Ex05_switch {

	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받는다.
		//해당 숫자가 짝수인지 홀수인지 판별하는 출력하는 코드를
		//switch로 작성해주세요
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자:");
		int num = scan.nextInt();
		
		switch(num) {
		case 1 , 3, 5,7,9 -> System.out.println("홀수");
		case 2 ,4,6,8,10 -> System.out.println("짝수");
		default -> System.out.println("잘못된입력입니다.");
		}
		//짝수올수 판별
		//2로 나눈 나머지가 0이나 1이냐
		switch(num % 2) {
		case 0 -> System.out.println("짝수");
		case 1-> System.out.println("홀수");
		
		}
		//-----------------------------------------------------------------------------------
		//키보드에서 달(month)를 입력받아
		//해당 달이 몇일까지 있는지 switch문을 이용해 작성해주세요
		//결과
		//x월은 x일까지 있습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,9,11 -> System.out.println(month+"월은 31일까지 있습니다.");
		case 4,6,8,10,12 -> System.out.println(month+"월은 30일까지 있습니다.");
		case 2 -> System.out.println(month+"월은 28일까지 있습니다.");
		default -> System.out.println(month+"잘못입력하셨습니다,1~12사이의 숫자만 입력하세요.");
		}
		
		//------------------------------------------------------------------------------------
		//계산기 프로그램만들기
		//두 개의 정수를 입력받는다.
		//산술연산자를 만자열에 담는다 ex)"+"
		//switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		System.out.print("정수1 입력 : ");
		int num1= sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int num2= sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		 
		switch(op) {
		case "+" -> System.out.printf("%d + %d = %d\n", num1 , num2,(num1+num2));
		case "-" -> System.out.printf("%d - %d = %d\n", num1 , num2,(num1-num2));
		case "*" -> System.out.printf("%d * %d = %d\n", num1 , num2,(num1*num2));
		//수학적인 나누기를 하려면 숫자 하나를 double로 형변환을 하면 된다.
		case "/" -> System.out.printf("%d / %d = %f\n", num1 , num2,(double)(num1/num2));
		}
		{
		
		
		}
		
	

	}

}
