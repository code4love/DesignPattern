package com.github.dp.iterator;

public class Tester {
	public static void main(String[] args) {
		Integer[] array = {1,2,3,4,5};
		Iterator<Integer> iter = IteratorFactory.getIterator(array);
		while(iter.haveNext()){
			System.out.println(iter.next());
		}
	}
}
