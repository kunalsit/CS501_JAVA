/**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Final Project.
 *  Signed: Kunal Goyal <br />
 */

public class Calculation {

    private int remainingCells = 0;
    private int max;
    private int x;
    private int y;
   
    MatrixGrid mgrid;

    public Calculation(MatrixGrid tempGrid) {
        max 			= 4;
        mgrid 			= tempGrid;
        
        remainingCells 	= mgrid.getRemainingCells();
        x 				= mgrid.getX();
        y 				= mgrid.getY();
    }

    public boolean setAndCheck(int xp, int yp, int player) {//sets the found coordinate to current player
    	mgrid.setMatrix(xp, yp, player);
        
    	remainingCells--;
       
        return check(xp, yp, 0, 1, player) || check(xp, yp, -1, 1, player) || check(xp, yp, -1, 0, player) || check(xp, yp, 1, 1, player);
    }

    public boolean isGameDraw() {
        return remainingCells == 0;
    }

    private boolean check(int xp, int yp, int dX, int dY, int player) {
        int count = 0;
        int tempx = xp;
        int tempy = yp;

        while (count < max && valid(tempx, tempy)) {
            if (!mgrid.AreMatrixEquals(tempx, tempy, player)) {
                break;

            }
            
            tempx += dX;
            tempy += dY;
            count++;
        }
        
        tempx = xp - dX;
        tempy = yp - dY;
        
        while (count < max && valid(tempx, tempy)) {
            if (!mgrid.AreMatrixEquals(tempx, tempy, player)) {
                break;
            }
            
            tempx -= dX;
            tempy -= dY;
            count++;
        }
        return count == max;
    }

    private boolean valid(int xp, int yp) {
        return xp >= 0 && xp < x && yp >= 0 && yp < y;
    }
}