package com.kumar.data;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Greeting App.
 */

public class GreetingTest {
  Greeting greeting;

  @Before
  public void setUp() {
    greeting = new Greeting();
  }

  @Test
  public void TestHello() {

    String result = greeting.sayHello();
    assertEquals("Hello", result);


  }

  @Test
  public void TestHi() {
    String result = greeting.sayHi();
    assertEquals( "Hi",result);
  }

  @Test
  public void TestWelcome() {
    String result = greeting.sayWelcome();
    assertEquals( "Welcome",result);
  }

  @Test
  public void TestThanks() {
    String result = greeting.sayThanks();
    assertEquals("Thanks",result);
  }
}
