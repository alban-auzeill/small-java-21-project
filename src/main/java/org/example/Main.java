package org.example;

public class Main {
  record User(String firstName, String lastName) { }
  record Cat(String name) { }

  static String nameOf(Object arg) {
    return switch (arg) {
      case User(var firstName, var lastName) -> firstName + " " + lastName;
      case Cat(var name)                     -> "Meow";
      default                                -> "👽";
    };
  }

}
