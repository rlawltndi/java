package ex02_Thread;

import java.util.Random;
import java.util.Scanner;

class startGame extends Thread {
	private int n;

	public startGame(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("스레드 출력 :" + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}

		}

	}
}

public class QuizThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}