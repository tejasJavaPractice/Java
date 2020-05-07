package com.spring.core;

public class MySingleton 
{
	private static MySingleton mySingleton;
	
	public static MySingleton getMySingletonObject()
	{
		if(mySingleton == null)
		{
			mySingleton = new MySingleton();
		}
		
		return mySingleton;
	}
	
	private MySingleton()
	{
		
	}
}
