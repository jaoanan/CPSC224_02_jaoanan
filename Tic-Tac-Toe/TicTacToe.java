import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacToe extends JFrame
{
  //private JButton button1;
//  private gridPanel grid;
  private centerPanel cp;
  private final int WINDOW_WIDTH = 500;
  private final int WINDOW_HEIGHT= 500;
  private JPanel buttonPanel;
  //Constructor
  public TicTacToe()
  {

    setTitle("Tic-Tac-Toe");
    setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  //  button1 = new JButton(Hello);

  //  panel = new JPanel();
  //  panel = add(button1);

  //  grid = new gridPanel();
    cp = new centerPanel();

    //buildButtonPanel();

    add(cp, BorderLayout.CENTER);

    pack();
    setVisible(true);

  }
  public static void main(String[] args)
  {
    new TicTacToe();
  }
}
