package main.java.generic;

public class EX4_OtherPair<K, V> {
	private K key;
	private V value;
	
	public EX4_OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return key;}
	public V getValue() { return value;}
}
