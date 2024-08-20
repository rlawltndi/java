package ex03_annotation;

import java.lang.annotation.Annotation;

@TestInfo(value = "테스트정보")
public class Ex02_annotation {
	public static void main(String[] args) {
		Annotation[] annos = Ex02_annotation.class.getAnnotations();
		for (Annotation anno : annos) {
			System.out.println(anno);

		}
		//.class : 클래스 리터럴
		//그 클래스 자체에 대한 정보를 얻을 수 있다.
		//클래스의 일므은 뭐냐 
		//메서든느 뭐가 있냐
		//적용된 어노테이션은 뭐가 있냐
		TestInfo testInfo = (TestInfo)Ex02_annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.value());
	}
	

}
