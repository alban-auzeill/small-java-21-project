package org.example;

public class Main {
  record User(String firstName, String lastName) { }
  record Cat(String name) { }

  static void hello(Object arg) {
    switch (arg) {
      case User(var firstName, var lastName) -> print("Hello " + firstName + " " + firstName);
      case Cat(var name)                     -> print("Meows " + name);
      default                                -> print("👽 " + arg);
    }
  }

  public static void main(String[] args) {
    hello(new User("Paul", "Smith"));
    hello(new Cat("Garfield"));
  }

  static void print(String arg) {
    System.out.println(arg);
  }

}
