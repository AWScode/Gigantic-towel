//Kitty Liu
//Due day: December 13th, 2017
import java.util.*;

public class Binary{





  public static void main(String[] args) {
    System.out.println("---Binary Calculator---");

    //inputs----------------------------------------
    System.out.println("Input first binary number: ");
    Scanner input1 = new Scanner(System.in);
    String number1 = input1.nextLine();

    System.out.println("Input second binary number: ");
    Scanner input2 = new Scanner(System.in);
    String number2 = input2.nextLine();

    System.out.println("Choose (add, subtract, multiply, divide): ");
    Scanner operator = new Scanner(System.in);
    String operation = operator.nextLine();

    //display the output-------------------------------
    System.out.println("Sum of the binary numbers: ");

    System.out.println(number1);
    System.out.println(number2);
    System.out.println(operation);




    //build array for input1
    int data1[] = new int[8];

    for (int i= 0; i < 8; i++){
      char tempChar = number1.charAt(i);
      data1[i] = Character.getNumericValue(tempChar);
    }



    for (int i= 0; i < 8; i++){
      System.out.print(data1[i]);
    }
    System.out.print("\n");


/*
    //build array for input2
    int data2[] = new int[8];



    //TESTING-------------------------------


    if (data1.size > 8 || data2.size > 8){
      System.out.println("the number is too big!!");
    }
    if (data1.size < 8 || data2.size < 8){
      System.out.println("the number is too small!!");
    }
    if (operation != add || operation != add || operation != add || operation != add ||){
      System.out.println("the number is too small!!");
    }



*/


  }
}
