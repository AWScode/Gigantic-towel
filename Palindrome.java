//Kitty October 20th, 2017
import java.util.*;


public class Palindrome {

    public static boolean palindromeCheck(String test){
      char[] word = test.toCharArray(); //convert String to char array
      int i1 = 0;
      int i2 = word.length - 1;
      while (i2 > i1) {
        if (word[i1] != word[i2]) {
                 return false;
             }
             ++i1;
             --i2;
      }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }

    }

}
