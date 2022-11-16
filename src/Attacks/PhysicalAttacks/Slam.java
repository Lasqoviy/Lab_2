package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Slam extends PhysicalMove {
    public Slam(){super(Type.NORMAL, 80, 0.75);}
    @Override
    protected String describe(){
        return "Применяет Slam";
    }
}