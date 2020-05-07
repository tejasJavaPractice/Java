package com.java.core.serialization;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		

	}

	public List<String> filterWords(List<String> words)
	{
		return words.stream().filter(word -> word.startsWith("a")).filter(word -> word.length() ==3).collect(Collectors.toList());
	}
}
