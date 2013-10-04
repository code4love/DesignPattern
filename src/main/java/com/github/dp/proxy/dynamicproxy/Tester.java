package com.github.dp.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Tester {

	public static void main(String[] args) {

		ProxyInterface hw = new ProxyImpl();

		InvocationHandler handler = new ProxyHandler(hw);

		ClassLoader cl = hw.getClass().getClassLoader();
		// proxy对象是在运行时才产生的
		ProxyInterface proxy = (ProxyInterface) Proxy.newProxyInstance(cl, hw.getClass().getInterfaces(), handler);
		
		proxy.sayHelloWorld();
	}
}