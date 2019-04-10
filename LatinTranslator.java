import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface

public class LatinTranslator extends JFrame
{
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JPanel panel;
  private final int WINDOW_WIDTH =300;
  private final int WINDOW_HEIGHT =200;
  /* Constructor */


  public LatinTranslator()
  {
    setTitle("ICA 3: Latin Translator");

    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    button1 = new JButton("SINISTER");
    button2 = new JButton("MEDIUM");
    button3 = new JButton("DEXTER");

    button1.addActionListener(new ButtonListener());
    button2.addActionListener(new ButtonListener());
    button3.addActionListener(new ButtonListener());

    panel = new JPanel();
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);

    add(panel);
    setVisible(true);
  }

  private class ButtonListener implements ActionListener
  {
    public void actionPreformed( ActionEvent e)
    {
      String actionCommand = e.getActionCommand();
      if (actionCommand.equals("SINISTER"))
      {
        JOptionPane.showMessageDialog(null, "Left");
      }
      else if (actionCommand.equals("MEDIUM"))
      {
        JOptionPane.showMessageDialog(null, "Center");
      }
     else if (actionCommand.equals("DEXTER"))
      {
       JOptionPane.showMessageDialog(null, "RIGHT");
      }
    }
  }
  public static void main(String[] args)
   {
      new LatinTranslator();
   }
}
