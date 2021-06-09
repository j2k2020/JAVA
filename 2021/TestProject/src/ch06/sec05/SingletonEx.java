package ch06.sec05;

public class SingletonEx {

	public static void main(String[] args) {
		//생성자를 private으로 막아 놓았기 때문에 not visible 오류가 난다.
		//Singleton obj1 = new Singleton(); 이렇게는 사용 불가
		
		
		//외부에 공개된
		//static 메소드인 getInstance()로 호출해서 객체를 반환 받음
		Singleton obj1 = Singleton.getInSingleton();
		Singleton obj2 = Singleton.getInSingleton();
		
		
		if(obj1 == obj2) {
			System.out.println("같은  Singleton 객체이다");
			//static으로 만들어져서 같은 객체이다. static은 클래스당 하나만 만들어지기 때문이다.
		}else {
			System.out.println("다른  Singleton 객체이다");
		}
		
	

	}

}
