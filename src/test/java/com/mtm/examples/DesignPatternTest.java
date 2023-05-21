package com.mtm.examples;

import com.mtm.examples.designpattern.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class DesignPatternTest {

    @Test
    public void testGetInstance() throws InstantiationException, IllegalAccessException {
        Singleton s = Singleton.getInstance();
        Assert.assertNotNull(s);
    }
}
