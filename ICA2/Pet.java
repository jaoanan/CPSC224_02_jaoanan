//Author: Joan Aoanan
//File: Pet.java

public class Pet
{
  private String name;
  private String animal;
  private int age;

  // Constructor
  public Pet (String inptName, String inptAnimal, int inptage)
  {
  name = inptName;
  animal = inptAnimal;
  age = inptage;

  }
  //Setting the variables
  public  void setName(String petName)
  {
    name = petName;
  }
  public  void setAnimal(String petAnimal)
  {
    animal = petAnimal;
  }

  public  void setAge(int petAge)
  {
    age = petAge;
  }
  // Getting the variables

  public  String getName()
  {

    return name;
  }
  public  String getAnimal()
  {
    return animal;
  }

  public  int getAge()
  {

    return age;
  }
}
