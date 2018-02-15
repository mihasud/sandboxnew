package com.mihasud.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("World");
    hello("user");
    hello("Michael");

    double l = 5;
    System.out.println("Area of square with side " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Area of square with sides " + a + " and "+ b + " = " + area(5,3 ));
  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}