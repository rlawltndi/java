package ex02_Thread;

import java.util.Scanner;

class ThreadCount extends Thread {

	private int n;

	public ThreadCount(int n) {
		this.n = n;

	}

	@Override
	public void run() {
		for (int i = n; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
}

public class ThreadsCountMain {
	// 스캐너를 통해 숫자를 입력받고
	// 스레드에서 입력받은 숫자 1씩 감소하다가 0이되었을때
	// "종료"라는 메시지와 함께 스레드 종료
	// ThreadCount클래스에 스레드 정의하기
	public static void main(String[] args) {
		System.out.println("값을 입력 : ");
		Scanner sc = new Scanner(System.in);
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
	}

}
