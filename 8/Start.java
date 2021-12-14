/**
 * Class: CS 501-WS Introduction to JAVA Programming <br />
 * Instructor: M. Jurkat <br />
 * Description: Final Project: Connect 4 <br />
 * I pledge by honor that I have abided by the Steven's Honor System. <br />
 *  <br />
 *  Final Project.
 *  Signed: Kunal Goyal <br />
 */


public class Start {

    public static void main(String[] args) {
        int state = 0;
        boolean useGui = true;

        if (useGui) {
            SwingGui GuiBoard = new SwingGui();
            
            while (state != -1) {
                switch (state) {
                    case 0:
                    	GuiBoard.updateGameBoard();
                        if (GuiBoard.getIsWon()) {
                            state = 1;
                        } else if (GuiBoard.getIsDraw()) {
                            state = 2;
                        } else if (GuiBoard.getNewGame()) {
                        	GuiBoard = new SwingGui();
                            state = 0;
                        }
                        break;
                    case 1:
                    	GuiBoard.displayWon();
                        if (GuiBoard.getExit()) {
                            state = -1;
                        } else  if (GuiBoard.getNewGame()) {
                        	GuiBoard = new SwingGui();
                            state = 0;
                        }
                        break;
                    case 2://endgame with drawgame
                    	GuiBoard.showDraw();
                        if (GuiBoard.getExit()) {
                            state = -1;
                        } else if (GuiBoard.getNewGame()) {
                        	GuiBoard = new SwingGui();
                            state = 0;
                        }
                        break;
                }
            }
        } else {
            Process Cli = new Process();
            while (state != -1) {
                switch (state) {
                    case 0:
                        Cli.run();
                        if (Cli.getIsWon()) {
                            state = 1;
                        } else if (Cli.getIsDraw()) {
                            state = 2;
                        }
                        break;
                    case 1:
                        Cli.displayWin();
                        if (Cli.getExit()) {
                            state = -1;
                        } else if (Cli.getNewGame()) {
                            Cli = new Process();
                            state = 0;
                        }
                        break;
                    case 2:
                        Cli.displayDraw();
                        if (Cli.getExit()) {
                            state = -1;
                        } else if (Cli.getNewGame()) {
                            Cli = new Process();
                            state = 0;
                        }
                        break;
                }
            }
        }
    }
}