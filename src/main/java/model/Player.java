package model;



import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Player {
    protected String nickname;
    protected static ArrayList<Player> allPlayers = new ArrayList<>();
    protected int score;
    protected long money;
    protected   ArrayList<Deck> decks;
    protected   ArrayList<Deck> otherDecks;
    protected Deck activatedDeck;
    protected String password;
    protected String username;
    ArrayList<Card>cards=new ArrayList<>();
    protected static Player currentPlayer;

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        Player.currentPlayer = currentPlayer;
    }

    public Player(String nickname, String password, String username) {
        this.nickname = nickname;
        this.money = 400000;
        this.password = password;
        this.username = username;
        decks=new ArrayList<>();
        otherDecks=new ArrayList<>();
        allPlayers.add(this);
        JSONObject palyer = new JSONObject();

        palyer.put("nickname", nickname);
        palyer.put("username", username);
        palyer.put("password", password);

        JSONObject palyerObject = new JSONObject();
        palyerObject.put(username,palyer);
        try (FileWriter file = new FileWriter("D:\\project\\project\\src\\main\\resources\\view\\players.json",true)) {
            file.write(palyer.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public int countTotalCard(String name){
        int a=0;
        for(Card card:cards){
            if(card.getName().equals(name))a++;
        }
        return a;
    }

    public Player getPlayerByNickName(String nickname) {
        for(Player player:allPlayers){
            if(player.getNickname().equals(nickname))return player;
        }
        return null;

    }
    public boolean doesHaveCardWithName(String name) {
        for(Card card:cards){
            if(card.getName().equals(name))return true;
        }
        return false;

    }
    public void increaseScore(int increase){
        score+=increase;
    }
    public Card getCardByName(String name) {
        for(Card card:cards){
            if(card.getName().equals(name))return card;
        }
        return null;

    }



    public String getNickname() {
        return nickname;
    }

    public void increasePlayerMoney(int increase) {
        money += increase;

    }

    public void setMoney(long money) {
        this.money=money;

    }


    public long getMoney() {
        return money;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return  nickname + ": " +
                score ;
    }

    public static ArrayList<Player> getAllPlayers() {
        return allPlayers;
    }
    public boolean doesHaveDeckWithThisName(String name){
        for(Deck deck: decks){
            if (deck.getName().equals(name))return true;
        }
        return false;
    }

    public ArrayList<Deck> getOtherDecks() {
        return otherDecks;
    }

    public Deck getDeckByName(String name){
        for(Deck deck: decks){
            if (deck.getName().equals(name))return deck;
        }
        return null;
    }

    public void removeDeck(Deck deck){
        decks.remove(deck);

        if(activatedDeck!=null&&activatedDeck.getName().equals(deck.getName())) {
            activatedDeck=null;
        }
        else otherDecks.remove(deck);
    }
    public void removeFromDeck(Card card){
        cards.add(card);
    }
    public void addToDeck(Card card){
        cards.remove(card);
    }
    public void addDeck(Deck deck){
        decks.add(deck);
        otherDecks.add(deck);
    }

    public Deck getActivatedDeck() {
        return activatedDeck;
    }
    public static Player getPlayerByUser(String username){
        for (Player player:allPlayers){
            if (player.getUsername().equals(username)) return player;
        }
        return null;

    }

    public ArrayList<Deck> getDecks() {
        return decks;
    }

    public void setActivatedDeck(Deck activatedDeck) {
        this.activatedDeck = activatedDeck;
        otherDecks.remove(activatedDeck);
    }

    public void decreaseMoney(long decrease) {
        money -= decrease;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public static void logout() {
        currentPlayer = null;
    }
}
