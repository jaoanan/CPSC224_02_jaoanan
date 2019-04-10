
/*
*@author Joan Aoanan & Aisha Burka
*@Assignment TICTACTOE
*@Date February 23, 2019
*
*/
import javax.swing.*;
import java.awt.*;

public class topLabel extends JPanel
{
  private P1 player1;
  private P2 player2;

  public topLabel()
  {
    player1 = new P1();
    player2 = new P2();
    setLayout(new BorderLayout());
    add(player1, BorderLayout.WEST);
    add(player2, BorderLayout.EAST);

  }
}
