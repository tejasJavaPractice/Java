package com.java.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest 
{

	public static void main(String[] args) 
	{
		//(x, y) -> x = y 

		//either
		//(param) -> expression
		//or
		//(param) -> {statements;}
		//or
		//() -> expression

		new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				System.out.println("running");
			}
		});

		new Thread(
				() -> System.out.println("running"));


		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);

		list.forEach(i -> System.out.println(i));
	}

}

interface MyInterface1
{
	void work();
}

class MyClass implements MyInterface1
{
	@Override
	public void work() 
	{
		
		
	}
	
}
