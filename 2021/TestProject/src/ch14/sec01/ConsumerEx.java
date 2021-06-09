package ch14.sec01;

import java.util.function.*;

public class ConsumerEx {
	public static void main(String[] args) {
		//String 타입의 매개변수 1개를 받아서 소비하는 람다식
		Consumer <String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		//String 타입의 매개변수 2개 t,u를 받아서 소비하는 람다식
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		//double 값을 받아서 소비하는 람다식
		DoubleConsumer doubleConsumer = d -> System.out.println("JAVA"+d);
		doubleConsumer.accept(8.0);
		
		//String 타입 매개변수 t와 int값 i를 받아서 소비하는 람다식
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t+i);
		objIntConsumer.accept("JaVa", 8);
	}

}
