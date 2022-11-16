package Attacks.PhysicalAttacks;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(){super(Type.GHOST, 70, 1.0);}
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (1/8 > Math.random()){
            System.out.println("Critical");
            return 2.0;
        }else{
            return 1.0;
        }
    }
    @Override
    protected String describe(){
        return "Применяет Shadow Claw";
    }
}