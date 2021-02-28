package Entities;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public ArrayList deckCards = new ArrayList();
    public ArrayList graveyard = new ArrayList();
    public ArrayList burnedDeckCards = new ArrayList();
    final Random random = new Random();
    int deckLimit = 60;
    int deckCapacity = deckCards.size();
    int fatigueTimes = 0;

    public void updateCapacity(){
        deckCapacity = deckCards.size();
    }

    public void setDeckLimit(int deckLimit){
        this.deckLimit = deckLimit;
    }

    public void addFatigue(int num){
        fatigueTimes += num;
    }

    public void burnCards(int num){
        if (num > deckCapacity){
            num = deckCapacity;
        }
        for (int i = 0; i < num; i++) {
            int newInt = random.nextInt(deckCapacity);
            burnedDeckCards.add(deckCards.get(newInt));
            deckCards.remove(newInt);
            updateCapacity();
        }
    }

    public void shuffle(Object card){
        if (deckLimit < deckCapacity){
            deckCards.add(random.nextInt(deckCapacity+1), card);
            updateCapacity();
        }
    }

    public void shuffle(ArrayList array){
        for (int i = 0; i < array.size(); i++){
            shuffle(array.get(i));
        }
    }
}

/*package Entities;

import java.util.ArrayList;

public class YDeck {
    private static YDeck instance;
    public ArrayList yDeckCards = new ArrayList();
    public ArrayList yGraveyard = new ArrayList();
    int yDeckCapacity = yDeckCards.size();

    public static YDeck getInstance(){
        if (instance == null){
            instance = new YDeck();
        }
        return instance;
    }

    public void yUpdateCapacity(){
        yDeckCapacity = yDeckCards.size();
    }
    
    public void yBurnCards(int num){
        for (int i = 0; i < num; i++){

        }
    }
}*/

