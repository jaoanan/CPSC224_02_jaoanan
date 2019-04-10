import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing. JMenu;
import javax.swing JmenuItem;
import javax.swing.JOptionPane;
public class TicTacToeGui extends JFrame {
    private Container pane;
    private String currentPlayer;
    private JButton [] [] board;
    private boolean hasWinner;
    private JMenuBar menuBar;
    private JMenu menu;
    private quit;
    private JMenuItem newGame;


public TicTacToeGUI(){
    super();
    pane = getContentPane();
    pane.setLayout(new GridLayout(3,3));
    setTitle("Tic Tac Toe");
    setSize(500,500);
    setVisible(true);
    currentPlayer = "x";
    board = new JButton [3][3];
    hasWinner = false;
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    intializeBoard();
    intializeMenuBar();

}
private void intializeMenuBar(){
    menuBar = new JMenuBar();
    menu = new JMenu("File");
    newGame = new JMenuItem("New Game");
    newGame.addActionListener(new addActionListener () {

        public void actionPerformed (ActionEvent e)
            resetBoard();
    }

});
    quit = new JMenu("Quit");
    quit.addActionListener(new ActionListener() {

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    });
    menu.add(menuItem);
    menu.add(quit);
    menuBar.add(menu);
    setJMenuBar(menuBar);

}
private void resetBoard(){
    currentPlayer = "x";
    hasWinner = false;
    for(int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            board[i][j].setText(" ");
        }
    }
}
private void intializeBoard(){}
private void togglePlayer(){
    if(currentPlayer.equals("x"))
        currentPlayer = "o";
    else
        currentPlayer = x;
}
private void hasWinner(){
    if(board [0][0].getText().equals(currentPlayer) && board [1][0].getText().equals(currentPlayer) && board [2][0].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
}
else if(board [0][1].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [2][1].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
else if(board [0][2].getText().equals(currentPlayer) && board [1][2].getText().equals(currentPlayer) && board [2][2].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
else if(board [0][0].getText().equals(currentPlayer) && board [0][1].getText().equals(currentPlayer) && board [0][2].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
else if(board [1][0].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [1][2].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
else if(board [2][0].getText().equals(currentPlayer) && board [2][1].getText().equals(currentPlayer) && board [2][2].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
else if(board [0][0].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [2][2].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
else if(board [0][2].getText().equals(currentPlayer) && board [1][1].getText().equals(currentPlayer) && board [2][0].getText().equals(currentPlayer);
    JOptionPane.showMessgaeDialog(null, "Player" + currentPlayer + " has won");
    hasWinner = true;
}
