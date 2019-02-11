import java.util.*;
import javax.swing.JOptionPane;

public class hangman {
  public static void main (String [] args)
  {

//initializes string array
    String[] words = new String[]
    { "hello", "encyclopedia","flamingo", "cellphone" };

    boolean validString;
    int menuChoice;
    int length = 0;
    int[] strikes = new int[] {0};
    menuChoice = displayMenu();
    char guess;
    int maxTries = 6;
    boolean correct = true;
    boolean win = false;
    boolean validInpt = true;

// System.out.println (menuChoice);
//    menuChoice =2;

//OPTION 1
//randomizes word in string

    if (menuChoice == 1)
    {
    //randomly selects the string
      String rndmString;
      rndmString =randomString(words);
      System.out.println(rndmString);

    //turns string into a character array
      length = lengthString(rndmString);
      char[] word = new char[length];
      convertString(rndmString, word, length);
      //displayArray(word);


      char[] findWord = new char [length];
      setArray(findWord, length);
      displayArray(findWord, length);

      while(strikes[0] != maxTries && win == false)
      {
        do
        {
          guess=inptGuess();
          validInpt = validCharInput(guess);
        }while(!validInpt);
        guess = convertLetter(guess);

        correct = compareGuess(word, findWord, length, guess);
        wrongGuess(findWord, strikes, correct, length, maxTries);
        win = checkWin(findWord, length);
      }
      gameResult(strikes, win, rndmString, maxTries);

    }

     else if (menuChoice == 2)
     {
       //selects the string
        String inptStrng;
        do
        {
        inptStrng = userString();
        validString = validInput(inptStrng);
        } while(!validString);
        //converts string array to character
        length = lengthString(inptStrng);
        char[] word2 = new char[length];
        convertString(inptStrng, word2, length);
        //displayArray(word2);

        //CharacterGuess


        char[] findWord = new char [length];
        setArray(findWord, length);
        displayArray(findWord, length);
        while(strikes[0] != maxTries && win ==false)
        {
        do
        {
          guess=inptGuess();
          validInpt = validCharInput(guess);
        }while(!validInpt);
        guess = convertLetter(guess);

        correct = compareGuess(word2, findWord, length, guess);
        wrongGuess(findWord, strikes, correct, length, maxTries);
        win = checkWin(findWord, length);
        }
        gameResult(strikes, win, inptStrng, maxTries);
      }

else{}

}

  public static void wrongGuess(char[] findWord, int[] strikes, boolean correct, int length, int maxTries)
  {
    if (!correct)
    {
      incorrect (correct, strikes);
      if(strikes[0] < maxTries)
        displayArray(findWord, length);
    }
    else{
      JOptionPane.showMessageDialog(null, "Congrats you guessed correctly! \n"
        + "You have " +strikes[0]+ " strikes");

      displayArray(findWord, length);
    }
  }



  public static char convertLetter (char charGuess)
    {
      int intGuess = charGuess;
      if(intGuess < 97)
      {
        intGuess += 32;
        charGuess = (char)intGuess;
      }
      else {}
      return charGuess;
    }

public static void gameResult(int[] strikes, boolean win, String word, int maxTries)
  {
    if(strikes[0] == maxTries)
    {
      JOptionPane.showMessageDialog( null, "Sorry, you lose...you've been hanged.\n"
          +"The word was " + word);
    }
    else
    {
      JOptionPane.showMessageDialog(null, "Congrats, You won! \n");

    }
  }

public static boolean validInput(String input)
  {
    boolean validInpt = true;
    for (int i = 0; i < (input.length()); i++)
    {
      if (input.charAt(i) > 96 && input.charAt(i) < 123)
          validInpt = true;
      else if (input.charAt(i) > 64 && input.charAt(i) < 91)
          validInpt = true;
      else
        {
        JOptionPane.showMessageDialog( null, "Enter a valid letter" );
        validInpt = false;
        break;
        }
    }

    return validInpt;
  }

  public static boolean validCharInput(char input)
    {
      boolean validInpt = true;
      int intInput = input;
        if (intInput > 96 && intInput < 123)
            validInpt = true;
        else if (intInput > 64 && intInput < 91)
            validInpt = true;
        else
          {
          JOptionPane.showMessageDialog( null, "Enter a valid letter" );
          validInpt = false;
          }

      return validInpt;
    }

public static boolean checkWin(char[] findWord, int length)
{
  boolean win;
  if (new String(findWord).contains("_"))
    win = false;
  else
    win = true;
  return win;
}

  public static void incorrect( boolean correct, int[] strikes)
  {
    int numStrike = strikes[0];
    strikes[0] = numStrike+1;
    JOptionPane.showMessageDialog (null, "Oh NO! you guessed incorrectly you have "
      + strikes[0]+ " strikes");
    if (strikes[0] == 1)
      JOptionPane.showMessageDialog (null, " O ");
    else if (strikes[0] == 2)
      JOptionPane.showMessageDialog (null," O \n"+ " |\n" + " |\n");
    else if (strikes[0] == 3)
      JOptionPane.showMessageDialog (null, " O \n"+ "\\|\n" +" |\n" );
    else if (strikes[0] == 4)
      JOptionPane.showMessageDialog (null, " O \n"+ "\\|/\n" +" |\n");
    else if (strikes[0] == 5)
      JOptionPane.showMessageDialog (null,  " O \n"+ "\\|/\n" +" |\n"+"/");
    else if (strikes[0] == 6)
      {
      JOptionPane.showMessageDialog (null,
        " O \n"+ "\\|/\n" +" |\n"+"/"+"\\");
      JOptionPane.showMessageDialog (null, "GAME OVER");

      }
  }

  public static boolean compareGuess  (char[] word, char []findWord, int length, char guess)
  {
    boolean location = false;
    String convert = String.valueOf(guess);
    if (new String(word).contains(convert))
       location = true;
    else;

    for (int i = 0; i < length; i ++)
    {
      if (word[i] == guess)
      {
        findWord[i] = guess;
      }
      else{}
    }
    return location;
  }

  public static char inptGuess()
  {
    String guess;
    char charGuess;
    guess = JOptionPane.showInputDialog("What letter do you want to guess");
    charGuess = guess.charAt(0);
/*
    int intGuess = charGuess;

    if(intGuess < 97)
    {
      intGuess += 32;
      charGuess = (char)intGuess;
    }
    else {}
    */
    return charGuess;
  }

  public static void setArray(char[] findword, int length)
  {
    for(int i = 0; i < length; i++)
      {
        findword[i] ='_';
      }
  }

  public  static String userString()
    {
      String inptStrng;
      inptStrng= JOptionPane.showInputDialog("Enter the  word you want a user to ask");
      return inptStrng;
    }

public static void displayArray(char[] word, int length)
{
  String array = new String (word);
  JOptionPane.showMessageDialog(null, "This word is " + length + " characters long \n"
    + array);
}

  public static int lengthString(String word)
  {
    return word.length();
  }
  public static void convertString(String slctdString, char[] word, int length)
  {
    for (int i = 0; i < length; i++)
    {
      word[i] = slctdString.charAt(i);
    }

  }

  public static String randomString(String[] words)
  {
    String selectedString;
    Random rand = new Random();
    int number = rand.nextInt(4);
    selectedString = words[number];
    return selectedString;
  }

  public static int displayMenu()
  {
    String selection;
    int option;
    selection = JOptionPane.showInputDialog("Screen menu, enter the appropriate integer \n"
      + "1. Play game from a randomly chosen word in a list\n"
      + "2. Play game from a word entered by another user\n"
      + "3. Exit Game");
    option = Integer.parseInt(selection);
    return option;
  }

}
