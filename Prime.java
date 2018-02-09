/* Prime.java by Mr. Considine
This program holds all of the definitions and
methods and variables for the Prime class.
The goal of Prime is to calculate the
next largest prime of an inputted integer.
*/
import java.util.*;


//create class
public class Prime{

  public static void printPrimeFactors(int num) {
    if (num == 2) {
      System.out.println(num);
    }
    for (int i = 2; i <= num; i++) {//can be: int (num/2) becaues no number can have factor greater than half of it
      if (num%i == 0) {
        System.out.println(i);
        printPrimeFactors(num/i);//calling the method inside the method
        //num = num/i;
        break;
      }
    }


  }

  public static long mersnnePrime(int power) {
    long finalM = 0;//default = 0;
    for (int i = 1; i < power; i++){
      long mNum = 2^i - 1;
      if (checkPrime(mNum)){
        finalM = mNum;
        break;
      }
    }

    return finalM;
  }

  public static boolean checkPrime(long check) {
    boolean isPrime = true;
    for (long i = 2; i < check; i++) {
      // '%' is the mod operator. It tells you what the remainder
      // is if you were to divide the two numbers.
      if (check%i == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }


  public static int nextPrime(int x) {
    int next = x + 1;
    while (true) {
      if (checkPrime(next)) {
        break;
      }
      else {
        next = next + 1;
      }
    }
    return next;
  }

//create main
  public static void main(String[] args) {

    //create prompt
    System.out.println("------Welcome to Prime------");


    //inputs----------------------------------------
    System.out.print("Your number: ");
    Scanner input1 = new Scanner(System.in);
    int num = input1.nextInt();

    //pass baseNum to the nextPrime methods
    //printPrimeFactors(num);//no output so don't set it = sth
    long result = mersnnePrime(num);
    System.out.println(result);


  }
}
