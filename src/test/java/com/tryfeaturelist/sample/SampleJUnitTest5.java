package com.tryfeaturelist.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class SampleJUnitTest5 {

	Hello hello = new Hello();

	@Test
	void sampleTest() {
		assertEquals(2, 1+1);
	}

	@Test
	void あいさつのテスト() {
		String s = hello.greet("JUnit5");
		assertEquals(s, "Hello JUnit5!!");
	}
}
