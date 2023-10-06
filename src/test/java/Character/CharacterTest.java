package Character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void mustRollANormalAttack(){
        AbstractFactory factory = new NormalFactory();
        Character character = new Character(factory);
        assertEquals("1d8", character.attack());
    }
    @Test
    void mustRollACriticalAttack(){
        AbstractFactory factory = new CritFactory();
        Character character = new Character(factory);
        assertEquals("1d8 + 8", character.attack());
    }

    @Test
    void mustCastANormalSpell(){
        AbstractFactory factory = new NormalFactory();
        Character character = new Character(factory);
        assertEquals("costs 2 spell points", character.cast());
    }
    @Test
    void mustCastACriticalSpell(){
        AbstractFactory factory = new CritFactory();
        Character character = new Character(factory);
        assertEquals("costs 3 spell points", character.cast());
    }
}