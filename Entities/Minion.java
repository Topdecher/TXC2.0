package Entities;

import java.util.ArrayList;

public class Minion extends Vulnerable{
    public boolean isSleep = true;
    short attack = 0;
    short mana = 0;
    public ArrayList types = new ArrayList();
    public ArrayList keywords = new ArrayList();

    public void create(Creature creature){
        this.health = creature.health;
        this.attack = creature.attack;
        this.types = creature.types;
        this.mana = creature.mana;
        this.keywords = creature.keywords;
    }
}
