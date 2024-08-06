package ex02_class;

import java.util.Arrays;
import java.util.Random;

public class StudentMain {
	public static void main(String[] args) {
	//System.out.println(Student.schoolName);
	//Student.goTOschool();
	
	Student stu1 = new Student();
	stu1.stdentName = "김고이";
	stu1.hello();
	System.out.println();
	System.out.println("학교는 "+ Student.schoolName+"입니다.");
	Student.goTOschool();
	Student stu2 = new Student();
	stu2.stdentName= "김고삼";
	stu2.hello();
	System.out.println("학교는 "+Student.schoolName+ "입니다");
	Student.goTOschool();
	
//	Arrays.sort(null);
//	Math.random();
//	String
//	Scanner
//	Random

}
	//메서드는 반드시 메서드 밖에서 정의해야한다.
	static void printHello() {
		
		//매서드의 호출은 반드시 메서드 안에서 해야한다.
		printHello();
		System.out.println("안녕하세여");
		System.out.println("반갑습니다");
	}
}