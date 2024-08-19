package ex06_Buffered;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_ReadImge {

	public static void main(String[] args) {
		//기반스트림만 사용해서 이미지 읽어보가
		FileInputStream readFile = null;
		//기반 + 보조스트림을 사용해서 이미지 읽어보기
		FileInputStream bisReadfile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("기본스트림으로 읽기 시작");
			readFile = new FileInputStream("D:\\web0900_kjs\\1.java/wall.jpg");
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			while(readFile.read() != -1) {
				
			}
			System.out.println("이미지 읽기 종료1");
			long end = System.currentTimeMillis();
			long time = (end-start)/1000;
			System.out.println("소요 시간 : "+ time + "초");
			System.out.println("기본스트림으로 읽기 종료");
			
			System.out.println("--------------------------------------------");
			System.out.println("보조스트림으로 읽기 시작");
			bisReadfile = new FileInputStream("D:\\web0900_kjs\\1.java/wall.jpg");
			bis = new BufferedInputStream(bisReadfile);
			
			start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			while(bis.read()!= -1) {
				//이미지 읽기
			}
			System.out.println("이미지 읽기 종료");
			end = System.currentTimeMillis();
			double result = (double)(end-start)/1000;
			
			System.out.println("소요 시간 : "+ result + "초");
			System.out.println("보조 스트림으로 읽기 종료");
			
			
			
		} catch (Exception e) {
			
		}finally {
		try {
			if(bis != null)bis.close();
			if(bisReadfile != null)bisReadfile.close();
			if(readFile != null)readFile.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		}
		
		
		
	}

}
