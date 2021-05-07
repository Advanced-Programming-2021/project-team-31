package model;

import java.util.ArrayList;

public class Card {
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public Card(String name, int number, String type, String cardDescription, ArrayList<Integer> cardController, boolean side, int price) {
        this.name = name;
        this.number = number;
        this.type = type;
        this.cardDescription = cardDescription;
        this.cardController = cardController;
        this.side = side;
        this.price = price;
    }

    public ArrayList<Integer> getCardController() {
        return cardController;
    }

    public void setCardController(ArrayList<Integer> cardController) {
        this.cardController = cardController;
    }


    public boolean isSide() {
        return side;
    }

    public void setSide(boolean side) {
        this.side = side;
    }

    public static ArrayList<Card> getAllCards() {
        return allCards;
    }

    public static void setAllCards(ArrayList<Card> allCards) {
        Card.allCards = allCards;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected String name;
    protected int number;
    protected String type;
    protected String cardDescription;
    protected ArrayList<Integer> cardController;
    protected boolean side;
    protected int price;

    private  static ArrayList<Card> allCards=new ArrayList<>();

    public String getName() {
        return name;
    }
    public static Card getCardByName(String name) {
        for(Card card:allCards){
            if(card.getName().equals(name))return card;
        }
        return null;
    }
    public static boolean doesCardExist(String name) {
        for(Card card:allCards){
            if(card.getName().equals(name))return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card name : " + name +
                " cardDescription : " + cardDescription
                ;
    }
}
