import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/*
*@author Joan Aoanan
*@Assignment ICA4
*@Date February 23, 2019
*
*/
public class ICA4 extends JFrame
{
  private JLabel imageLabel1;
  private JLabel imageLabel2;
  private JPanel imagePanel1;
  private JPanel imagePanel2;

  private JPanel buttonPanel;
  private JButton button;

  public ICA4()
  {
    //Set the title
    setTitle("Dice Simulator");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new BorderLayout());

    //buildpanels
    buildImagePanel();
    buildImagePanel2();

    buildButtonPanel();

    add(imagePanel1, BorderLayout.WEST);
    add(imagePanel2, BorderLayout.EAST);
    add(buttonPanel, BorderLayout.SOUTH);

    pack();
    setVisible(true);
  }

  private void buildButtonPanel()
  {
    buttonPanel = new JPanel();
    button = new JButton("Roll the Dice");

    button.addActionListener(new ButtonListener());
    buttonPanel.add(button);
  }

  private void buildImagePanel()
  {
    imagePanel1 = new JPanel();

    imageLabel1 = new JLabel("");

    imagePanel1.add(imageLabel1);

  }

  private void buildImagePanel2()
  {
    imagePanel2 = new JPanel();

    imageLabel2 = new JLabel("");

    imagePanel2.add(imageLabel2);
  }

  private class ButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      Random rand = new Random();

      int randomNum1 =rand.nextInt(5)+1 ;
      int randomNum2 = rand.nextInt(5)+1;

      if (randomNum1 ==1)
      {
        ImageIcon dieImage1 = new ImageIcon("Die1.png");
        imageLabel1.setIcon(dieImage1);
      }

      else if (randomNum1 ==2)
      {
        ImageIcon dieImage1 = new ImageIcon("Die2.png");
        imageLabel1.setIcon(dieImage1);
      }
      else if (randomNum1 ==3)
      {
        ImageIcon dieImage1 = new ImageIcon("Die3.png");
        imageLabel1.setIcon(dieImage1);
      }
      else if (randomNum1 ==4)
      {
        ImageIcon dieImage1 = new ImageIcon("Die4.png");
        imageLabel1.setIcon(dieImage1);
      }
      else if (randomNum1 ==5)
      {
        ImageIcon dieImage1 = new ImageIcon("Die5.png");
        imageLabel1.setIcon(dieImage1);
      }
      else if (randomNum1 ==6)
      {
        ImageIcon dieImage1 = new ImageIcon("Die6.png");
        imageLabel1.setIcon(dieImage1);
      }

      if (randomNum2 ==1)
      {
        ImageIcon dieImage2 = new ImageIcon("Die1.png");
        imageLabel2.setIcon(dieImage2);
      }

      else if (randomNum2 ==2)
      {
        ImageIcon dieImage2 = new ImageIcon("Die2.png");
        imageLabel2.setIcon(dieImage2);
      }
      else if (randomNum2 ==3)
      {
        ImageIcon dieImage2 = new ImageIcon("Die3.png");
        imageLabel2.setIcon(dieImage2);
      }
      else if (randomNum2 ==4)
      {
        ImageIcon dieImage2 = new ImageIcon("Die4.png");
        imageLabel2.setIcon(dieImage2);
      }
      else if (randomNum2 ==5)
      {
        ImageIcon dieImage2 = new ImageIcon("Die5.png");
        imageLabel2.setIcon(dieImage2);
      }
      else if (randomNum2 ==6)
      {
        ImageIcon dieImage2 = new ImageIcon("Die6.png");
        imageLabel2.setIcon(dieImage2);
      }

      imageLabel1.setText(null);
      imageLabel2.setText(null);
      pack();
    }
  }

  public static void main(String[] args)
  {
    new ICA4();
  }
}
