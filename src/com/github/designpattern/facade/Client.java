package com.github.designpattern.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.request();
	}

}
