package com.java003.Java_class_File;

public class Singleton {
  private static Singleton ourInstance = new Singleton();

  public static Singleton getInstance() {
    return ourInstance;
  }

  private Singleton() {
  }
}
