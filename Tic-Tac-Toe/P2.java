import javax.swing.*;
import java.awt.*;
import javax.swing.border.AbstractBorder;

public class P2 extends JPanel
{
  private JTextField inptName;
  private JLabel name;
  private JLabel wins;
  private JLabel losses;
  private JTextField inptWins;
  private JTextField inptLosses;
  //private Border border;
  //private TitledBorder border;


  //constructor

  public P2()
  {
    setLayout(new GridLayout(3,3));
    setBorder(BorderFactory.createTitledBorder("player 2 (O)"));

    name = new JLabel("Name: ");

    JTextField inptName = new JTextField(10);
    inptName.setEditable(true);

    wins = new JLabel("Wins: ");
    losses = new JLabel("Losses: ");

    JTextField inptWins = new JTextField(10);
    inptWins.setEditable(false);

    JTextField inptLosses = new JTextField(10);
    inptLosses.setEditable(false);

    add(name);
    add(inptName);
    add(wins);
    add(inptWins);
    add(losses);
    add(inptLosses);
  }

}
