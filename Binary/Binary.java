
//Due day: December 13th, 2017
import java.util.*;

public class Binary{

//print format
  public static void printResult(int[] result, String description){
    //print out the sum of binary
    int length = result.length;
    System.out.print(description);

    for (int i= 0; i < length; i++){
      System.out.print(result[i]);
    }
    System.out.print("\n");
  }

//------------Compare----------
  public static boolean isBigger(int[] data1, int[] data2){
    for (int i= 0; i < data1.length; i++){
      if (data1[i] > data2[i]){
          return true;
      }else if (data1[i] < data2[i]){
          return false;
      }
    }
    return true;

  }
  public static boolean isBiggerNotEqual(int[] data1, int[] data2){
    for (int i= 0; i < data1.length; i++){
      if (data1[i] > data2[i]){
          return true;
      }else if (data1[i] < data2[i]){
          return false;
      }
    }
    return false;

  }

//--------------Addition-------------
  public static int[] doAddition(int[] data1, int[] data2){

    boolean carryBoolean = false; //set the initial of carry
    int sum[] = new int[data1.length]; //build an array for sum

    //convert integer array into boolean array
    boolean[] booleanData1 = new boolean[data1.length];//boolean array for data1
    for (int i=0; i<data1.length; i++){
      if (data1[i] == 1)
      {
          booleanData1[i] = true;
      }
      else if (data1[i] == 0)
      {
          booleanData1[i] = false;
      }
    }

    boolean[] booleanData2 = new boolean[data1.length];//boolean array for data2
    for (int i=0; i<data1.length; i++){
      if (data2[i] == 1)
      {
          booleanData2[i] = true;
      }
      else if (data2[i] == 0)
      {
          booleanData2[i] = false;
      }
    }

    for (int i= 0; i < data1.length; i++){
      //logic for sum
      if ((booleanData1[data1.length-1-i] ^ booleanData2[data1.length-1-i]) ^ carryBoolean){
        sum[data1.length-1-i] = 1;
      }else{
        sum[data1.length-1-i] = 0;
      }
      //logic for carry
      if ((booleanData1[data1.length-1-i] && booleanData2[data1.length-1-i]) || (carryBoolean && (booleanData1[data1.length-1-i] ^ booleanData2[data1.length-1-i]))){
        carryBoolean = true;
      }else{
        carryBoolean = false;
      };
    }
    return sum;
  }

//--------------Subtraction-------------
  public static int[] doSubstraction(int[] data1, int[] data2){
    int difference[] = new int[data1.length];//result

    //Two's Compliment--convert the 2nd number
    int twoCompliment[] = new int[data1.length];

    int[] inverseData2 = new int[data1.length];
    for (int i=0; i<data1.length; i++){
      if (data2[i] == 1)
      {
          inverseData2[i] = 0;
      }
      else if (data2[i] == 0)
      {
          inverseData2[i] = 1;
      }
    }
    //build an int[] for 1 for latter +1
    int[] plus1 = new int[data1.length];
    for (int i= 0; i < data1.length; i++){
      if (i == data1.length-1){
        plus1[i] = 1;
      }else{
        plus1[i] = 0;
      }
    }

    twoCompliment = doAddition(plus1, inverseData2);//+1

    //add two's Compliment and data1
    return doAddition(twoCompliment, data1);
  }
//--------------Multiplication-------------
  //PS: In this case, we time data1 by the number of data2
  public static int[] doMultiplication(int[] data1, int[] data2){
    int counter[] = new int[data1.length];
    int zero[] = new int[data1.length];
    int product[] = new int[data1.length];

    //build an int[] for 1 for latter +1
    int[] one = new int[data1.length];
    for (int i= 0; i < data1.length; i++){
      if (i == data1.length-1){
        one[i] = 1;
      }else{
        one[i] = 0;
      }
    }
    for (int i= 0; i < data1.length; i++){
      zero[i] = 0;
    }
    //set initial for product = data1
    for (int i= 0; i < data1.length; i++){
      product[i] = 0;
    }
    //set initial for counter = data1
    for (int i= 0; i < data2.length; i++){
      counter[i] = data2[i];
    }

    while (isBiggerNotEqual(counter, zero) == true){
      product = doAddition(product, data1);
      counter = doSubstraction(counter, one);

    }

    return product;
  }

//--------------Division-------------
  public static int[][] doDivision(int[] data1, int[] data2){
    int counter = 0;
    int quotient[] = new int[data1.length];//binary version of counter
    int remainder[] = new int[data1.length];

    int[][] finalQuotient = new int[2][data1.length];


    for (int i= 0; i < data1.length; i++){
      remainder[i] = data1[i];
    }
    while (isBigger(remainder, data2) == true){
      remainder = doSubstraction(remainder, data2);
      counter = counter+1;
    }

    //build an int[] for 1 for latter +1
    int[] plus1 = new int[data1.length];
    for (int i= 0; i < data1.length; i++){
      if (i == data1.length-1){
        plus1[i] = 1;
      }else{
        plus1[i] = 0;
      }
    }
    //set the initial for initial[]
    for (int i= 0; i < data1.length; i++){
      quotient[i] = 0;
    }
    for (int i= 0; i < counter; i++){
      quotient = doAddition(quotient, plus1);
    }

    for (int i=0; i<remainder.length; i++){
      finalQuotient[0][i] = remainder[i];
    }
    for (int i=0; i<quotient.length; i++){
      finalQuotient[1][i] = quotient[i];
    }
    return finalQuotient;
  }




  public static void main(String[] args) {
    int length = 8;
    Binary binaryCalculator = new Binary();
    System.out.println("---Binary Calculator---");

    //inputs----------------------------------------
    System.out.print("Input 1st binary number (start with 0): ");
    Scanner input1 = new Scanner(System.in);
    String number1 = input1.nextLine();

    System.out.print("Input 2nd binary number (start with 0): ");
    Scanner input2 = new Scanner(System.in);
    String number2 = input2.nextLine();

    System.out.print("Choose (add, substract, multiply, divide): ");
    Scanner operator = new Scanner(System.in);
    String operation = operator.nextLine();

  //-------------#1-------------------------------
    //--build array for input1
    int data1[] = new int[2*length];

    for (int i= 0; i < 2*length; i++){
      if (i>=length){
        char tempChar = number1.charAt(i-length);
        data1[i] = Character.getNumericValue(tempChar);
      }else{
        data1[i] = 0;
      }
    }

    //--define the size of data1 (array)
    int size1 = number1.length();

    //--ensure it is 8-bit
    if (size1 != 8){
      System.out.println("Error! the first input is not 8-bit");
      System.exit(0);
    }
  //---------------#2-------------------------
    //--build array for input2
    int data2[] = new int[2*length];

    for (int i= 0; i < 2*length; i++){
      if (i>=length){
        char tempChar = number2.charAt(i-length);
        data2[i] = Character.getNumericValue(tempChar);
      }else{
        data2[i] = 0;
      }
    }

      //-------------------Call Methods---------------------
      //---call Addition
      if (operation.equalsIgnoreCase("add")){
        int[] sum = doAddition(data1, data2);
        printResult(sum, "The sum of the binary is: ");
      }

      //---call Subtraction
      if (operation.equalsIgnoreCase("substract")){
        int[] sub = doSubstraction(data1, data2);
        printResult(sub, "The difference of the binary is: ");
      }

      //---call Multiplication
      if (operation.equalsIgnoreCase("multiply")){
        int[] total = doMultiplication(data1, data2);
        printResult(total, "The product of the binary is: ");
      }

      //---call Division
      if (operation.equalsIgnoreCase("divide")){
        int[][] total = doDivision(data1, data2);
        printResult(total[0], "The remainder of the binary is: ");
        printResult(total[1], "The quotient of the binary is: ");
      }


  //-------------TESTING-------------------------------

  }
}
