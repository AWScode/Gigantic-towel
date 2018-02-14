import java.util.*;

public class Subject {

  public static void main(String[] args) {
    System.out.println("Welcome to Annie Wright School director!");
    System.out.println("Here we have some students.");

    Student Justin = new Student("Justin Huang", "green", "Feb. 19th, 2002", "Chinese", "minghao_huang@aw.org", 180, 56);
    Student Kunkun = new Student("Xukun Cai", "red", "Oct. 7th, 1998", "Chinese", "xukun_cai@aw.org", 182, 59);


    System.out.println("Here is one student now:");

    Justin.greet();
    String printName = Justin.getName();
    System.out.println("The name of this student: " + printName);
//still have problem
//how do i get the specific student's info?
/*in the terminal:
    Welcome to Annie Wright School director !
    Here we have some dogs to see.
    Here is one student now:
    Hello, my name is Xukun Cai. Nice to meet you!
    The name of this student: Xukun Cai
*/

  }

}
