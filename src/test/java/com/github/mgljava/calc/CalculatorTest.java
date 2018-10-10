package com.github.mgljava.calc;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
    // given
    int a = 10;
    int b = 20;

    // when
    final int addNumber = calculator.add(a, b);

    // then
    assertEquals(30, addNumber);
  }

  @Test
  public void testSub() {
    // given
    int a = 20;
    int b = 2;

    // when
    final int subNumber = calculator.sub(a, b);

    // then
    assertEquals(18, subNumber);
  }

  @Test
  public void testMulti() {
    // given
    int a = 3;
    int b = 2;

    // when
    final int multiResult = calculator.multi(a, b);

    // then
    assertEquals(6, multiResult);
  }

  @Test
  public void testDiv() {
    // given
    int a = 10;
    int b = 2;

    // when
    final int divResult = calculator.div(a, b);

    // then
    assertEquals(5, divResult);
  }

  @Test
  public void testSwitchCase_1() {
    // given
    int a = 1;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(1, result);
  }

  @Test
  public void testSwitchCase_2() {
    // given
    int a = 2;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(2, result);
  }

  @Test
  public void testSwitchCase_3() {
    // given
    int a = 3;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(3, result);
  }

  @Test
  public void testSwitchCase_4() {
    // given
    int a = 4;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(4, result);
  }

  @Test
  public void testSqrt() {
    // given
    double a = 9D;

    // when
    final double result = calculator.sqrt(a);

    // then
    assertEquals(3D, result);
  }
}