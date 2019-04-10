import javax.swing.*;
import java.awt.*;
import javax.swing.border.AbstractBorder;

public class P2 extends JPanel
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

  public P2()
  {
    setLayout(new GridLayout(3,3));
    setBorder(BorderFactory.createTitledBorder("player 2 (O)"));

    int [] p2 = newGridObj.getP2Array();

    name = new JLabel("Name: ");

    JTextField inptName = new JTextField(10);
    inptName.setEditable(true);

    wins = new JLabel("Wins: ");
    losses = new JLabel("Losses: ");


    intWins =setWins(p2);
    intLosses = setLosses(p2);

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
  public int setWins (int p2[])
  {
    intWins =p2[0];
    return intWins;
  }

  public int setLosses (int []p2)
  {
    intLosses = p2[1];
    return intLosses;
  }


}
