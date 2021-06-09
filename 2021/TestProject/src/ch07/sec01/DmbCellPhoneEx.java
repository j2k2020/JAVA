package ch07.sec01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dm = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로 부터 상속 받은 필드
		System.out.println("모델:"+dm.model);
		System.out.println("색상:"+dm.color);
		
		//DmbCellPhone 필드
		System.out.println("체널:"+dm.channel);
		
		//cellPhone으로 부터 상속 받은 메소드 호출
		dm.powerOn();
		dm.bell();
		dm.sendVoice("안녕하세요");
		dm.receiveVoice("TV를 켜주쉐요");
		dm.sendVoice("저는 외국인입니다.");
		dm.hangUp();

	}

}
