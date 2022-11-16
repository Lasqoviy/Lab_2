package Attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class WildCharge extends PhysicalMove {
    public WildCharge(){super(Type.ELECTRIC, 90, 1.0);}
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        int intdamage = (int) damage;
        att.setMod(Stat.HP, intdamage/4);
    }

    @Override
    protected String describe(){
        return "Применяет Wild Charge";
    }
}
