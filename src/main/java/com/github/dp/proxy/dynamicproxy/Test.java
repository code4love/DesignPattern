package com.github.dp.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {

		HelloWorld hw = new HelloWorldImpl();

		InvocationHandler handler = new HelloWorldHandler(hw);

		ClassLoader cl = hw.getClass().getClassLoader();
		HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(cl, hw.getClass().getInterfaces(), handler);
		proxy.sayHelloWorld();
	}
}