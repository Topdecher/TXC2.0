package Entities;

import java.util.ArrayList;

public class Hand {
    Deck deck = new Deck();
    public ArrayList handCards = new ArrayList();
    public ArrayList burnedCards = new ArrayList();
    public ArrayList discardedCards = new ArrayList();
    int handLimit = 10;
    int handSize = handCards.size();

    public void updateSize(){
        handSize = handCards.size();
    }

    public void setHandLimit(int handLimit){
        this.handLimit = handLimit;
    }

    public void addCard(Card card) {
        if (handSize < handLimit) {
            handCards.add(card);
            updateSize();
        }
    }
    public void drawCard(int num) {
        burnedCards.clear();
        if (deck.deckCapacity < num){
            deck.fatigueTimes += (num - deck.deckCapacity);
            num = deck.deckCapacity;
        }
        for (int i = 0; i < num; i++) {
            if (handLimit <= handSize){
                burnedCards.add(deck.deckCards.get(num));
                deck.burnedDeckCards.add(deck.deckCards.get(num));
            }
            else{
                handCards.add(deck.deckCards.get(num));
                updateSize();
            }
        }
        deck.deckCards = new ArrayList(deck.deckCards.subList(0, num));
    }

    public void discardCard(int ind){
        discardedCards.add(handCards.get(ind));
        if (ind != 0) {
            handCards.remove(ind);
            updateSize();
        }
    }

    public void discardCard(Object card){
        discardedCards.add(card);
        try {
            handCards.remove(card);
            updateSize();
        }
        catch (Exception e){
        }
    }

}

/*package Entities;

import java.util.ArrayList;

public class YHand {
    YDeck yDeck = YDeck.getInstance();
    public ArrayList yHandCards = new ArrayList();
    public ArrayList yBurnedCards = new ArrayList();
    public ArrayList yDiscardedCards = new ArrayList();
    int yHandLimit = 10;

    public void yAddCard(Card card) {
        yHandCards.add(card);
    }
    public void yDrawCard(int num) {
        yBurnedCards.clear();
        for (int i = 0; i < num; i++) {
            if (yHandLimit <= yHandCards.size()){
                yDeck.yGraveyard.add(yDeck.yDeckCards.get(num));
                yBurnedCards.add(yDeck.yDeckCards.get(num));
            }
            else{
                yHandCards.add(yDeck.yDeckCards.get(num));
            }
        }
        yDeck.yDeckCards = new ArrayList(yDeck.yDeckCards.subList(0, num));
    }

    public void yDiscardCard(int num){
        yDiscardedCards.add(yHandCards.get(num));
        yHandCards.remove(num);
    }

    public void yDiscardCard(Object card){
        yDiscardedCards.add(card);
        yHandCards.remove(card);
    }

}*/
