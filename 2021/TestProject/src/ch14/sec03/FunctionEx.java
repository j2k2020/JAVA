package ch14.sec03;

import java.util.*;
import java.util.function.*;

//�л� �����͸� �迭�� �ޱ� ����


public class FunctionEx {
	//Student ��ü�� ���� �÷��� (������ü�� ���� ���� ��ü)����
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 95),
			new Student("�ſ��", 95, 93)
			);

	
	
//�׳� �żҵ� ��!!!	
//Function�Լ��� �������̽��� �żҵ��� �Ű�Ÿ������ ���
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
