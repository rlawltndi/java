package ex04_Reader;

import java.io.FileReader;

public class Ex01_FileReader {
	
	public static void main(String[] args) {
		FileReader fr = null;
		//이미지 음악 동영상 전송할 때는 바이트기반의 스트림을 이용한것이 좋다.
		try {
			FileReader f = new FileReader("D:\\web0900_kjs\\1.java/test.txt");
			int code = 0;
		
			while((code = f.read()) != -1) {
				System.out.println((char)code);
				System.out.println(code+ " ");
				
			}
		} catch (Exception e) {
			
		}finally {
			try {
				if(fr != null) 
					fr.close();
					
				
			}catch (Exception e) {
				

				}
			}
			//읽자마자 쓰는것 보다 중간에 버퍼라는 공간을 두는것이 속도가 훨씬 빠르다.
		}
		

	}
