import javax.swing.*;
import java.awt.*;
import javax.swing.border.AbstractBorder;

public class P1 extends JPanel
{
  private JTextField inptName;
  private JLabel name;
  private JLabel wins;
  private JLabel losses;
  private JLabel numWins;
  private JLabel numLosses;
  private int intWins;
  private int intLosses;
  gridPanel newGridObj = new gridPanel();


  //constructor

  public P1()
  {
    setLayout(new GridLayout(3,3));
    setBorder(BorderFactory.createTitledBorder("player 1 (X)"));

    int [] p1 = newGridObj.getP1Array();

    name = new JLabel("Name: ");

    JTextField inptName = new JTextField(10);
    inptName.setEditable(true);

    wins = new JLabel("Wins: ");
    losses = new JLabel("Losses: ");

    intWins =setWins(p1);
    intLosses = setLosses(p1);

    numWins = new JLabel("");
    numWins.setText(String.valueOf(intWins));

    numLosses = new JLabel("");
    numLosses.setText(String.valueOf(intLosses));

    add(name);
    add(inptName);
    add(wins);
    add(numWins);
    add(losses);
    add(numLosses);

  }
  
  public int setWins (int[] p1)
  {
    intWins = p1[0];
    return intWins;
  }

  public int setLosses (int[] p1)
  {
    intLosses = p1[1];
    return intLosses;
  }

}
