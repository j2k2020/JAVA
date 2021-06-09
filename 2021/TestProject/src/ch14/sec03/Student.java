package ch14.sec03;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	
	//매개변수가 있는 생성자
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	//getters 만들기
	public String getName() {
		return name;
	}
	
	public int getEnglishScore() {
		return englishScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	
	

}
