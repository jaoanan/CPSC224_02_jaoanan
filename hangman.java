import java.util.*;
import javax.swing.JOptionPane;

public class hangman {
  public static void main (String [] args)
  {

//initializes string array
    String[] words = new String[]
    { "hello", "encyclopedia","flamingo", "cellphone" };

    int menuChoice;
    int length = 0;
    int[] strikes = new int[] {0};
  menuChoice = displayMenu();
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
    displayArray(word);
      char guess;
      char[] findWord = new char [length];
      setArray(findWord, length);
      displayArray(findWord);
      while(strikes[0] !=6)
      {
      guess=inptGuess();
      boolean correct = compareGuess(word, findWord, length, guess);
      if (!correct)
      {
        incorrect (correct, strikes);
      }
      else{}
    }
\
    displayArray(findWord);

  }

 else if (menuChoice == 2)
 {
   //selects the string
    String inptStrng;
    inptStrng = userString();

    //converts string array to character
    length = lengthString(inptStrng);
    char[] word2 = new char[length];
    convertString(inptStrng, word2, length);
    displayArray(word2);

    //CharacterGuess

      char guess;
      char[] findWord = new char [length];
      setArray(findWord, length);
      displayArray(findWord);
      while(strikes[0] !=6)
      {
      guess=inptGuess();
      boolean correct = compareGuess(word2, findWord, length, guess);
      if (!correct)
      {
        incorrect (correct, strikes);
      }
      else{}
    }

  }
else{}

//displays the char array
//accepts an int and creates a char array of that size Then it
 //sets each element in the array to an underscore '_' Then it returns the
// char array.
   
size = 27;
char[] alphabet(int size) {
char[] charArray = new char[size];
for (int i = 0; i < charArray.length; i++)
charArray[i] = '_';
return charArray;
}

  //  char[] alphabet = new char[27];
    //initializeAlphabet(alphabet);
    //displayAlphabet(alphabet);
  }
//if it exceeds max tries   
if(strikes == MAX_TRIES )
	{
		system.out.println("\nSorry, you lose...you've been hanged.");
		system.out.println("The word was : " + word );
  else 
  { 
    system.out.println ("You win! Congrats");
    
  }
    

  public static void incorrect( boolean correct, int[] strikes)
  {
    int numStrike = strikes[0];
    strikes[0] = numStrike+1;

    if (strikes[0] == 1)
      JOptionPane.showMessageDialog (null, " O ");
    else if (strikes[0] == 2)
      JOptionPane.showMessageDialog (null, " O \n"+ " |\n" + " |\n");
    else if (strikes[0] == 3)
      JOptionPane.showMessageDialog (null,  " O \n"+ "\\|\n" +" |\n" );
    else if (strikes[0] == 4)
      JOptionPane.showMessageDialog (null, " O \n"+ "\\|/\n" +" |\n");
    else if (strikes[0] == 5)
      JOptionPane.showMessageDialog (null, " O \n"+ "\\|/\n" +" |\n"+"/");
    else if (strikes[0] == 6)
      JOptionPane.showMessageDialog (null,
      " O \n"+ "\\|/\n" +" |\n"+"/"+"\\");
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
      if (word[i] == guess)
      {

      }
      else{}
    }
    return location;
  }

  public static char inptGuess()
  { String guess;
    char charGuess;
    guess = JOptionPane.showInputDialog("What letter do you want to guess");
    charGuess = guess.charAt(0);
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

  public static void displayArray(char[] word)
  {
    for (char c: word)
    {
      System.out.print(c);
    }
    System.out.print ("\n");
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
/*
  public static void initializeAlphabet( char[] alphabet)
  {
  qqqqqqqqqqqqqqqqqq
    int x = 0;
    for (char i = 'a'; i <= 'z'; i++)
    {
      alphabet[x] = i;
      x++;
    }
  }

  public static void displayAlphabet(char[] alphabet)
  {
    for (char x = 0; x<=26; x++)
    {
      System.out.print( alphabet[x] + " ");
    }
    System.out.println();
  }
*/

}
