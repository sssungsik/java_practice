package main.java.generic;

public class EX3_Container<T, V>{
	private T t;
	private V v;
	


	public T getKey() {
		return this.t;
	}
	public V getValue() {
		return this.v;
	}

	public void set(T t, V v) {
		this.t = t;
		this.v = v;
	}

		
	
	

}
