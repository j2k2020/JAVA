package ch07.sec04.pack1;

//AA클래스와  동일 패키지
public class BB {
	AA a1 = new AA(true); // public(o) 
	AA a2 = new AA(1); //default(o)
	//AA a3 = new AA("문자열"); //private(x)
	//동일 패키지라도 private 접근 불가
	
}
