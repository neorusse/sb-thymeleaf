package com.ecodencode.springbootthymeleaf.Model;

public class User {

  public Integer id;
  public String name;
  public Integer age;

  // parameterize constructor
  public User(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}