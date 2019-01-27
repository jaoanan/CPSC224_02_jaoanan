/***************
Homework #1
Due Date: January 29, 2019
Names: Joan Aoanan and Aisha Burka
********************/
import java.util.Random;

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
              hand[dieNumber] = 5;
          }
      }
    }
  }
}
