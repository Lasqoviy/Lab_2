package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){super(Type.ELECTRIC, 90, 1.0);}
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() < 0.1){
            Effect effect = new Effect();
            effect.condition(Status.PARALYZE);
            pokemon.setCondition(effect);
        }
    }
    @Override
    protected String describe(){
        return "Применяет Thunderbolt";
    }
}
