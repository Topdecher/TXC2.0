package Abilities;

import Entities.Minion;
import Entities.Table;

import java.util.ArrayList;

public class Ability {
    Table table  = new Table();

    public void setTable(Table table){
        this.table = table;
    }

    public void summon(Minion minion, int plc) {
        table.place(minion, plc);
    }

    public void summon(ArrayList minions, int plc){
        int iterate = 1;
        if (plc < 0){
            plc = -plc;
            iterate = -iterate;
        }
        for(int i = 0; i < minions.size(); i++){
            table.place((Minion) minions.get(i), plc);
            plc += iterate;
        }
    }
}
