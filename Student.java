//Kitty Liu
//Due date: Friday, 2018.2.16

import java.util.*;

public class Student {

//all the data
    private String studentName;
    private String studentTieColor;
    private String studentFavoriteFood;
    private String studentEthnicity;
    private String studentEmail;
    private int studentHeight;
    private int studentWeight;
    private int studentAge;

  public Student(String a, String b, String c, String d, String e, int f, int g, int h) {
    this.studentName = a;
    this.studentTieColor = b;
    this.studentFavoriteFood = c;
    this.studentEthnicity = d;
    this.studentEmail = e;
    this.studentHeight = f;
    this.studentWeight = g;
    this.studentAge = h;
  }

//Student's actions
  public static void greet() {//do i take any parameter???
    System.out.println("Hello, nice to meet you!");
  }

//"getters"
  public String getName() {
    return studentName;
  }
  public String getTieColor() {
    return studentTieColor;
  }
  public String getFavoriteFood() {
    return studentFavoriteFood;
  }
  public String getEthnicity() {
    return studentEthnicity;
  }
  public String getEmail() {
    return studentEmail;
  }

  public int getHeight() {
    return studentHeight;
  }
  public int getWeight() {
    return studentWeight;
  }
  public int getAge() {
    return studentAge;
  }

//"setters"

  public void setName(String a) {
    studentName = a;
  }
  public void setTieColor(String b) {
    studentTieColor = b;
  }
  public void setFavoriteFood(String c) {
    studentFavoriteFood = c;
  }
  public void setEthnicity(String d) {
    studentEthnicity = d;
  }
  public void setEmail(String e) {
    studentEmail = e;
  }

  public void setHeight(int f) {
    studentHeight = f;
  }
  public void setWeight(int g) {
    studentWeight = g;
  }
  public void setAge(int h) {
    studentAge = h;
  }


}
