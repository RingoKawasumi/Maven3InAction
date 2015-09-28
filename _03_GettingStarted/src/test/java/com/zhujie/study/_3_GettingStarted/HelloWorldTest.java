package com.zhujie.study._3_GettingStarted;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhujie on 15/9/26.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven", result);
    }
}
