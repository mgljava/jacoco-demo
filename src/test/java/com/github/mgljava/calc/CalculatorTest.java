package com.github.mgljava.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void should_get_30_when_a_equal_20_and_b_equal_10() {
    // given
    int a = 10;
    int b = 20;

    // when
    final int addNumber = calculator.add(a, b);

    // then
    assertEquals(30, addNumber);
  }

  @Test
  public void should_get_18_when_a_equal_20_and_b_equal_2() {
    // given
    int a = 20;
    int b = 2;

    // when
    final int subNumber = calculator.sub(a, b);

    // then
    assertEquals(18, subNumber);
  }

  @Test
  public void should_get_6_when_a_equal_3_and_b_equal_2() {
    // given
    int a = 3;
    int b = 2;

    // when
    final int multiResult = calculator.multi(a, b);

    // then
    assertEquals(6, multiResult);
  }

  @Test
  public void should_get_5_when_a_equal_10_and_b_equal_2() {
    // given
    int a = 10;
    int b = 2;

    // when
    final int divResult = calculator.div(a, b);

    // then
    assertEquals(5, divResult);
  }

  @Test
  public void should_get_1_when_arg_is_1() {
    // given
    int a = 1;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(1, result);
  }

  @Test
  public void should_get_2_when_arg_is_2() {
    // given
    int a = 2;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(2, result);
  }

  @Test
  public void should_get_3_when_arg_is_3() {
    // given
    int a = 3;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(3, result);
  }

  @Test
  public void should_get_4_when_arg_is_4() {
    // given
    int a = 4;

    // when
    final int result = calculator.switchCase(a);

    // then
    assertEquals(4, result);
  }
}