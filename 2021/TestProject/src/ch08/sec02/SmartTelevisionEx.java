package ch08.sec02;

public class SmartTelevisionEx {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
	    RemoteControl rc = tv;
	    rc.turnOn();
	    rc.setVolume(10);
	    rc.turnOff();
	    
	    Serchable sch =tv;
	    sch.search("www.naver.com");
	    
	    

	}

}
