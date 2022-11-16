package Attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
    public Discharge(){super(Type.ELECTRIC, 80, 1.0);}
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() < 0.3){
            Effect effect = new Effect();
            effect.condition(Status.PARALYZE);
            pokemon.setCondition(effect);
        }
    }
    @Override
    protected String describe(){
        return "Применяет Discharge";
    }
}
