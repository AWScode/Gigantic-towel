//Kitty Liu
//Due day: Friday Feb 2, 2018
import java.util.*;

public class nextLargestPrime{
  public static boolean isPrime(int intNumber){
    int maybePrimeNumber = intNumber;
    int remainder = 9999; //9999 = default value
    boolean itIsPrime  = true;

    //System.out.println("--test1--");
    for (int i = 2; i < maybePrimeNumber ; i++) {//i = the # that is being divided
      remainder = maybePrimeNumber % i;
      //System.out.println("The remainder: " + remainder);
      if (remainder < 1){
        itIsPrime = false;
        break;
      }
    }
    //System.out.println("itIsPrime: " + itIsPrime);
    return itIsPrime;
  }

  public static int doNextPrime(int intNumber){
    int maybePrimeNumber = intNumber;
    int theRealNextPrime = 9999;//9999 = default

    //System.out.println("--test2--");
    for (int i = maybePrimeNumber + 1; i > 0 ; i++) {
      if (isPrime(i) == true ){
        theRealNextPrime = i;
        //System.out.println("The theRealNextPrime: " + theRealNextPrime);
        break;
      }
    }



    return theRealNextPrime;
  }




  public static void main(String[] args) {
    System.out.println("--------Find the next prime number--------");

    //inputs----------------------------------------
    System.out.print("Your number: ");
    Scanner input = new Scanner(System.in);
    String stringNumber = input.nextLine();

    //convert string to int
    int intNumber = Integer.parseInt(stringNumber);

    int finalResult = doNextPrime(intNumber);

    System.out.print("The next largest prime number: ");
    System.out.println(finalResult);







  }
}
