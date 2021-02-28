package GamePack;

import Entities.Creature;
import Entities.Minion;

public class Check {

    public boolean isTaunt(Creature creature){
        return creature.keywords.contains("taunt") ? true : false;
    }

    public boolean isTaunt(Minion minion){
        return minion.keywords.contains("taunt") ? true : false;
    }

    public boolean isCharge(Creature creature){
        return creature.keywords.contains("charge") ? true : false;
    }
    
    public boolean isCharge(Minion minion){
        return minion.keywords.contains("charge") ? true : false;
    }
}
