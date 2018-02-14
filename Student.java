//Kitty Liu
//Due date: Friday, 2018.2.16

import java.util.*;

public class Student {

//all the info of student
  public static String studentName;
  public static String studentTieColor;
  public static String studentBirthday;
  public static String studentEthnicity;
  public static String studentEmail;
  public static int studentHeight;
  public static int studentWeight;

  //didn't know how to categorize this one
  public static String studentClass;

  public Student(String a, String b, String c, String d, String e, int f, int g) {
    this.studentName = a;
    this.studentTieColor = b;
    this.studentBirthday = c;
    this.studentEthnicity = d;
    this.studentEmail = e;
    this.studentHeight = f;
    this.studentWeight = g;
  }

//Student's actions
  public void greet() {//do i take any parameter???
    System.out.print("Hello, my name is " + studentName + ". ");
    System.out.println("Nice to meet you!");
  }

//"getters"
  public String getName() {
    return studentName;
  }
  public String getTieColor() {
    return studentTieColor;
  }
  public String getBirthday() {
    return studentBirthday;
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

//"setters"

  public void setName(String a) {
    studentName = a;
  }
  public void setTieColor(String b) {
    studentTieColor = b;
  }
  public void setBirthday(String c) {
    studentBirthday = c;
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


}
