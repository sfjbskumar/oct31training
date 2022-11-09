package com.rama.data;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        com.kumar.data.Greeting greeting=new com.kumar.data.Greeting();
        System.out.println(greeting.sayHello());
        System.out.println (greeting.sayHi());
        System.out.println (greeting.sayWelcome());
        System.out.println(greeting.sayThanks());
    }



}
