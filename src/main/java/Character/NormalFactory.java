package Character;

public class NormalFactory implements AbstractFactory{
    @Override
    public Attack rollAnAttack(){
        return new AttackNormal();
    }

    @Override
    public Spell castASpell() {
        return new SpellBasic();
    }

}
