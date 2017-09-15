//Kitty Liu 2017.9.15
import java.awt. *;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
public class CoffeeShop
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Kittenish Coffee, may I take your order?");
		Scanner input= new Scanner(System.in);
		String order=input.nextLine();

		System.out.println("Can I have a name for that?");
	  Scanner input2= new Scanner(System.in);
		String name= input2.nextLine();

		System.out.println("One moment please....");
    System.out.printf("%s! Your %s is ready! ", name, order);

		System.out.println("Have a nice day~");
		System.exit(0);

	}
}
