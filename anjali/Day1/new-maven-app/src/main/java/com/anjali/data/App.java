package com.anjali.data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Greeting greeting=new Greeting();
        System.out.println(greeting.sayHello());
        greeting.sayHi();
        greeting.sayWelcome();
        greeting.sayThanks();
    }
}
