/**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Final Project.
 *  Signed: Kunal Goyal <br />
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class SwingGui {
    
	private JFrame f;
    private JLabel[][] s;
    private JButton[] b;
    
    private int x				= 7;
    private int y	 			= 6;
    private int current		 	= 1;
    
    private boolean isWon 		= false;
    private boolean isDraw 		= false;
    private boolean exit 		= false;
    private boolean newGame		 	= false;

    MatrixGrid mgrid 			= new MatrixGrid();
    Calculation cal 			= new Calculation(mgrid);

    public SwingGui() {

        f = new JFrame("Connect4");

        JPanel panel = (JPanel) f.getContentPane();
        panel.setLayout(new GridLayout(x, y + 1));

        s = new JLabel[x][y];
        b = new JButton[x];

        for (int i = 0; i < x; i++) {
            b[i] = new JButton("" + (i + 1));
            b[i].setActionCommand("" + i);
            b[i].addActionListener(
                    new ActionListener() {
                    	public void actionPerformed(ActionEvent e) {
                            int a = Integer.parseInt(e.getActionCommand());
                            int y = mgrid.findY(a);
                            
                            if (y != -1) {
                                if (cal.setAndCheck(a, y, current)) {
                                    isWon = true;
                                } else if (cal.isGameDraw()) {
                                    isDraw = true;
                                } else {
                                    current = mgrid.switchplayer(current, 2);
                                    f.setTitle("Connect4 - player " + current + "'s turn");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please choose another one", "This column is filled", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    });
            panel.add(b[i]);
        }
        
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                s[i][j] = new JLabel();
                
                s[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                s[i][j].setBorder(new LineBorder(Color.black));
                
                panel.add(s[i][j]);
            }
        }

        f.setContentPane(panel);
        f.setSize(700, 600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void updateGameBoard() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (mgrid.AreMatrixEquals(i, j, 1)) {
                    s[i][j].setOpaque(true);
                    s[i][j].setBackground(Color.red);
                }
                if (mgrid.AreMatrixEquals(i, j, 2)) {
                    s[i][j].setOpaque(true);
                    s[i][j].setBackground(Color.blue);
                }
            }
        }
    }

    public void displayWon() {
        String win	= "player " + current + " won this game";
        int n 		= JOptionPane.showConfirmDialog(f, "Do you want to start a new game?", win, JOptionPane.YES_NO_OPTION);
        
        if (n < 1) {
            f.dispose();
            newGame = true;
        } else {
            f.dispose();
            exit = true;
        }
    }

    public void showDraw() {
        String win 	= "draw game";
        int n 		= JOptionPane.showConfirmDialog(f, "Do you want to start a new game?", win, JOptionPane.YES_NO_OPTION);
        
        if (n < 1) {
            f.dispose();
            newGame = true;
        } else {
            f.dispose();
            exit = true;
        }
    }

    public boolean getIsWon() {
        return isWon;
    }

    public boolean getIsDraw() {
        return isDraw;
    }

    public boolean getExit() {
        return exit;
    }

    public boolean getNewGame() {
        return newGame;
    }
}