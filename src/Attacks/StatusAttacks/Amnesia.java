package Attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
    public Amnesia(){super(Type.PSYCHIC, 0, 0);}
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, 2);
        pokemon.addEffect(effect);
        super.applySelfEffects(pokemon);
    }
    @Override
    protected String describe(){
        return "Применяет Amnesia";
    }
}
