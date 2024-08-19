package ex03_outputstring;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\web0900_kjs\\1.java/wall.jpg");
			out = new FileOutputStream("D:\\web0900_kjs\\1.java/wall.jpg");
			
			byte[] buffer = new byte[512];
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			while ((read = in.read(buffer)) != -1){
				out.write(buffer,0,read);
				
			}
			
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end - start)/1000;
			System.out.println(time+"초");
		} catch (Exception e) {
			
		}finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (Exception e2) {

			}
		}
		//읽자마자 쓰는것 보다 중간에 버퍼라는 공간을 두는것이 속도가 훨씬 빠르다.
	}
	

}
