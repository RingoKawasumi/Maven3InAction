package com.zhujie.study._3_GettingStarted;

/**
 * Created by kawasumi on 15/9/25.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());
    }

    public String sayHello() {
        return "Hello Maven";
    }
}
