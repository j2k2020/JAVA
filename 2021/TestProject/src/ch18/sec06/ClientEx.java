package ch18.sec06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	
	ServerSocket serverSocket = null;
	Socket socket = null; //��ſ� ����
	BufferedReader inStream = null;
	BufferedWriter outStream =null;
	
	Scanner sc = new Scanner(System.in); //Ű���� �Է¿�
	
	public ClientEx(){
		try {
			//��ſ� ���ϻ���. ������ ����(������ ���� ���� ������ ��Ʈ�� ����)
			socket = new Socket("localhost", 9999);
			System.out.println("���� �Ǿ����ϴ�..");
			
			//��Ĺ �Է� ��Ʈ�� ����
			inStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//���� ��� ��Ʈ�� ����
			outStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//���: ������ �ְ� ����
			//Ŭ���̾�Ʈ�� 'bye'�Է��ϸ� ����
			while(true) {
				System.out.println("Ŭ���̾�Ʈ: ");
				String outMessage = sc.nextLine(); //Ű����κ��� �Է� ����
				
				//�Է��� ���ڿ� ����
				outStream.write(outMessage + "\n");
				outStream
				
				//Ŭ���̾�Ʈ�� "bye"�� �Է��ϸ� ������ ���� �� ���� ����
				if(outMessage.equalsIgnoreCase("bye")) {
					outStream.flush();//���� ����
					break;//����ߴ�
				}
				outStream.flush();
				
				//�����κ��� �� �޽��� �� �྿ �ϱ�
				
				
			} 
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally{
			try {
			sc.close();
			if(socket != null) socket.close();
			if(serverSocket != null) serverSocket.close();
			}catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ü�� �� ����� �߻��߽��ϴ�.");
			}
		}
		
	}
	

	public static void main(String[] args) {
		new ServerEx();
	}

}
