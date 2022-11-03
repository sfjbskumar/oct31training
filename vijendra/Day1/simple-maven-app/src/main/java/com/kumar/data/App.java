package com.kumar.data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! This is my first Maven App" );
        Greeting greeting=new Greeting();
        greeting.sayHello();
        greeting.sayHi();
        greeting.sayWelcome();
        greeting.sayThanks();
    }



}
