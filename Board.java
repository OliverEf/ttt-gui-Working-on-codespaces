import java.awt.FlowLayout;
import java.util.Arrays;
import javax.swing.JFrame;
public class Board extends JFrame{

    
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
            for (Location[] state : c.getState()) {
                state[i] = new Location(this);    
            }
        }
    }
    public String tellMeYourState() {
        System.out.println(Arrays.deepToString(c.getState()));
        return Arrays.deepToString(c.getState());
    }
    
        public Controller getC() {
            return this.c;
        }
}
