import javax.swing.JOptionPane;

public class test{
  public static void main(String[] args)

{
    char guess = 'A';
    int intGuess = guess;

    if(intGuess < 97)
    {
      intGuess += 32;
      guess = (char)intGuess;
    }
    else {}
    System.out.println (guess);
  }
}
