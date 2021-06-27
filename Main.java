package com.testingdocs.calculator;

public class Calculator {
//no-arg constructor
public Calculator() {
}

public int add(int a, int b) {
return a + b;
}

public int subtract(int a, int b) {
return a - b;
}


public double divide(int a, int b) {
double result;
if (b == 0) {
throw new IllegalArgumentException("Divisor cannot divide by zero");
} else {
result = Double.valueOf(a)/Double.valueOf(b);
}
return result;
}
}
