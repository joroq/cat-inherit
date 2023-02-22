package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DogTest {

	@Test
	public void testInitialState() {
		Dog dog = new Dog();
		assertTrue(dog.isAlive());
		assertEquals(dog.howHungry(), 50);
	}

	@Test
	public void testDogHasOneLife() {
		Dog dog = new Dog();
		assertTrue(dog.isAlive());
		dog.runs();
		dog.runs();
		assertTrue(!dog.isAlive());
		
	}
}
