package ex05;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex03_stream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 5);// [1,2,3,4]마지막 번호 생략
		LongStream longStream = LongStream.range(1, 5);// [1,2,3,4,5]마지막 번호까지 출력
		
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		                                                      //int -> Integer로 만듬
		
	}
}
