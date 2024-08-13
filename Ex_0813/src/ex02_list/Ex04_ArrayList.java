package ex02_list;

import java.util.ArrayList;
import java.util.List; // 컨트롤 슆 O 한번에 임포트

public class Ex04_ArrayList {

	public static void main(String[] args) {
		// ArrayList 데이터 얻기

		List<Integer> list = new ArrayList<>();
		// 1~30사이의 난수 10개를 lsit에 추가

		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 30) + 1);

		}
		System.out.println("짝수 :");
		for (int i = 0; i < list.size(); i++) {
			// List에서 각 index에 위치하는 값 가져오기
			int value = list.get(i);
			if (value % 2 == 0) {
				System.out.println(value + " ");
			}

		}
		
		//추가  add()
		//조회  get()
		//삭제  remove()
		//수정  set()
		//비어있냐? isEmpy()
		//크기가 몇이냐 size();
		//포함하고 있냐 contains();
		
		//배열의 크기 : 배열명.lengh
		//문자열의 크기 : 문자열.lengh()
		//컬렉션의 크기 : 컬랙션객체.size()
		
		//향상된 for문을 통해 출력할 수도 있다.
		for(int value : list) {
			System.out.println("값 : "+value);
		}
	}
	

}
