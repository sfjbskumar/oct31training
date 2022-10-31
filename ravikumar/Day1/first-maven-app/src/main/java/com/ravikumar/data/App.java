package com.ravikumar.data;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        com.ravikumar.data.Greeting greeting=new com.ravikumar.data.Greeting();
        System.out.println(greeting.sayHello());
        System.out.println(greeting.sayHi());
        System.out.println(greeting.sayWelcome());
        System.out.println(greeting.sayThanks());
    }
}
