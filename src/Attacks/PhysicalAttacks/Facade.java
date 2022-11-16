package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){super(Type.NORMAL, 70, 1.0);}
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        if (pokemon.getCondition().equals(Status.BURN)){
            power = power*2;
        }else if (pokemon.getCondition().equals(Status.PARALYZE)){
            power = power*2;
        }else if (pokemon.getCondition().equals(Status.POISON)){
            power = power*2;
        }
    }
    @Override
    protected String describe(){
        return "Применяет Facade";
    }
}
