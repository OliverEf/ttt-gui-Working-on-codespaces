import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class Location extends JButton implements ActionListener{
    //PROPERTIES
    private int x;
    private int y;
    private int id;
    private Board b;
    private char symbol;

    // CONSTRUCTOR
    public Location(){
        super();
        super.setText("hello");
    }
    public Location(Board b){
        this.b = b;
        this.x = x;
        this.y = y;
        
        b.add(this);
        this.addActionListener(this);
        this.setPreferredSize(new Dimension(100,100));
    }
    public Location(Board b, int x, int y){
        this.b = b;
        this.x = x;
        this.y = y;
        
        b.add(this);
        this.addActionListener(this);
        this.setPreferredSize(new Dimension(100,100));
    }
    @Override
    public void actionPerformed(ActionEvent e){
        b.getC().doMove(this);

        b.tellMeYourState();
    }
    @Override
    public String toString(){
        return "" + this.symbol;
    }
    public void setmMove(char activeTurn) {
        super.setText(""+activeTurn);
        this.symbol = activeTurn;
    }
}
