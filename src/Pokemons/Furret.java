package Pokemons;
import Attacks.SpecialAttacks.FocusBlast;
import ru.ifmo.se.pokemon.Type;

public class Furret extends Sentret {
    public Furret(String name, int lvl){
        super(name, lvl);
        this.setStats(85, 76, 64, 45, 55, 90);
        this.setType(Type.NORMAL);
        this.addMove(new FocusBlast());
    }
}
