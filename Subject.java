import java.util.*;

public class Subject {
  //all the data
      private String className;
      private String classTeacherName;
      private String classAverageGrade;
      private String classForWhichTie;
      private int classNumberOfStudent;
      private int classroom;


      public Subject(String a, String b, String c, String d, int g) {
        this.className = a;
        this.classTeacherName = b;
        this.classAverageGrade = c;
        this.classForWhichTie = d;
        this.classroom = g;
      }

      //"getters"
        public void getAllStudent(){


        }
        public String getName() {
          return className;
        }
        public String getTeacherName() {
          return classTeacherName;
        }
        public String getAverageGrade() {
          return classAverageGrade;
        }
        public String getForWhichTie() {
          return classForWhichTie;
        }

        public int getclassroom() {
          return classroom;
        }


      //"setters"

        public void setName(String a) {
          className = a;
        }
        public void setTeacherName(String b) {
          classTeacherName = b;
        }
        public void setAverageGrade(String c) {
          classAverageGrade = c;
        }
        public void setForWhichTie(String d) {
          classForWhichTie = d;
        }
        public void setclassroom(int g) {
          classroom = g;
        }




}
