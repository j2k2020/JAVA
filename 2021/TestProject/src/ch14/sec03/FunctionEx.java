package ch14.sec03;

import java.util.*;
import java.util.function.*;

//학생 데이터를 배열로 받기 위해


public class FunctionEx {
	//Student 객체를 갖는 컬랙션 (여러객체를 묶어 놓은 객체)생성
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 95),
			new Student("신용권", 95, 93)
			);

	
	
//그냥 매소드 임!!!	
//Function함수적 인터페이스를 매소드의 매개타입으로 사용
	public static void printString(Function<Student,String> function) {
		for(Student student: list) {
			System.out.println(function.apply(student)+" ");}
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for(Student student: list) {
			System.out.println(function.applyAsInt(student)+ " ");
		}	
	}
	
	
	
	public static void main(String[] args) {
		printString(t -> t.getName());
		
		printInt(t -> t.getEnglishScore());
		printInt(t -> t.getMathScore());
		
	}
	

}
