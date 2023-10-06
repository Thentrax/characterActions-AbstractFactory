package Character;

public class Character {
    private final Attack attack;
    private final Spell spell;

    public Character (AbstractFactory factory){
        this.attack = factory.rollAnAttack();
        this.spell = factory.castASpell();
    }

    public String attack(){
        return this.attack.attack();
    }

    public String cast(){
        return this.spell.cast();
    }
}
