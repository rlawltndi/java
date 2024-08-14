package ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


public class Ex02_bingo {

	public static void main(String[] args) {
		// HashSet과 ArrayList를 이용하여 5*5 빙고판 만들기
		// 1~50난수 만들기
		// ArrayList<Integer>list = new ArrayList<Integer>();
		// Collections.shuffle(list);
		HashSet<Integer> set = new HashSet<>();

		while (set.size() != 25) {
			set.add(new Random().nextInt(50) + 1);
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);

		int[][] board = new int[5][5];//2차원배열은 1차원 배열을 요소 {{1,2,3,4,5},{6,7,8,9,10},...}

		int count = 0;
		for (int i = 0; i < board.length; i++) { //X5
			for (int j = 0; j < board[i].length; j++) { //X5
				board[i][j] = list.get(count++);
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
	}

}
