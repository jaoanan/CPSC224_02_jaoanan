import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;

public class TimerPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener
{
  int roofXValues[] = {100, 150, 200};
  int roofYValues[] = {350, 300, 350};

  int mountainVal1x[] = {0, 150,300 };
  int mountainVal1y[] = {400, 200, 400};

  int mountainVal2x[] = {200, 325,500 };
  int mountainVal2y[] = {400, 200, 400};

  int mountainVal3x[] = { 100, 250,  400 };
  int mountainVal3y[] = {400, 150, 400};

  int snMountainVal1x[] = {75, 150,224 };
  int snMmountainVal1y[] = {300, 200, 300};

  int snMountainVal2x[] = {205, 250,295 };
  int snMountainVal2y[] = {225, 150, 225};

  int snMountainVal3x[] = { 259, 326,  420 };
  int snMountainVal3y[] = {307, 199, 308};

  int snRoofXValues[] = {125, 150, 174};
  int snRoofYValues[] = {325, 300, 326};

  boolean entered = false;

  int bird1x[] = {100,120,140,140,120,100};
  int bird1y[] = {100,103,100,104,108,103};

  int bird2x[] = {140,160,180,180,160,140};
  int bird2y[] = {115,117,114,119,122,116};

  private int MouseX;
  private int MouseY;


  int origSunX = 420;
  int origSunY = 25;

  int sunX=420;
  int sunY=25;
  int mouseClicked = 0;
  int time = 0;

  int x1=7;
  int x2= -10;
  int x3 = -10;

  int radius= 15;
  private int delay = 10;
  //rotected Timer timer;
  protected int currentX = 0;
  protected int currentY = 0;
  protected boolean isClicked = false;
  private int x = 0;		// x position
  private int y = 0;		// y position


  private int dx = 2;		// increment amount (x coord)
  private int dy = 2;		// increment amount (y coord)

  double move1;
  double move2;
  double move3;

  protected boolean isDragged = false;

  Timer  timer = new Timer(delay, this);

  //stars
  int starXPoints[] = {9, 15, 0, 18, 3};
  int starYPoints[] = {0, 18, 6, 6, 18};

  int starXPointsO[] = {9, 15, 0, 18, 3};
  int starYPointsO[] = {0, 18, 6, 6, 18};

  int bird1xO[] = {100,120,140,140,120,100};
  int bird1yO[] = {100,103,100,104,108,103};

  int bird2xO[] = {140,160,180,180,160,140};
  int bird2yO[] = {115,117,114,119,122,116};

  int a1 =505;
  int a2= 507;
  int a3 = 518;
  int a4 = 500;
  int a5= 495;
  int a6=516;

  public TimerPanel()
  {


    addMouseListener(this);
    addMouseMotionListener(this);

  }

  public void actionPerformed(ActionEvent e)
  // will run when the timer fires
  {
     repaint();
  }

  public void resetTimers ()
  {
    starXPoints = starXPointsO.clone();
    starYPoints = starYPointsO.clone();

    bird1x=bird1xO.clone();
    bird1y=bird1yO.clone();

    bird2x=bird2xO.clone();
    bird2y=bird2yO.clone();

    x1=7;
    x2= -10;
    x3 = -10;

    a1 =505;
    a2= 507;
    a3 = 518;
    a4 = 500;
    a5= 495;
    a6=516;
  }

  public void paintComponent( Graphics g )
  {
     super.paintComponent(g); // call superclass's paintComponent
     g.setColor(Color.blue);



     // check for boundaries
/*
     if (x < radius)			dx = Math.abs(dx);
     if (x > getWidth() - radius)	dx = -Math.abs(dx);
     if (y < radius)			dy = Math.abs(dy);
     if (y > getHeight() - radius)	dy = -Math.abs(dy);

     // adjust ball position
     x += dx;
     y += dy;
     //g.fillOval(x - radius, y - radius, radius*2, radius*2);

     g.fillOval(x - radius-10, y - radius+10 , 30, 10);

     g.fillOval( x - radius, y - radius , 10, 30);
*/
   //Sun
     displayTime(g,sunX, sunY, time);

 //grass
    if(entered)
    {
      g.setColor(Color.WHITE);
      g.fillRect(0,400, 500, 300);

    }
    else{
     g.setColor(Color.green);
     g.fillRect(0,400, 500, 300);
   }

  //Mountains

    if (entered)
    {
      g.setColor(Color.DARK_GRAY);
      g.fillPolygon(mountainVal3x, mountainVal3y, 3);

      g.setColor(Color.orange);
      g.fillPolygon(mountainVal1x, mountainVal1y, 3);

      g.setColor(Color.BLUE);
      g.fillPolygon(mountainVal2x, mountainVal2y, 3);

      g.setColor(Color.WHITE);
      g.fillPolygon(snMountainVal1x,snMmountainVal1y,3);

      g.setColor(Color.WHITE);
      g.fillPolygon(snMountainVal2x,snMountainVal2y,3);

      g.setColor(Color.WHITE);
      g.fillPolygon(snMountainVal3x,snMountainVal3y,3);

      g.setColor(Color.WHITE);
      g.fillPolygon(snRoofXValues,snRoofYValues,3);


    }
    else
    {
     g.setColor(Color.DARK_GRAY);
     g.fillPolygon(mountainVal3x, mountainVal3y, 3);

     g.setColor(Color.orange);
     g.fillPolygon(mountainVal1x, mountainVal1y, 3);

     g.setColor(Color.BLUE);
     g.fillPolygon(mountainVal2x, mountainVal2y, 3);
   }
     //Animal
    // drawAnimal(g);

  //house
    if(entered)
    {
       g.setColor(Color.magenta);
       g.fillRect(100,350, 100, 50);
       g.setColor(Color.blue);
       g.fillPolygon(roofXValues, roofYValues, 3);
       g.setColor(Color.magenta);

       g.setColor(Color.WHITE);
       g.fillPolygon(snRoofXValues,snRoofYValues,3);

        //chimmney
       g.setColor(Color.magenta);

       g.fillRect(170,315, 10, 20);
       g.setColor(Color.blue);
        //door
       g.fillRect(125,375, 50, 25);
       g.setColor(Color.WHITE);
       g.fillPolygon(snRoofXValues,snRoofYValues,3);
     }

  else
  {
      g.setColor(Color.magenta);
      g.fillRect(100,350, 100, 50);
      g.setColor(Color.blue);
      g.fillPolygon(roofXValues, roofYValues, 3);
      g.setColor(Color.magenta);
       //chimmney
      g.fillRect(170,315, 10, 20);
      g.setColor(Color.blue);
       //door
      g.fillRect(125,375, 50, 25);

    }
     drawAnimal(g);

     g.setColor(Color.DARK_GRAY);
     g.fillPolygon(bird1x, bird1y, 6);
     g.fillPolygon(bird2x, bird2y, 6);
   }

     public void drawAnimal(Graphics g)
    {

     g.setColor (Color.DARK_GRAY);
     g.fillRect(a1, 380, 22, 13);
     g.fillRect(a2,380,5,20);
     g.fillRect(a3,380,5,20);
     g.fillOval(a4, 376 , 15, 15);
     g.fillOval(a5, 380 , 12, 10);
     g.fillOval(a6, 378 , 10, 14);
   }

    public void drawAirplane(Graphics g)
     {

       g.setColor(Color.red);

       g.fillOval( x3, 45 , 5, 20);

       g.setColor(Color.blue);

       g.fillOval( x2, 50 , 40, 10);

       g.fillOval( x1, 40 , 10, 30);

       x1+=1;
       x2+=1;
       x3+=1;

     }


     public void reset()
     {
       //sun
       sunX = origSunX;
       sunY = origSunY;
       //sunColor = "yellow";
       setBackground(Color.lightGray);
       mouseClicked = 0;
       //sunColor = "yellow";
       time = 0;
       resetTimers();
       entered = false;
       repaint();
     }

     public void displayTime(Graphics g,int sunX, int sunY, int time)
     {

       int radius = 45;

       //drawAnimal(g);
       if (time == 0)
       {
         //day
         g.setColor(Color.YELLOW);
         g.fillOval(sunX,sunY, radius, radius);
         setBackground(Color.lightGray);
         drawAirplane(g);
         timer.start();
       }
       else
       {
         //night
         g.setColor(Color.WHITE);
         g.fillOval(sunX,sunY, radius, radius);
         setBackground(Color.black);
         drawStars(g);
         timer.start();
       }

     }

     public void actionPerformed(ActionEvent  e, int time)
     {
       if (time == 1 & starXPoints[9] == 310 )
       {
         timer.stop();
       }

       else if (time == 0  && x1 == 305)
      {
         timer.stop();
       }

       else{}
     }
    public void drawStars (Graphics g)
    {
      for(int i = 0; i < 5;i++)
        {
          g.setColor(Color.yellow);
          g.fillPolygon(starXPoints,starYPoints,5);

          starXPoints[i] += 1;
          starYPoints[i] +=1;
        }
    }

    public void mousePressed(MouseEvent e)
    {
      mouseClicked++;
      if (mouseClicked % 2 == 0) time = 0;
      else time = 1;
      repaint();
      System.out.println(e.getX() + " "+ e.getY());
    }

    public void mouseClicked(MouseEvent e)
    {

    }

    public void mouseReleased(MouseEvent e)
    {
      //repaint();

    }

    public void mouseEntered(MouseEvent e)
    {
      entered = true;

    }

    public void mouseExited(MouseEvent e)
    {

      reset();
      repaint();
    }
   public void mouseDragged (MouseEvent e)
    {
      int i;


        for( i = 0; i< bird1x.length && bird2y[4] <=430; i++)
        {
          bird1x[i]+= 2;
          bird1y[i]+= 2;

          bird2x[i]+= 2;
          bird2y[i]+= 2;

      }
    }
   public void mouseMoved(MouseEvent e)
    {
      a1 -=1;
      a2-=1;
      a3 -=1;
      a4 -=1;
      a5-=1;
      a6 -=1;
      repaint();
    }
}