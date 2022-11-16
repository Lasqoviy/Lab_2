package Attacks.SpecialAttacks;
import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(){super(Type.FAIRY, 80, 1.0);}
    @Override
    protected String describe(){
        return "Применяет Dazzling Gleam";
    }
}
