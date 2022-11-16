
import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Battleground {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon charjabug = new Charjabug("Charjabug", 9);
        Pokemon diancie = new Diancie("Diancie", 10);
        Pokemon furret = new Furret("Furret", 8);
        Pokemon grubbin = new Grubbin("Grubbin", 10);
        Pokemon sentret = new Sentret("Sentret", 9);
        Pokemon vikavolt = new Vikavolt("Vikavolt", 8);
        battle.addAlly(charjabug);
        battle.addAlly(diancie);
        battle.addAlly(furret);
        battle.addFoe(grubbin);
        battle.addFoe(sentret);
        battle.addFoe(vikavolt);
        battle.go();
    }
}
