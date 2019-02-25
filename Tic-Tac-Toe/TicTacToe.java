
/*
*@author Joan Aoanan & Aisha Burka
*@Assignment TICTACTOE
*@Date February 23, 2019
*
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame
{

  private gridPanel gridPanel;
  private final int WINDOW_WIDTH = 500;
  private final int WINDOW_HEIGHT= 500;
  private JPanel buttonPanel;
  private bottomLabel bottomLabel;
  private topLabel topLabel;

  //Constructor


  public TicTacToe()
  {
    super();
    setTitle("Tic-Tac-Toe");
    setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
    setLayout(new BorderLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    gridPanel = new gridPanel();
    bottomLabel = new bottomLabel();
    topLabel = new topLabel();

    add(gridPanel, BorderLayout.CENTER);
    add(bottomLabel, BorderLayout.SOUTH);
    add(topLabel, BorderLayout.NORTH);

    pack();
    setVisible(true);


  }


  public static void main(String[] args)
  {
    new TicTacToe();
  }
}
