package lesson2;

import java.util.Comparator;
import java.util.TreeMap;

public class test {
	public static void main(String[] args) {
		TreeMap<A, String> map = new TreeMap<A, String>(new MyComp());
		map.put(new A(3), "3");
		map.put(new A(4), "4");
		map.put(new A(2), "2");
		for (A key : map.keySet()) {
			System.out.println(key.x);
		}
	}

	static class A implements Comparable<A> {
		int x;

		public A(int x) {
			this.x = x;
		}

		@Override
		public int compareTo(A a) {
			return Integer.valueOf(this.x).compareTo(Integer.valueOf(a.x));
		}
	}

	static class MyComp implements Comparator<A> {
		@Override
		public int compare(A a1, A a2) {
			return Integer.valueOf(a2.x).compareTo(Integer.valueOf(a1.x));
		}
	}

}