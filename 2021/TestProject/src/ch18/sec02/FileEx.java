package ch18.sec02;
//13:00~13:50

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// ���� ��ü ����
		File dir = new File("C:/test/Dir");
		
		//mkdirs(): ��� �� ���� ���͸� �����ϰ�, ��� ��ȯ
		boolean result = dir.mkdirs();
		System.out.println(result);
		
		File dir2 = new File("C:\\test\\test2\\Dir2");
		dir2.mkdirs(); //mkdirs(): ��� �� ���� �����͸� �����ϰ� ��� ��ȯ
		
		File dir3 = new File("C:\\test3\\Dir3");
		if(dir3.exists()==false) {
			dir3.mkdirs();
			
		}
		//mkdirs(): �ٷ� �� �������͸� �������� ������ ���� �Ұ�
		//�������� ������ �����Ϸ��� �ߴµ� �������� ����
		
		File dir4 = new File("C:\\test\\Dir4");
		if(dir4.exists()==false) {
			dir4.mkdirs();
		}
		//�ٷ� ���� ���͸� test�� ���������� Dir4�� ����
		
		
		File dir5 = new File("C:\\test\\test4\\Dir5");
		if(dir5.exists()==false) {
			dir5.mkdirs();
		}
		//�ֻ��� ���͸� test�� �����ص�
		//�ٷ� ���� ���͸� test4�� �������� �����Ƿ� ���͸� �������� ����
		
		
		//���� ��ü ����
		File file1 = new File("C:/test/file1.txt");
		File file2 = new File("C:/test/Dir/file2.txt");
		
		//���� ����
		//createNewFile(): ���� ���� �� ��� ��ȯ(true/false)
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
		System.out.println("��¥                       �ð�                     ����                         ũ��               �̸�");
		System.out.println("------------------------------------------------------");
		
		File temp = new File("C:/test");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
		File[] contents = temp.listFiles();
		
		for (File file:contents) {
			System.out.print(sdf.format(new Date(file.lastModified()))); //��¥ ����
			//���͸� �����ϸ�
			if(file.isDirectory()) {
				System.out.print("\t<Dir>\t\t\t"+file.getName());
			}else {
				System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println();
		}
				
				
	}

}









