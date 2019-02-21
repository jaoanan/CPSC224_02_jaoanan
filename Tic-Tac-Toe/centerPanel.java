import javax.swing.*;
import java.awt.*;

public class centerPanel extends JPanel
{
  private gridPanel grid;
  private threeButtons buttons;

  public centerPanel()
  {
    grid = new gridPanel();
    buttons = new threeButtons();
    setLayout(new BorderLayout());
    add(grid, BorderLayout.CENTER);
    add(buttons, BorderLayout.SOUTH);
  }
}
