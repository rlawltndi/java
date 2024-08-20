package ex01_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImge {

	public static void main(String[] args) {
		// 보조스트림을 이용해서 이미지를 복사
		// wall_copy3.jpg 이름으로 복사
		FileInputStream readFIle = null;
		BufferedInputStream bis = null;
		FileOutputStream writeFile = null;
		BufferedOutputStream bos = null;
		try {
			readFIle = new FileInputStream("D:\\web0900_kjs\\1.java/wall.jpg");
			bis = new BufferedInputStream(readFIle);

			writeFile = new FileOutputStream("D:\\web0900_kjs\\1.java/wall.copy3.jpg");
			bos = new BufferedOutputStream(writeFile);

			int code = 0;
			
			while((code=bis.read()) != -1) {
			bos.write(code);	
			}
			System.out.println("복사완료");
		} catch (Exception e) {

		}finally {
			try {
				if(bos != null)bos.close();
				if(writeFile != null)writeFile.close();
				if(bos != null)bos.close();
				if(readFIle != null)readFIle.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
