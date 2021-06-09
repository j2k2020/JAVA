package ch15.sec07;

public class ChildProductAndStorageEx {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("스마트 TV");
		product.setCompany("삼성");
		
		//인터페이스 타입
		Storage<Tv> storage = new StorageImple<Tv>(100);
		storage.add(new Tv(), 0);

	}

}
