package Attacks.SpecialAttacks;
import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    public AncientPower(){super(Type.ROCK, 60, 1.0);}
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect effect = new Effect().chance(0.1).stat(Stat.ATTACK, 1).stat(Stat.DEFENSE, 1).stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.SPECIAL_DEFENSE, 1).turns(-1);
        pokemon.addEffect(effect);
        super.applySelfEffects(pokemon);
    }
    @Override
    protected String describe(){
        return "Применяет AncientPower";
    }
}
