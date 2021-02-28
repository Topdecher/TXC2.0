package Entities;

import java.util.ArrayList;

public class Table {
    public ArrayList board = new ArrayList();
    int boardLimit = 7;
    int boardSize = board.size();
    
    public void updateSize(){
        boardSize = board.size();
    }

    public void place(Minion minion, int plc){
        if (boardSize < boardLimit) {
            board.add(plc, minion);
            updateSize();
        }
    }

    public void kill(Minion minion){
        try{
            board.remove(minion);
            updateSize();
        }
        catch(Exception e){
        }
    }
}
