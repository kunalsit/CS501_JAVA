/**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Final Project.
 *  Signed: Kunal Goyal <br />
 */

import java.util.*;

public class Process {
    Scanner input = new Scanner(System.in); 
    
    private int x	 			= 7;
    private int y	 			= 6;
    private int current			= 1;
    
    private boolean hasWon 		= false;
    private boolean hasDraw 	= false;
    private boolean quit 		= false;
    private boolean newGame 	= false;
    
    MatrixGrid mgrid 			= new MatrixGrid();
    Calculation cal		 		= new Calculation(mgrid); 
    
    public Process() {
    }

    public void run() {
        System.out.println("player " + current + "'s turn");
        
        display();
        
        int xp = 0;
        
        try {
            x = input.nextInt();
            
            if (xp <= 0 || xp > mgrid.getX()) {
                throw new Exception();
            }
        } catch (Exception exc) {
            System.out.println("not a number between 1 and "
                    + mgrid.getX());
            input.nextLine();
        }
        
        if (xp > 0 && xp < mgrid.getX() + 1) {
            xp--;
            
            int yp = mgrid.findY(x);
            
            if (yp != -1) {
                if (cal.setAndCheck(xp, yp, current)) {
                    hasWon = true;
                } else if (cal.isGameDraw()) {
                    hasDraw = true;
                } else {
                    current = mgrid.switchplayer(current, 2);
                }
            } else {
                System.out.println("collumn filled");
            }
        }
    }

    public void displayWin() {
        display();
        
        System.out.println("\nwinner is player " + current + "\nPlay again?\n" + "press 0 for new game\n" + "press a letter to quit");
        
        int choice = -1;
        
        try {
            choice = input.nextInt();
        } catch (Exception exc) {
            System.out.println("Quitting");
            quit = true;
        }
        
        if (choice == 0) {
            newGame = true;
        }
    }

    public void displayDraw() {
        display();
        
        System.out.println("\nThis game is a Draw" + "\nDo you want to start a new game??\n" + "press 0 for new game\n" + "press a letter to quit");
        
        int choice = -1;
        
        try {
            choice = input.nextInt();
        } catch (Exception exc) {
            System.out.println("Quitting");
            quit = true;
        }
        
        if (choice == 0) {
            newGame = true;
        }
    }

    public void display() {
        for (int i = -1; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i < 0) {
                    System.out.print(" " + (j + 1) + " ");
                } else {
                    System.out.print("[");
                    if (mgrid.AreMatrixEquals(j, i, 0)) {
                        System.out.print(" ]");
                    } else {
                        int[][] temp_matrix = mgrid.getMatrix();
                        System.out.print(temp_matrix[j][i] + "]");
                    }
                }
            }
            
            System.out.println();
        }
    }

    public boolean getIsWon() {
        return hasWon;
    }

    public boolean getIsDraw() {
        return hasDraw;
    }

    public boolean getExit() {
        return quit;
    }

    public boolean getNewGame() {
        return newGame;
    }
}