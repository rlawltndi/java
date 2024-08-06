package ex03_method;

import java.util.Random;

public class Graph {

	public static void main(String[] args) {
		int[] num = new int[100]; // 난수를 담을 배열

		int[] count = new int[10]; // 발생한 난수가 각각 몇개인지 저장할 배열
		
		Random rnd = new Random(); //random클래스의 객체 생성
		
		for(int i =0; i< num.length; i++) {
			//0~9사이의 난수 100개 저장
			num[i] = rnd.nextInt(10);
			System.out.print(num[i]+" ");
		}
		PrintGraph pg = new PrintGraph();
	//100개의 난수를 각 숫자별로 몇개씩 나왔는지 count배열에 저장
	for(int i : num) {
	}count[i]++;
		System.out.println();
		
	for(int i=0; i< count.length; i++){
			System.out.println(i+"의 갯수 : "+pg.print('#', count[i]);
		}
	}


}