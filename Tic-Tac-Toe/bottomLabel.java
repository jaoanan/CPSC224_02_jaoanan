
/*
*@author Joan Aoanan & Aisha Burka
*@Assignment TICTACTOE
*@Date February 23, 2019
*
*/
import javax.swing.*;
import java.awt.*;

public class bottomLabel extends JPanel
{
  private JLabel comment;
  //constructor

  public bottomLabel()
  {
    setBorder(BorderFactory.createLineBorder (Color.blue, 1));

    comment = new JLabel("Welcome to Tic-Tac-Toe!");
    add(comment);
  }

}
