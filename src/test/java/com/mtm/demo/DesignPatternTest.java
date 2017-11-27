package com.mtm.demo;

import org.junit.Assert;
import org.junit.Test;

import com.mtm.demo.designpattern.Singleton;

public class DesignPatternTest {

	@Test
	public void testGetInstance() throws InstantiationException, IllegalAccessException {
		Singleton s = Singleton.getInstance();
		Assert.assertNotNull(s);
	}
}
