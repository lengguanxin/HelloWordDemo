package com.ctitc.HelloWorldDemo;

public class HelloWorldDemo {
    public static void main(String [] args){
        int  n = 123456789;
        float  f = n;
        System.out.println (f);
        HelloWorldDemo helloWorld = new HelloWorldDemo();
        helloWorld.run();
        HelloWorldDemo2 helloWorld2 = new HelloWorldDemo2();
        helloWorld2.run();
    }

    public void run(){
        System.out.println("i can run");
    }
}
