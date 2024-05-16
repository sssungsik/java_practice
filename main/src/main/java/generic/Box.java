package main.java.generic;

public class Box<T> {
	public T content; // 타입 피라미터로 T 사용
	
	
	// Box 의 내용물 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
	
	private T t; // 필드
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
