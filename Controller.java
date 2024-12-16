public class Controller {
    private Location[][] STATE = new Location[][]{
        {null,null,null},
        {null,null,null},
        {null,null,null}
    };
    private char activeTurn;
    private int turn;
        
        public Controller(){
            this.activeTurn = 'x';
            this.turn = 0;
            this.STATE = new Location[][]{
                {null,null,null},
            {null,null,null},
            {null,null,null}
            };
        }
        public Location[][] getState() {
            return STATE;
        }
        public void doMove(Location l) {
            l.setmMove(this.activeTurn);
            this.turn++;
        if(activeTurn == 'x') activeTurn = 'o';
        else activeTurn = 'x';
       checkEnd();
           }
               private void checkEnd() {
                   
               }
    
}
