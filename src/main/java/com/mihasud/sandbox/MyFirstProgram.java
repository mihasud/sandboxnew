package com.mihasud.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("World");
    hello("user");
    hello("Michael");

    Square s = new Square(5);
    System.out.println("Area of square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Area of square with sides " + r.a + " and "+ r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }
  
}