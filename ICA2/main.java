//Author: Joan Aoanan
//File: main.java
public class main
{
  public static void main (String [] args)
  {
    // Initialize variables

    String name = "Bobby";
    String animal = "Aadvark";
    int age = 300;

    //Call constructor
    Pet pets = new Pet(name, animal, age);

    //Set information
    pets.setName(name);
    pets.setAge(age);
    pets.setAnimal(animal);


    //Display the information
    System.out.println ("This is the name of my pet: " + pets.getName() );
    System.out.println ("This is the age of my pet in years: " + pets.getAge());
    System.out.println ("My pet is an " + pets.getAnimal());
    System.out.println ("Thank you for listening to my story");

  }
}
