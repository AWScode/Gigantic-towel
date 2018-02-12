/* Pound.java by Mr. Considine
This class holds all of the data and methods
to create Pound objects. This is a class used
other files such as Dog.java and Owner.java */

public class Pound {

  public static void main(String[] args) {
    System.out.println("Welcome to the Pound!");
    System.out.println("Here we have some dogs to see.");

    Dog fido = new Dog("Fido", 5, "Mr. Burns");

    Dog marble = new Dog("Marble", 2, "Ms. Billings");

    Dog cat = new Dog("Actually a Scone", 20, "Mr. Sidman");

    System.out.println("Here is one now:");

    fido.bark();
    String newName = fido.getName();
    System.out.println("Dog's name is: " + newName);
  }
}
