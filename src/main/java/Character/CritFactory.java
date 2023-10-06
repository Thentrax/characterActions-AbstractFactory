package Character;

public class CritFactory implements AbstractFactory{
    @Override
    public Attack rollAnAttack() {
        return new AttackCrit();
    }

    @Override
    public Spell castASpell() {
        return new SpellCrit();
    }
}
