/***************
Homework #1
Due Date: January 29, 2019
Names: Joan Aoanan and Aisha Burka
********************/
import java.util.Random;
import java.util.Scanner;

public class yahtzee1 {
  public static void main(String [] args) {
    final int DICE_IN_PLAY = 5;
    int[] hand = new int[DICE_IN_PLAY];
    char playAgain ='y';

    while( playAgain == 'y')
    {
      String testString= {"nnnnn"};
      char[] keep = testString.toCharArray();
      int turn = 1;
      while(turn < 4 && keep != "yyyyy")
      {
          for(int dieNumber = 0; dieNumber < DICE_IN_PLAY; dieNumber++)
          {
            if(keep[dieNumber] !='y')
              hand[dieNumber] = 5; // Stopped on line 32 of the .cpp file
          }
      System.out.println("Your roll was: ");
      for (int dieNumber = 0; dieNumber < DICE_IN_PLAY; dieNumber++)
        {
          System.out.println(hand[dieNumber] + " ");

        }
        System.out.println();
        if (turn < 3)
        {
          System.out.println("Enter dice to keep (y or n)");
          keep = sc.nextLine();
        }
        turn++;
      }
      sortArray(hand, DICE_IN_PLAY);
      System.out.println("Here is your sorted hand : ")
      for(int dieNumber = 0; dieNumber < DICE_IN_PLAY; dieNumber++)
      {
        System.out.println(hand[dieNumber] + " ";
      }
      System.out.println();
      for(int dieValue = 1; dieValue <=6; dieValue++)
      {
        int currentCount = 0;
        for(int diePosition = 0; diePosition < 5; diePosition++)
        {
          if (hand[diePosition == dieValue])
            currentCount++;
        }
        System.out.println( "Score " + dieValue * currentCount + " on the "
          + dieValue + " line");
      }

    }
  }
}
