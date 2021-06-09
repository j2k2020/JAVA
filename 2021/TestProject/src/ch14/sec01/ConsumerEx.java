package ch14.sec01;

import java.util.function.*;

public class ConsumerEx {
	public static void main(String[] args) {
		//String Ÿ���� �Ű����� 1���� �޾Ƽ� �Һ��ϴ� ���ٽ�
		Consumer <String> consumer = t -> System.out.println(t+"8");
		consumer.accept("java");
		
		//String Ÿ���� �Ű����� 2�� t,u�� �޾Ƽ� �Һ��ϴ� ���ٽ�
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		//double ���� �޾Ƽ� �Һ��ϴ� ���ٽ�
		DoubleConsumer doubleConsumer = d -> System.out.println("JAVA"+d);
		doubleConsumer.accept(8.0);
		
		//String Ÿ�� �Ű����� t�� int�� i�� �޾Ƽ� �Һ��ϴ� ���ٽ�
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t+i);
		objIntConsumer.accept("JaVa", 8);
	}

}
