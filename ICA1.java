//ICAI.java: In class assignment
// Joan Aoanan 

import javax.swing.JOptionPane;

public class ICA1 {

  public static void main (String [] args)
  {
      String number;
      double meters;
      String menuType;
      int option;


      JOptionPane.showMessageDialog(null, "Greetings Earthling");

      do {
        number = JOptionPane.showInputDialog( "Enter a number of meters greater than 0");
        meters = Double.parseDouble(number);
      }while ( meters <= 0);

      do {
        menu();
        menuType = JOptionPane.showInputDialog("Here is a reminder your options: "
        +" Enter the integer number \n" +"1. Convert to kilometers\n" + "2. Convert to inches\n"
        + "3. Convert to feet\n" + "4.Quit the program\n");

        option = Integer.parseInt(menuType);

        if (option == 1)
          showKilometers(meters);
        else if (option == 2)
          showInches(meters);
        else if (option == 3)
          showFeet(meters);
        else if (option == 4);
        else
        {
          JOptionPane.showMessageDialog(null, "Error, please enter a number 1-4");
        }
      } while (option != 4);

      JOptionPane.showMessageDialog(null, "Goodbye");
  }

  public static void menu()
  {
    JOptionPane.showMessageDialog(null, "In the next dialogue box, enter which option would you like to choose\n"
      +"1. Convert to kilometers\n" + "2. Convert to inches\n"
      + "3. Convert to feet\n" + "4.Quit the program\n");
  }

  public static void showKilometers (double meters)
  {
    double kilometers = meters * .001;
    JOptionPane.showMessageDialog(null, meters + " is " + kilometers +
      " kilometers");
  }

  public static void showInches (double meters)
  {
    double inches = meters * 39.37;
    JOptionPane.showMessageDialog(null, meters + " is " + inches +
    " inches");
  }

  public static void showFeet (double meters)
  {
    double feet = meters * 3.281;
    JOptionPane.showMessageDialog(null, meters + " is " + feet +
      " feet");
  }
}
