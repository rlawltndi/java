package ex04_Generic;

public class Gen {
	//제네릭 메서드
	public <T> void printArr(T[] arr) {
		for (T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
