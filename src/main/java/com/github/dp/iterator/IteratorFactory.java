package com.github.dp.iterator;

public class IteratorFactory {

	public static <T> Iterator<T> getIterator(T[] array){
		Iterator<T> iter = new ArrayIterator<T>(array);
		return iter;
	}
	
}
