
/*
*@author Joan Aoanan & Aisha Burka
*@Assignment TICTACTOE
*@Date February 23, 2019
*
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class gridPanel extends JPanel
{
  public JButton[][] board;
  private JButton button1;
  private JButton button2;
  private JButton button3;
  String currentPlayer;
  boolean hasWinner;
  public int[] p1 =new int[2];
  public int[] p2 = new int[2];

  //constructor

  public gridPanel()
  {
    setLayout(new GridLayout(4,3));

    currentPlayer ="x";
    board = new JButton[3][3];
    hasWinner = false;
    initializeBoard();


    button1 = new JButton("New Game");

    button2 = new JButton("Reset");

    button3 = new JButton("Exit");

    button1.addActionListener(new GameButtonListener());
    button2.addActionListener(new ResetButtonListener());
    button3.addActionListener(new ExitButtonListener());

    add(button1);
    add(button2);
    add(button3);
  }

  public void resetBoard()
  {
      currentPlayer="x";
      hasWinner = false;
      for(int i=0; i<3; i++)
      {
          for (int j=0; j<3; j++)
          {
              board[i][j].setText("");
          }
      }
  }
/*
  public int[] getP1Array()
  {
    return p1.clone();
  }

  public int[] getP2Array()
  {
    return p2.clone();
  }
  */
  private void turn()
  {
    if(currentPlayer.equals("x"))
        currentPlayer = "o";
    else
        currentPlayer = "x";
  }

  private void hasWinner()
  {
    if(board[0][0].getText().equals(currentPlayer) && board [1][0].getText().equals(currentPlayer) && board [2][0].getText().equals(currentPlayer))
        {
        hasWinner=true;
        }
    else if(board[0][1].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [2][1].getText().equals(currentPlayer))
        {
        hasWinner = true;
        }
    else if(board [0][2].getText().equals(currentPlayer) && board [1][2].getText().equals(currentPlayer) && board [2][2].getText().equals(currentPlayer))
        {
        hasWinner = true;
        }
    else if(board [0][0].getText().equals(currentPlayer) && board [0][1].getText().equals(currentPlayer) && board [0][2].getText().equals(currentPlayer))
        {
        hasWinner = true;
        }
    else if(board [1][0].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [1][2].getText().equals(currentPlayer))
        {
        hasWinner = true;
        }
    else if(board [2][0].getText().equals(currentPlayer) && board [2][1].getText().equals(currentPlayer) && board [2][2].getText().equals(currentPlayer))
        {
        hasWinner = true;
        }
    else if(board [0][0].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [2][2].getText().equals(currentPlayer))
        {
        hasWinner = true;
        }
    else if(board [0][2].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [2][0].getText().equals(currentPlayer))
        {
        hasWinner = true;
      }

      if(hasWinner ==true)
      {
        if(currentPlayer =="x")
        {
          p1[0]= p1[0]+1;
          p2[1] = p2[1]+1;

          JOptionPane.showMessageDialog(null, "Player 1 has won");

        }

        else if(currentPlayer =="o")
        {
          p2[0]= p2[0]+1;
          p1[1] = p1[1]+1;

          JOptionPane.showMessageDialog(null, "Player 2 has won");

        }
      }
  }

  public void initializeBoard()
  {
    board = new JButton[3][3];

    for(int i =0; i < 2;i++)
    {
      p1[i] = 0;
      p2[i] = 0;
    }

    for(int r = 0; r <=2; r++)
    {
      for(int c = 0; c <=2; c++)
      {
        JButton btn= new JButton( );
        btn.getFont().deriveFont(Font.BOLD,24);
        board[r][c] = btn;
        btn.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
          {
            if(((JButton)e.getSource()).getText().equals("") && hasWinner == false)
            {
              btn.setText(currentPlayer);
              hasWinner();
              turn();
            }
          }
        });
        add(btn);
      }
    }
  }


  private class GameButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {

       resetBoard();
    }
  }

  private class ResetButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      resetBoard();
    }
  }

  private class ExitButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      System.exit(0);
    }
  }

}
