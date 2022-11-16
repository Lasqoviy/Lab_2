package Pokemons;
import Attacks.PhysicalAttacks.ShadowClaw;
import Attacks.PhysicalAttacks.Slam;
import Attacks.StatusAttacks.Amnesia;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sentret extends Pokemon {
    public Sentret(String name, int lvl){
        super(name, lvl);
        this.setStats(35, 46, 34, 35, 45, 20);
        this.setType(Type.NORMAL);
        this.addMove(new Slam());
        this.addMove(new ShadowClaw());
        this.addMove(new Amnesia());
    }
}
