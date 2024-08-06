package ex03_array;
import java.util.Scanner;
public class Ex10_multi_array {

	public static void main(String[] args) {
		//1~25가지 2차원배열 arr에 순차적으로 넣고
		//한줄에 다섯개씩 출력하기
		
		//01 02 03 04 05
		//06 07 08 09 10
		//11 12 13 14 15
		//16 17 18 19 20
		//21 22 23 24 25
		
		int[][]arr = new int [5][5];
		int count= 1;
		for(int i = 0; i < 5; i++) {
			for(int j =0; j <5; j++) {
				arr[i][j] =count++;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(arr[i][j]+" ");
			}	
		}System.out.println();{
			
			

	}
}

	//로또 번호 맞추기
		int[][] lotto = {{2,6,11,33,42,44},
				{1,6,17,22,24,33},
				{7,16,24,33,45,9},
				{27,42,35,21,43},
				{6,16,22,24,33,41}};{
					System.out.println("--------------------");{
						
					
		Scanner scan = new Scanner(System.in);
		//키보드에서 당첨숫자를 연속으로 6개를 입력받아 myNum에 넣는다.
		String myNum = "";
		boolean isWin = false;
		
		System.out.println("당첨숫자 6개를 입력하세요. : ");
		myNum = scan.next();  //123456
		
		for(int i = 0; i< lotto.length; i++) {
			String lottoNumber = "";
			//하나의 일차원배열에 있는 숫자들을 문자열로 합친다.
			for(int j=0; j<lotto[i].length; i++) {
				lottoNumber += lotto[i][j];
				
			}
			if(myNum.equals(lottoNumber)) {
				isWin = true;
				break;
			}
			
		}
		if(isWin ) { 
			System.out.println(myNum+ "번호 당첨");
			
		}else {
			System.out.println(myNum+"번호는 당첨되지 못했습니다.");
		}
		//2차원배열에 들어있는 1차원 배열 5개중 하나라도 완전히 일치하는
		//곳이 있으면 당첨,아니면 당첨되지 못했습니다. 출력하기
		//myNum.equals();    같으면 true, 다르면 fales
		
		
					}
				}
}
		
		
		
		
		
		
		



	
