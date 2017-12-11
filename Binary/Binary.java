//Kitty Liu
//Due day: December 13th, 2017
import java.util.*;

public class Binary{




  public void doAddtion(){
    //set the initial of carry
    int carry = 0;
    //build an array for sum
    int sum[] = new int[8];

    for (int i= 0; i < 8; i++){

      if (data1[7-i] ^ data2[7-i] ^ carry){
        sum[7-i] = 1;
      }else{
        sum[7-i] = 0;
      }

      if ((data1[7-i] && data2[7-i]) || (carry && sum[7-i])){
        int carry = 1;
      }else{
        int carry = 0;
      };
    }
    //print out the sum of binary
    System.out.print("The sum of binary: ");

    for (int i= 0; i < 8; i++){
      System.out.print(sum[i]);
    }
    System.out.print("\n");
  }





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



//-------------#1-------------------------------
    //--build array for input1
    int data1[] = new int[8];

    for (int i= 0; i < 8; i++){
      char tempChar = number1.charAt(i);
      data1[i] = Character.getNumericValue(tempChar);
    }

    //--define the size of data1 (array)
    int size1 = number1.length();
    //System.out.println("String length is: " + size1);

    //--ensure it is 8-bit
      if (size1 != 8){
        System.out.println("Error! the first input is not 8-bit");
        System.exit(0);
      }
//---------------#2-------------------------
      //--build array for input2
      int data2[] = new int[8];

      for (int i= 0; i < 8; i++){
        char tempChar = number1.charAt(i);
        data1[2] = Character.getNumericValue(tempChar);
      }

      //--define the size of data1 (array)
      int size2 = number2.length();
      //System.out.println("String length is: " + size1);

      //--ensure it is 8-bit
        if (size2 != 8){
          System.out.println("Error! the first input is not 8-bit");
          System.exit(0);
        }


      /* uncompleted ensure it is binary
     if (data1[1] != 1){
        System.out.println("Error! the first input is not binary");
        System.exit(0);
      }
      if (data1[1] != 0){
        System.out.println("Error! the first input is not binary");
        System.exit(0);
      }
*/
//-------------#2-------------------------------
    //build array for input2
  //  int data2[] = new int[8];

//-------------TESTING-------------------------------
    //print #1
    for (int i= 0; i < 8; i++){
      System.out.print(data1[i]);
    }
    System.out.print("\n");















  }
}
