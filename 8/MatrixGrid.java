/**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Final Project.
 *  Signed: Kunal Goyal <br />
 */


public class MatrixGrid {

    private int x;
    private int y;
    private int[][] mat;
    private int remainingCells = 0;

    public MatrixGrid() {
        x = 7;
        y = 6;

        mat = new int[x][y];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
            	mat[i][j] = 0;
            	remainingCells++;
            }
        }
    }
    
    public int getRemainingCells() {
        return remainingCells;
    }

    public int[][] getMatrix() {
        return mat;
    }

    public boolean AreMatrixEquals(int a, int b, int c) {
        return mat [a][b] == c;
    }

    public void setMatrix(int a, int b, int tempPlayer) {
    	mat[a][b] = tempPlayer;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int findY(int xp) {
        int yp = -1;
        for (int i = 0; i < y; i++) {
            if (mat[xp][i] == 0) {
                yp = i;
            }
        }
        return yp;
    }

    public int switchplayer(int player, int maxPlayers) {
        player++;
        if (player > maxPlayers) {
            return 1;
        }
        return player;
    }
}