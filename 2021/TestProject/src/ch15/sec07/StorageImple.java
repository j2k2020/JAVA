package ch15.sec07;

//제네릭 인터페이스 구현 클래스
//제네릭 인터페이스를 구현한 클래스도 제네릭 타입

public class StorageImple<T> implements Storage<T> {
	private T[] array;

	public StorageImple(int capacity) {
		this.array = (T[])(new Object[capacity]);
	}

	@Override
	public void add(T item, int index) {
		array[index] = itme;
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
