package Basic;

//������ ��� ���� : ������ ����� ��� �������� ����� �����ϴ�!!

//������ �߰�ȣ{} ��� ������ ����ǰ� ���ȴ�
//�߰�ȣ ����� ����ϴ� ���� Ŭ����,������,�޼ҵ�
//�޼ҵ� ��� ������ ����� ������ = ���� ����(local variable)�̶� �Ѵ�

public class VariableScopeEx { //Ŭ���� ���
	public static void main(String[] args) {//�޼ҵ� ���
		
		int v1 = 15; //���� v1�� 15�� ������ ����
		
	 	if(v1>10) { //if������=>���� v1�� 10���� Ŭ ��
	 		
			int v2 = v1 -10; //v2��  v1�� ��(15) -10�� �� ���� �����Ѵ�
			
		}//if�� ��
		
	 	int v3 = v1 + v2 + 5; //�� ���·� �������� �ϸ� ������ ��
		
	 	
/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			v2 cannot be resolved to a variable
		
at Basic.VariableScopeEx.main(VariableScopeEx.java:13)*/
	 	
	 	/*������ ����� ��� �������� ����� �����ϱ� ������
	 	v2 ������ if�� �ۿ����� ����� �� ���� ������ ������ ������ �����.*/

	}
}
