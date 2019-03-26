//Joan Aoanan && Aisha Burka
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class motionParallax extends JFrame //Calls motionParallax so that the functions are able to move within the frame
{
//references the TimerPanel class in TimerPanel.java
  private JPanel TimerPanel;

  public motionParallax()
  {
    JFrame frame = new JFrame( "Motion Parallax" );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
    TimerPanel tp = new TimerPanel();
    frame.add(tp);
    frame.add(new TimerPanel());
    frame.setSize( 500, 500 ); // set the frame size 
    frame.setVisible( true ); 
    frame.setResizable (false);
  }

  public static void main(String[] args)
  {
    new motionParallax();
  }
}
