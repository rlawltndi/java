package ex03_method;

public class MidTermMain {

	public static void main(String[] args) {
		int[] student1 = { 70, 90 };
		int[] student2 = { 70, 95 };

		MidTerm mid = new MidTerm();
		int sumA = mid.score(student1);
		int sumB = mid.score(student2);

		if (sumA > sumB) {
			System.out.println("A학생의 성적이 B학생의 성적보다 좋습니다.");
		} else if (sumA < sumB) {
			System.out.println("B학생의 성적이 A학생의 성적보다 좋습니다.");
		} else {
			System.out.println("A학생과 B학생의 성적이 같습니다.");
		}

	}

}
