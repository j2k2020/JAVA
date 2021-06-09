package ch18.sec03;

import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args){
		FileOutputStream os = null;

		try {
			//쓰기 다시 하면 이전 내용 덮어씀
			//os = new FileOutputStream("src\\ch18\\sec02\\fileWrite.txt");
			
			//추가 모드(append모드)로 파일을 열기 (파일 멘 뒷부분에 추가됨)
			os = new FileOutputStream("src\\ch18\\sec02\\fileWrite.txt");


			// 출력할 문자열
			String strOut = "안녕하세요. 파일로 출력됩니다."; //주의 쓰기 다시하면 이전 내용 덮어씀!
			byte[] bs = strOut.getBytes(); // 바이트 배열로 변환

			os.write(bs);
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
