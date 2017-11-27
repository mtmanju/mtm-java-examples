package com.mtm.demo;

import org.junit.Assert;
import org.junit.Test;

public class AbstractClassTest {

	abstract class Animal {
		private String name;

		/*
		 * Animal(String name) { this.setName(name); }
		 */

		abstract String bark();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	class Dog extends Animal {
		Dog(String name) {
			// super(name);
		}

		@Override
		String bark() {
			return "BOW BOW";
		}
	}

	@Test
	public void testCreation() {
		Dog dog = new Dog("Tommy");
		Assert.assertEquals("BOW BOW", dog.bark());
		Assert.assertEquals("Tommy", dog.getName());

	}
}
