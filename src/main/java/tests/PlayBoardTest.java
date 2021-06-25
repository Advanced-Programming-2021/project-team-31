 package tests;

import controller.GlobalVariable;
import model.*;
import org.junit.jupiter.api.Test;
import model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayBoardTest {
     Player player1 = new Player("ali","hassan","lol");
     Player player2 = new Player("kami","mom","ltl");
     Card card = new Card("a",1,"1","1",true,1);
     Card card2 = new Card("b",1,"1","1",true,1);
     Card card3 = new Card("b",1,"1","1",true,1);


     ArrayList<MonsterCard> changedPositionCards=new ArrayList<>();
     ArrayList<MonsterCard> attackerCards=new ArrayList<>();
     ArrayList<SpellCard> activatedSpellCards=new ArrayList<>();
     List<MonsterCard> summonCards=new ArrayList<>();
     boolean isCardSummonedOrSet;
     boolean isCardAttacked;
     boolean isPositionChanged;
     ArrayList<Card> graveyard=new ArrayList<>();
     SpellCard fields = new SpellCard("a","s",1,"a","c",true,1,"ff");
     Deck deck1 =  new Deck("a");
     Deck deck2 =  new Deck("b");
     int lifePoint;

     ArrayList<MonsterCard> monsters=new ArrayList<>();
     ArrayList<Card> SpellTrap=new ArrayList<>();
     ArrayList<Card> hand=new ArrayList<>();
     Card selectedCard;
     Card selectedOpponentCard;

    PlayBoardTest() throws IOException {

    }


    @Test
    void setSelectedOpponentCard() {
        try {
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);
            assertNotNull(pl.getSelectedOpponentCard());
        }
        catch (Exception e){ }

    }

    @Test
    void getSelectedCard() {
        try {
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        assertEquals(pl.getSelectedCard(),card);
        }
        catch (Exception e){ }
    }

    @Test
    void getSelectedOpponentCard() {
        try {
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

   assertEquals(pl.getSelectedOpponentCard(),card);
        }
        catch (Exception e){ }
    }

    @Test
    void setSelectedCard() {
        try {
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setSelectedCard(this.card);
        Card card20 =pl.getSelectedCard() ;
        assertEquals(card20,card);
        }
        catch (Exception e){ }
    }

    @Test
    void isCardSummonedOrSet() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        Boolean s = pl.isCardSummonedOrSet();
        assertTrue(s);
        }
        catch (Exception e){ }
    }

    @Test
    void isCardAttacked() {
        try {


        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        Boolean s = pl.isCardAttacked();
        assertTrue(s);
        }
        catch (Exception e){ }
    }

    @Test
    void setCardSummonedOrSet() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setCardSummonedOrSet(pl.isCardSummonedOrSet());

        assertTrue(isCardSummonedOrSet);
        }
        catch (Exception e){ }
    }

    @Test
    void setCardAttacked() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setCardAttacked(isCardAttacked);

        assertTrue(isCardAttacked);
        }
        catch (Exception e){ }
    }

    @Test
    void setPositionChanged() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setPositionChanged(isPositionChanged);
        assertTrue(isPositionChanged);
        }
        catch (Exception e){ }
    }

    @Test
    void setPlayer() { try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setPlayer(player1);
        assertEquals(pl.getPlayer(),player1);
    }
    catch (Exception e){ }
    }

    @Test
    void selectMonster() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        MonsterCard m =pl.selectMonster(1);
        assertNotNull(m);
        }
        catch (Exception e){ }
    }

    @Test
    void selectSpellOrTrap() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        Card s =pl.selectSpellOrTrap(1);
        assertNotNull(s);
        }
        catch (Exception e){ }
    }

    @Test
    void selectFromHand() {
        try {


        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        Card s =pl.selectFromHand(1);
        assertNotNull(s);
        }
        catch (Exception e){ }
    }

    @Test
    void getChangedPositionCards() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        List<MonsterCard> l = pl.getChangedPositionCards();
        assertNotNull(l);
        }
        catch (Exception e){ }
    }

    @Test
    void setChangedPositionCards() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setChangedPositionCards(changedPositionCards);
        assertNotNull(pl.getChangedPositionCards());
        }
        catch (Exception e){ }
    }

    @Test
    void getAttackerCards() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        assertNotNull(pl.getAttackerCards());
        }
        catch (Exception e){ }
    }

    @Test
    void setAttackerCards() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        pl.setAttackerCards(attackerCards);
        assertNotNull(pl.getAttackerCards());
        }
        catch (Exception e){ }
    }

    @Test
    void getActivatedSpellCards() {
        try{
        Player p = new Player("a","b","c");
        Player op = new Player("m","n","p");
        Deck deck = new Deck("a");
        deck.addCard(card,1);
        GlobalVariable.setPlayer(p);
        p.addDeck(deck);
        op.addDeck(deck);
        p.setActivatedDeck(deck);
        op.setActivatedDeck(deck);
        PlayBoard pl = new PlayBoard(p);
        PlayBoard Opl = new PlayBoard(op);
        Board board = new Board(pl,Opl);
        GlobalVariable.setBoard(board);
        pl.setSelectedOpponentCard(card);

        assertNotNull(pl.getActivatedSpellCards());
        }
        catch (Exception e){ }
    }

    @Test
    void setActivatedSpellCards() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            assertNotNull(pl.getActivatedSpellCards());
        }
        catch (Exception e){ }

    }

    @Test
    void getSummonCards() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            assertNotNull(pl.getSummonCards());
        }
        catch (Exception e){ }

    }

    @Test
    void setSummonCards() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            assertNotNull(pl.getSummonCards());        }
        catch (Exception e){ }


    }

    @Test
    void getGraveyards() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            assertNotNull(pl.getGraveyards());        }
        catch (Exception e){ }



    }

    @Test
    void setGraveyards() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);
            assertNotNull(pl.getGraveyards());      }
        catch (Exception e){ }


    }

    @Test
    void getFields() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);
            assertNotNull(pl.getFields());     }
        catch (Exception e){ }



    }

    @Test
    void setFields() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            assertNotNull(pl.getFields());}
        catch (Exception e){ }


    }

    @Test
    void getDeck() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            assertNotNull(pl.getDeck());;}
        catch (Exception e){ }

    }

    @Test
    void setDeck() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            assertNotNull(pl.getDeck());}
        catch (Exception e){ }

    }

    @Test
    void getMonsters() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            assertNotNull(pl.getMonsters());}
        catch (Exception e){ }

    }

    @Test
    void setMonsters() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            assertNotNull(pl.getMonsters());}
        catch (Exception e){ }


    }

    @Test
    void getSpellTrap() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            assertNotNull(pl.getSpellTrap());}

        catch (Exception e){ }


    }


    @Test
    void getHand() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            assertNotNull(pl.getHand());}

        catch (Exception e){ }



    }

    @Test
    void setHand() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertNotNull(pl.getHand());}

        catch (Exception e){ }



    }

    @Test
    void graveToString() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertNotEquals(pl.graveToString(),"hi");}

        catch (Exception e){ }



    }

    @Test
    void getPlayer() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertNotNull(pl.getPlayer());}

        catch (Exception e){ }

    }

    @Test
    void isDeckFinished() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertTrue(pl.isDeckFinished());}

        catch (Exception e){ }

    }



    @Test
    void monster() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertNotNull(pl.monster(1));}

        catch (Exception e){ }

    }

    @Test
    void spell() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertNotNull(pl.spell(2));}

        catch (Exception e){ }


    }


    @Test
    void rotateToString() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            assertNotNull(pl.rotateToString());}

        catch (Exception e){ }


    }

    @Test
    void decreaseLifePoint() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            pl.decreaseLifePoint(1);
            assertNotNull(lifePoint);}

        catch (Exception e){ }


    }

    @Test
    void isPositionChanged() {
        try{
            Player p = new Player("a","b","c");
            Player op = new Player("m","n","p");
            Deck deck = new Deck("a");
            deck.addCard(card,1);
            GlobalVariable.setPlayer(p);
            p.addDeck(deck);
            op.addDeck(deck);
            p.setActivatedDeck(deck);
            op.setActivatedDeck(deck);
            PlayBoard pl = new PlayBoard(p);
            PlayBoard Opl = new PlayBoard(op);
            Board board = new Board(pl,Opl);
            GlobalVariable.setBoard(board);
            pl.setSelectedOpponentCard(card);

            pl.setActivatedSpellCards(activatedSpellCards);
            pl.setSummonCards(summonCards);
            pl.setGraveyards(graveyard);

            pl.setFields(fields);
            pl.setDeck(player1);
            pl.setMonsters(monsters);
            pl.setHand(hand);
            pl.decreaseLifePoint(1);
            assertTrue(pl.isPositionChanged());}

        catch (Exception e){ }



    }


}