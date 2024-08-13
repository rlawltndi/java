package ex02_list;

import java.util.ArrayList;
import java.util.LinkedList;


public class Ex05_LinkedList {

	public static void main(String[] args) {
		// ArrayList와 LinkedList의 성능 비교

		// ArrayList 선언
		ArrayList<Integer> arrayList = new ArrayList<>();
		// 삽입,삭제,수정,조회
		// LinkedList선언
		LinkedList<Integer> linkedList = new LinkedList<>();
		// 자료구조에 데이터 삽입시 걸리는 시간을 비교
		long startTime = System.nanoTime();
		// ArrayList와LinkedList에 1000000데이터 추가하기
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);

		}
		long endTime = System.nanoTime();

		long duration = endTime - startTime;

		System.out.println("ArrayList 추가시간 : " + duration);

		startTime = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);

			endTime = System.nanoTime();
			duration = endTime - startTime;
			System.out.println("LinkedList 추가시간 : " + duration);

			System.out.println("---------------------------------------------------");

			// 특정위치에 삽입하는 시간을 비교
			startTime = System.nanoTime();
			arrayList.add(99, 100);
			endTime = System.nanoTime();

			duration = endTime - startTime;
			System.out.println("ArrayList 삽입시간 : " + duration);
			
			// LinkedList 의 삽입시간
			startTime = System.nanoTime();
			linkedList.add(99, 100);
			endTime = System.nanoTime();

			duration = endTime - startTime;
			System.out.println("LinkedList 삽입시간 : " + duration);

			System.out.println("---------------------------------------------------");
			
			startTime = System.nanoTime();
			for(int i = 9999; i >= 0; i--) {
				arrayList.remove(i);

			}
			endTime = System.nanoTime();

			duration = endTime - startTime;
			System.out.println("ArrayList 지우기 : " + duration);

			// LinkedList
			startTime = System.nanoTime();
			for(int i = 9999; i >= 0; i--) {
				linkedList.remove(i);

			}
			endTime = System.nanoTime();

			duration = endTime - startTime;
			System.out.println("LinkedList 지우기 : " + duration);

			// ArrayList는 삽입,삭제가 잘 일어나지 않는 경욱에 사용
			// LinkedList의 경우 삽입,잣제가 빈번하게 일어나는 경우에 사용

		}

	}

}
