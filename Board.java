import java.awt.FlowLayout;
import java.util.Arrays;
import javax.swing.JFrame;
public class Board extends JFrame{

    char[][] STATE = new char[][]{};
    private Controller c;
    public Board(){
    this.c = new Controller();
    makeButtons();
    super.setTitle("BOARD!");
    super.setSize(400,600);
    super.setLayout(new FlowLayout());
    super.setVisible(true);
    super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void makeButtons(){
        for (int i = 0; i < c.getState().length; i++) {
            for (int j = 0; j < c.getState().length; j++) {
                c.getState()[j][i] = new Location(this);    
            }
        }
    }
    public String tellMeYourState() {
        System.out.println(Arrays.deepToString(c.getState()));
        return Arrays.deepToString(c.getState());
    }
    
        public boolean checkForWin(char symbol) {
            // Check rows, columns, and diagonals
            for (int i = 0; i < 3; i++) {
                if (STATE[i][0] == symbol && STATE[i][1] == symbol && STATE[i][2] == symbol) {
                    return true;
                }
                if (STATE[0][i] == symbol && STATE[1][i] == symbol && STATE[2][i] == symbol) {
                    return true;
                }
            }
            if (STATE[0][0] == symbol && STATE[1][1] == symbol && STATE[2][2] == symbol) {
                return true;
            }
            if (STATE[0][2] == symbol && STATE[1][1] == symbol && STATE[2][0] == symbol) {
                return true;
            }
            return false;
        
    }

        public Controller getC() {
            return this.c;
        }
}
