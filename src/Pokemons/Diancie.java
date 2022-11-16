package Pokemons;
import Attacks.SpecialAttacks.AncientPower;
import Attacks.SpecialAttacks.DazzlingGleam;
import Attacks.StatusAttacks.Confide;
import Attacks.PhysicalAttacks.Tackle;
import ru.ifmo.se.pokemon.*;

public class Diancie extends Pokemon{
    public Diancie(String name, int lvl){
        super(name, lvl);
        this.setStats(50,100,150,100,150,50);
        this.setType(Type.ROCK, Type.FAIRY);
        this.addMove(new Tackle());
        this.addMove(new Confide());
        this.addMove(new DazzlingGleam());
        this.addMove(new AncientPower());
    }
}