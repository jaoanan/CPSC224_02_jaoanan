import javax.swing.*;
import java.awt.*;

public class gridPanel extends JPanel
{
  private JButton[][] grid;
  //constructor

  public gridPanel()
  {
    setLayout(new GridLayout(3,3));

    grid = new JButton[3][3];
    for(int r = 0; r <=2; r++)
    {
      for(int c = 0; c <=2; c++)
      {
        grid[r][c]= new JButton( );
        add(grid[r][c]);
      }

    }

  }
}
