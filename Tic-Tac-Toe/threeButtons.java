import javax.swing.*;
import java.awt.*;

public class threeButtons extends JPanel
{
  private JButton button1;
  private JButton button2;
  private JButton button3;
  //constructor

  public threeButtons()
  {
    setLayout(new GridLayout(1,3));

      button1 = new JButton("New Game");
      add(button1);
      button2 = new JButton("Reset");
      add(button2);
      button3 = new JButton("Exit");
      add(button3);
  }

}
