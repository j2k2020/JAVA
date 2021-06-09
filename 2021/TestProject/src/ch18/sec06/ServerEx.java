package ch18.sec06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	
	ServerSocket serverSocket = null;
	Socket socket = null; //��ſ� ����
	BufferedReader inStream = null;
	BufferedWriter outStream =null;
	
	Scanner sc = new Scanner(System.in); //Ű���� �Է¿�
	
	//������
	public ServerEx() {
		//���� ��Ĺ ����: Ŭ���̾�Ʈ ��û ��ٸ�
		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�.");
			
			//Ŭ���̾�Ʈ�κ��� ��û�� ���� ��û�� �����ϰ� ��ſ� ��Ĺ ����
			socket = serverSocket.accept();
			System.out.println("����Ǿ����ϴ�.");
			
			//��Ĺ �Է� ��Ʈ�� ����
			inStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//���� ��� ��Ʈ�� ����
			outStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//���: ������ �ְ� ����
			//Ŭ���̾�Ʈ���� 'bye' �޽����� ���� ��� �ߴ�
			while(true) {
				//Ŭ���̾�Ʈ�κ��� �� �޽����� �� �྿ �б�
				String InputMessage = inStream.readLine();
				
				//"bye"�� ������ ���� ����
				if(InputMessage.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye ������ �����Ͽ���.");
					break;
				}
				
				//Ŭ���̾�Ʈ���� ��ȭ ���� ȭ�鿡 ���
				System.out.println("Ŭ���̾�Ʈ: "+InputMessage);
				System.out.print("����: ");
				//Ű���忡�� �Է�
				String outputMessage = sc.nextLine();
				//�޽��� ����
				outStream.write(outputMessage+"\n"); //Ű���忡�� �Է��� ���ڿ� ����
				outStream.flush(); //���� ����(���ۿ� ���� �ִ� ���ڿ��� ��� ������ ������)
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