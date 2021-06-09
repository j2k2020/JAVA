package ch18.sec02;
//13:00~13:50

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// 파일 객체 생성
		File dir = new File("C:/test/Dir");
		
		//mkdirs(): 경로 상에 없는 디렉터리 생성하고, 결과 반환
		boolean result = dir.mkdirs();
		System.out.println(result);
		
		File dir2 = new File("C:\\test\\test2\\Dir2");
		dir2.mkdirs(); //mkdirs(): 경로 상에 없는 데렉터리 생성하고 결과 반환
		
		File dir3 = new File("C:\\test3\\Dir3");
		if(dir3.exists()==false) {
			dir3.mkdirs();
			
		}
		//mkdirs(): 바로 위 상위디렉터리 존재하지 않으면 생성 불가
		//존재하지 않으면 생성하려고 했는데 생성하지 않음
		
		File dir4 = new File("C:\\test\\Dir4");
		if(dir4.exists()==false) {
			dir4.mkdirs();
		}
		//바로 상위 디럭터리 test가 존재하으로 Dir4만 생성
		
		
		File dir5 = new File("C:\\test\\test4\\Dir5");
		if(dir5.exists()==false) {
			dir5.mkdirs();
		}
		//최상위 디렉터리 test는 존재해도
		//바로 상위 디렉터리 test4가 존재하지 않으므로 디렉터리 생성하지 않음
		
		
		//파일 객체 생성
		File file1 = new File("C:/test/file1.txt");
		File file2 = new File("C:/test/Dir/file2.txt");
		
		//파일 생성
		//createNewFile(): 파일 생성 후 결과 반환(true/false)
		if(file1.exists()==false) {
			file1.createNewFile();
		}
		
		if(file2.exists()==false) {
			file2.createNewFile();
		}
		
		System.out.println("File1 Path: "+file1.getPath());
		System.out.println("File1 Name: "+file1.getName());
		System.out.println("File1 Length: "+file1.length());
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		System.out.println("file2 Path: "+file2.getPath());
		System.out.println("file2 Name: "+file2.getName());
		System.out.println("file2 Length: "+file2.length());
		System.out.println();
		System.out.println("날짜                       시간                     형태                         크기               이름");
		System.out.println("------------------------------------------------------");
		
		File temp = new File("C:/test");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
		File[] contents = temp.listFiles();
		
		for (File file:contents) {
			System.out.print(sdf.format(new Date(file.lastModified()))); //날짜 시작
			//디렉터리 존재하면
			if(file.isDirectory()) {
				System.out.print("\t<Dir>\t\t\t"+file.getName());
			}else {
				System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
				
				
	}

}









