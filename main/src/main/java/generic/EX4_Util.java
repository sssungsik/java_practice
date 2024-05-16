package main.java.generic;

public class EX4_Util {
	public static <K,V> V getValue(EX4_Pair<K,V> p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		}
		else {
			return null;
		}
	}

}

