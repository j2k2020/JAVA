package ch15.sec07;

public class ChildProductAndStorageEx {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("����Ʈ TV");
		product.setCompany("�Ｚ");
		
		//�������̽� Ÿ��
		Storage<Tv> storage = new StorageImple<Tv>(100);
		storage.add(new Tv(), 0);

	}

}
