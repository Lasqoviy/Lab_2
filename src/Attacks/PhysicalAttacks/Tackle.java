package Attacks.PhysicalAttacks;
import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove{
    public Tackle(){super(Type.NORMAL, 40, 1.0);}
    @Override
    protected String describe(){
        return "Применяет Tackle";
    }
}

