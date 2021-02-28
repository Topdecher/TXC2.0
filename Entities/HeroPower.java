package Entities;

public class HeroPower {
    public short mana = 0;
    public boolean isUsed = false;

    public void use(){
        isUsed = true;
    }

    public void refresh(){
        isUsed = false;
    }
}
