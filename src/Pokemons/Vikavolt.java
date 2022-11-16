package Pokemons;

import Attacks.PhysicalAttacks.Facade;
import ru.ifmo.se.pokemon.Type;

public class Vikavolt extends Charjabug{
    public Vikavolt(String name, int lvl){
        super(name, lvl);
        this.setStats(77, 70, 90, 145, 75, 43);
        this.setType(Type.BUG, Type.ELECTRIC);
        this.addMove(new Facade());
    }
}