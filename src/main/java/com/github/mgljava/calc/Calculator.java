package com.github.mgljava.calc;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int multi(int a, int b) {
    return a * b;
  }

  public int switchCase(int a) {
    switch (a) {
      case 1:
        return 1;
      case 2:
        return 2;
      case 3:
        return 3;
      default:
        return 4;
    }
  }
}
