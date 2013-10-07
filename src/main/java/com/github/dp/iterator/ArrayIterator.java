package com.github.dp.iterator;

public class ArrayIterator<T> implements Iterator<T>{
	private T[] thisArray;
	private int index = 0;
	private int size = 0;
	
	public ArrayIterator(T[] testArray){
		if(testArray == null ||  testArray.length <=0 ){
			return;
		}
		thisArray = testArray;
		size = thisArray.length;
	}
	
	public T next() {
		T obj = thisArray[index];
		index ++;
		return obj;
	}

	public boolean haveNext() {
		return index <= size -1;
	}

}
