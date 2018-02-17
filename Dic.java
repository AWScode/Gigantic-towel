//Kitty Liu
//Project about Student Directory
//due date: Friday 2018.2.16
import java.util.*;

public class Dic {

  public static void main(String[] args) {

//---------------------------------------------------------
//generating student
    Student Justin = new Student("Justin", "green", "peach", "Asian", "minghao_huang@aw.org", 180, 56, 16);
    Student Kunkun = new Student("Kunkun", "red", "apple", "Asian", "xukun_cai@aw.org", 182, 59, 19);
    Student Tom = new Student("Tom", "yellow", "watermelon", "American", "tom@aw.org", 178, 78, 15);
    Student Jerry = new Student("Jerry", "red", "pasta", "Asian", "jerry@aw.org", 180, 65, 17);
    Student Mike = new Student("Mike", "green", "pizza", "American", "mike@aw.org", 183, 54, 16);
    Student Lily = new Student("Lily", "blue", "noodle", "American", "lily@aw.org", 172, 53, 15);
    Student Cathy = new Student("Cathy", "yellow", "pizza", "European", "cathy@aw.org", 162, 51, 14);
    Student Sarah = new Student("Sarah", "red", "cookie", "Amerian", "sarah@aw.org", 172, 50, 19);
    Student Olivia = new Student("Olivia", "green", "cake", "African", "olivia@aw.org", 170, 63, 18);
    Student Kevin = new Student("Kevin", "blue", "candy", "African", "kevin@aw.org", 182, 89, 16);
    Student Wendy = new Student("Wendy", "yellow", "rice", "Asian", "wendy@aw.org", 163, 45, 13);
    Student Lisa = new Student("Lisa", "red", "apple", "American", "lisa@aw.org", 165, 47, 18);

  //generating subject
    Subject Math = new Subject("Math", "Mr.Considine", "A-", "mix", 15431);
    Subject English = new Subject("English", "Mr.Barber", "A", "mix", 12321);
    Subject History = new Subject("History", "Mr.Freshwater", "B-", "mix", 14538);
    Subject Science = new Subject("Science", "Mr.Sidman", "B+", "mix", 12342);
    Subject Music = new Subject("Music", "Mr.Lynn", "A-", "mix", 10291);
    Subject Art = new Subject("Art", "Mr.Bush", "A-", "mix", 15390);

//build the list of student
    ArrayList<Student> listOfStudent = new ArrayList<Student>();
    listOfStudent.add(Justin);
    listOfStudent.add(Kunkun);
    listOfStudent.add(Tom);
    listOfStudent.add(Jerry);
    listOfStudent.add(Mike);
    listOfStudent.add(Lily);
    listOfStudent.add(Cathy);
    listOfStudent.add(Sarah);
    listOfStudent.add(Olivia);
    listOfStudent.add(Kevin);
    listOfStudent.add(Wendy);
    listOfStudent.add(Lisa);

//build the list of subject
  ArrayList<Subject> listOfSubject = new ArrayList<Subject>();
  listOfSubject.add(Math);
  listOfSubject.add(English);
  listOfSubject.add(History);
  listOfSubject.add(Science);
  listOfSubject.add(Music);
  listOfSubject.add(Art);



  ArrayList<Student> MathClassStudent = new ArrayList<Student>();
  MathClassStudent.add(Tom);
  MathClassStudent.add(Jerry);
  MathClassStudent.add(Mike);
  MathClassStudent.add(Lily);
  MathClassStudent.add(Cathy);
  ArrayList<Student> EnglishClassStudent = new ArrayList<Student>();
  EnglishClassStudent.add(Cathy);
  EnglishClassStudent.add(Sarah);
  EnglishClassStudent.add(Olivia);
  EnglishClassStudent.add(Kevin);
  EnglishClassStudent.add(Wendy);
  ArrayList<Student> HistoryClassStudent = new ArrayList<Student>();
  HistoryClassStudent.add(Tom);
  HistoryClassStudent.add(Jerry);
  HistoryClassStudent.add(Mike);
  HistoryClassStudent.add(Lily);
  HistoryClassStudent.add(Wendy);
  HistoryClassStudent.add(Lisa);
  ArrayList<Student> ScienceClassStudent = new ArrayList<Student>();
  ScienceClassStudent.add(Justin);
  ScienceClassStudent.add(Kunkun);
  ScienceClassStudent.add(Tom);
  ScienceClassStudent.add(Jerry);
  ScienceClassStudent.add(Cathy);
  ScienceClassStudent.add(Sarah);
  ArrayList<Student> MusicClassStudent = new ArrayList<Student>();
  MusicClassStudent.add(Olivia);
  MusicClassStudent.add(Kevin);
  MusicClassStudent.add(Wendy);
  MusicClassStudent.add(Justin);
  MusicClassStudent.add(Kunkun);
  ArrayList<Student> ArtClassStudent = new ArrayList<Student>();
  ArtClassStudent.add(Justin);
  ArtClassStudent.add(Kunkun);
  ArtClassStudent.add(Tom);
  ArtClassStudent.add(Jerry);
  ArtClassStudent.add(Mike);
  ArtClassStudent.add(Lily);
  ArtClassStudent.add(Cathy);

  ArrayList<ArrayList<Student>> listOfSubjectStudentName = new ArrayList<ArrayList<Student>>();
  listOfSubjectStudentName.add(MathClassStudent);
  listOfSubjectStudentName.add(EnglishClassStudent);
  listOfSubjectStudentName.add(HistoryClassStudent);
  listOfSubjectStudentName.add(ScienceClassStudent);
  listOfSubjectStudentName.add(MusicClassStudent);
  listOfSubjectStudentName.add(ArtClassStudent);



//------------------------
  System.out.println("Welcome to Annie Wright Directory! What can I do for you:");
  System.out.println("  press a - search a class");
  System.out.println("  press b - search a student");


  System.out.print("  "); Scanner scanChoice1 = new Scanner(System.in);
  String scanChoice1Result =  scanChoice1.next();
  if (scanChoice1Result.equals("a")) {
    //learn more about student
      System.out.println("");
      System.out.println("Which subject would you like check?");
      System.out.println("--------All the Subjects--------");

      for (int i = 0; i < listOfSubject.size(); i++) {
          System.out.println("    " + listOfSubject.get(i).getName());
        }
      System.out.println("-------------------------------");
      System.out.print("  ");
      Scanner q = new Scanner(System.in);
      String choice2 = q.next();

      Boolean found = false;
      Subject theSubject = new Subject("test", "test", "test", "test", 0);
      for (int i = 0; i < listOfSubject.size(); i++) {
        if (choice2.equals(listOfSubject.get(i).getName())) {
          System.out.println("");
          System.out.println("What do you want to know about " + choice2 + " class ?");
          found = true;
          theSubject = listOfSubject.get(i);
          break;
        }
      }

      if (!found) {// (found == false)
        System.out.println("Sorry, we don't have that student...");
      }else{
        //print the choices
        System.out.println("  ----Things that you can ask----");
        System.out.println("  press a - Teacher's name");
        System.out.println("  press b - Average grade");
        System.out.println("  press c - For which tie color");
        System.out.println("  press d - Class room");
        System.out.println("  press e - List of student");
        System.out.println("  -------------------------------");

        System.out.print("  "); Scanner q2 = new Scanner(System.in);
        String question3 =  q2.next();
        if (question3.equals("a")) {
          System.out.println("The teacher's name of this " + theSubject.getName() + " class is " + theSubject.getTeacherName());

        }else if (question3.equals("b")) {
          System.out.println("The average grade of this " + theSubject.getName() + " class is " + theSubject.getAverageGrade());

        }else if (question3.equals("c")) {
          System.out.println("The tie color of this " + theSubject.getName() + " class is " + theSubject.getForWhichTie());

        }else if (question3.equals("d")) {
          System.out.println("The classroom number of this " + theSubject.getName() + " class is " + theSubject.getclassroom());

        }else if (question3.equals("e")) {

          if(theSubject.getName() == "Math"){
            System.out.println("--------Name list of Student in Math--------");
            for (int i = 0; i < MathClassStudent.size(); i++) {
                System.out.println("    " + MathClassStudent.get(i).getName());
            }
            System.out.println("-------------------------------");

          }else if (theSubject.getName() == "English"){
            System.out.println("--------Name list of Student in English--------");
            for (int i = 0; i < EnglishClassStudent.size(); i++) {
                System.out.println("    " + EnglishClassStudent.get(i).getName());
            }
            System.out.println("-------------------------------");

          }else if (theSubject.getName() == "History"){
            System.out.println("--------Name list of Student in History--------");
            for (int i = 0; i < HistoryClassStudent.size(); i++) {
                System.out.println("    " + HistoryClassStudent.get(i).getName());
            }
            System.out.println("-------------------------------");

          }else if (theSubject.getName() == "Science"){
            System.out.println("--------Name list of Student in Science--------");
            for (int i = 0; i < ScienceClassStudent.size(); i++) {
                System.out.println("    " + ScienceClassStudent.get(i).getName());
            }
            System.out.println("-------------------------------");

          }else if (theSubject.getName() == "Music"){
            System.out.println("--------Name list of Student in Music--------");
            for (int i = 0; i < MusicClassStudent.size(); i++) {
                System.out.println("    " + MusicClassStudent.get(i).getName());
            }
            System.out.println("-------------------------------");

          }else if (theSubject.getName() == "Art"){
            System.out.println("--------Name list of Student in Art--------");
            for (int i = 0; i < ArtClassStudent.size(); i++) {
                System.out.println("    " + ArtClassStudent.get(i).getName());
            }
            System.out.println("-------------------------------");
          }



        }
      }

      System.out.println("  ");
      System.out.println("Is there anything you need to do?");
      System.out.println("  ----Things that you can ask----");
      System.out.println("  press a - edit teacher's name");
      System.out.println("  press b - edit average grade");
      System.out.println("  press c - edit the ties color");
      System.out.println("  press d - edit classroom");
      System.out.println("  -------------------------------");

      System.out.print("  "); Scanner w2 = new Scanner(System.in);
      String cl2 =  w2.next();
      if (cl2.equals("a")) {
        System.out.print("Enter a new teacher's name: ");
        Scanner ls1 = new Scanner(System.in);
        String cl1 =  ls1.next();
        theSubject.setTeacherName(cl1);
        System.out.println(" ");
        System.out.println("---Successful!---");
        System.out.println(theSubject.getName() + "\'s updated teacher's name is " + theSubject.getTeacherName());

      }else if (cl2.equals("b")) {
        System.out.print("Enter a new average grade: ");
        Scanner ls2 = new Scanner(System.in);
        String ms2 =  ls2.next();
        theSubject.setAverageGrade(ms2);
        System.out.println(" ");
        System.out.println("---Successful!---");
        System.out.println(theSubject.getName() + "\'s updated average grade is " + theSubject.getAverageGrade());

      }else if (cl2.equals("c")) {
        System.out.print("Enter a new ties color: ");
        Scanner ls3 = new Scanner(System.in);
        String cl3 =  ls3.next();
        theSubject.setForWhichTie(cl3);
        System.out.println(" ");
        System.out.println("---Successful!---");
        System.out.println(theSubject.getName() + "\'s updated ties color is " + theSubject.getForWhichTie());

      }else if (cl2.equals("d")) {
        System.out.print("Enter a new classroom: ");
        Scanner ls4 = new Scanner(System.in);
        int cl4 =  ls4.nextInt();
        theSubject.setclassroom(cl4);
        System.out.println(" ");
        System.out.println("---Successful!---");
        System.out.println(theSubject.getName() + "\'s updated classroom is " + theSubject.getclassroom());

      }



      //=======================================================
      //=======================================================
      //=======================================================
      //=======================================================
  }else if (scanChoice1Result.equals("b")) {
    //print all the student's name
      System.out.println("--------Name list of Student--------");

      for (int i = 0; i < listOfStudent.size(); i++) {
          System.out.println("    " + listOfStudent.get(i).getName());
        }
      System.out.println("-------------------------------");

    //learn more about student
      System.out.println("");
      System.out.println("Which student would you like to know more about?");
      System.out.print("  "); Scanner inputStudentName = new Scanner(System.in);
      String choice = inputStudentName.next();

      Boolean found = false;
        Student theStudent = new Student("test", "test", "test", "test", "test", 0, 0, 0);
        for (int i = 0; i < listOfStudent.size(); i++) {
          if (choice.equals(listOfStudent.get(i).getName())) {
            System.out.println("");
            System.out.println("What about " + choice + "?");
            found = true;
            theStudent = listOfStudent.get(i);
            break;
          }
        }

        if (!found) {// (found == false)
          System.out.println("Sorry, we don't have that student...");
        }
        else {// (found == true)
          //print the choices
          System.out.println("  ----Things that you can ask----");
          System.out.println("  press a - name");
          System.out.println("  press b - tie color");
          System.out.println("  press c - favorite food");
          System.out.println("  press d - ethnicity");
          System.out.println("  press e - email");
          System.out.println("  press f - height");
          System.out.println("  press g - weight");
          System.out.println("  press h - age");
          System.out.println("  -------------------------------");

          //take the question and get the corresponding anwser
          System.out.print("  "); Scanner q = new Scanner(System.in);
          String question =  q.next();
          if (question.equals("a")) {
            System.out.println("Student's name is " + theStudent.getName());

          }else if (question.equals("b")) {
            System.out.println(theStudent.getName() + "\'s tie color is " + theStudent.getTieColor());

          }else if (question.equals("c")) {
            System.out.println(theStudent.getName() + "\'s favorite food is " + theStudent.getFavoriteFood());

          }else if (question.equals("d")) {
            System.out.println(theStudent.getName() + "\'s ethnicity is " + theStudent.getEthnicity());

          }else if (question.equals("e")) {
            System.out.println(theStudent.getName() + "\'s email is " + theStudent.getEmail());

          }else if (question.equals("f")) {
            System.out.println(theStudent.getName() + "\'s height is " + theStudent.getHeight());

          }else if (question.equals("g")) {
            System.out.println(theStudent.getName() + "\'s weight is " + theStudent.getWeight());

          }else if (question.equals("h")) {
            System.out.println(theStudent.getName() + "\'s age is " + theStudent.getAge());
          }

          System.out.println("  ");
          System.out.println("Is there anything you need to do?");
          System.out.println("  ----Things that you can ask----");
          System.out.println("  press a - edit student's name");
          System.out.println("  press b - edit tie color");
          System.out.println("  press c - edit favorite food");
          System.out.println("  press d - edit ethnicity");
          System.out.println("  press e - edit email");
          System.out.println("  press f - edit height");
          System.out.println("  press g - edit weight");
          System.out.println("  press h - edit age");
          System.out.println("  press i - add a new student");
          System.out.println("  -------------------------------");

          System.out.print("  "); Scanner q2 = new Scanner(System.in);
          String question2 =  q2.next();
          if (question2.equals("a")) {
            System.out.print("Enter a new name: ");
            Scanner s1 = new Scanner(System.in);
            String n1 =  s1.next();
            theStudent.setName(n1);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println("Student's updated name is " + theStudent.getName());

          }else if (question2.equals("b")) {
            System.out.print("Enter a new tie color: ");
            Scanner s2 = new Scanner(System.in);
            String n2 =  s2.next();
            theStudent.setTieColor(n2);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated tie color is " + theStudent.getTieColor());

          }else if (question2.equals("c")) {
            System.out.print("Enter a new favorite food: ");
            Scanner s3 = new Scanner(System.in);
            String n3 =  s3.next();
            theStudent.setFavoriteFood(n3);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated favorite food is " + theStudent.getFavoriteFood());

          }else if (question2.equals("d")) {
            System.out.print("Enter a new ethnicity: ");
            Scanner s4 = new Scanner(System.in);
            String n4 =  s4.next();
            theStudent.setEthnicity(n4);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated ethnicity is " + theStudent.getEthnicity());

          }else if (question2.equals("e")) {
            System.out.print("Enter a new email: ");
            Scanner s5 = new Scanner(System.in);
            String n5 =  s5.next();
            theStudent.setEmail(n5);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated email is " + theStudent.getEmail());

          }else if (question2.equals("f")) {
            System.out.print("Enter a new height (cm): ");
            Scanner s6 = new Scanner(System.in);
            int n6 =  s6.nextInt();
            theStudent.setHeight(n6);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated height is " + theStudent.getHeight());

          }else if (question2.equals("g")) {
            System.out.print("Enter a new weight (kg): ");
            Scanner s7 = new Scanner(System.in);
            int n7 =  s7.nextInt();
            theStudent.setWeight(n7);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated weight is " + theStudent.getWeight());

          }else if (question2.equals("h")) {
            System.out.print("Enter a new age: ");
            Scanner s8 = new Scanner(System.in);
            int n8 =  s8.nextInt();
            theStudent.setAge(n8);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println(theStudent.getName() + "\'s updated age is " + theStudent.getAge());
          }else if (question2.equals("i")) {
            Student newstudent = new Student("x", "x", "x", "x", "x", 1, 1, 1);
            listOfStudent.add(newstudent);
            System.out.println("---Successful!---");

            System.out.print("Enter a name: ");
            Scanner s1 = new Scanner(System.in);
            String n1 =  s1.next();
            theStudent.setName(n1);
            System.out.println(" ");
            System.out.println("---Successful!---");
            System.out.println("Student's name is " + theStudent.getName());

          }
        }
  }

System.out.println(" ");
//user's actions


  }

}
