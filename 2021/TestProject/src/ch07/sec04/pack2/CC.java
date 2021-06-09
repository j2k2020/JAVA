package ch07.sec04.pack2;

import ch07.sec04.pack1.AA;

//다른 패키지

public class CC {
	AA a1 = new AA(true); //public(o)
	//AA a2 = new AA(1); //default(x)
	//defualt는 동일 패키지 내에서만 접근 가능
	//AA a3 = newAA("문자열"); //private (x)
	//클래스 외부에서 완전 사용 불가
	

}
