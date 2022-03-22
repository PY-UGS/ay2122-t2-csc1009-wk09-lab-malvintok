import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RandomCharacterTest {
    RandomCharacter random;
    String randChar;

    @Before
    public void setup() {
        random = new RandomCharacter(15);
    }

    @Test
    public void testUpperCase() {
        randChar = random.getRandomUpperCaseLetter();
        assertTrue(randChar == randChar.toUpperCase());
    }

    @Test
    public void testLowerCase() {
        randChar = random.getRandomLowerCaseLetter();
        assertTrue(randChar == randChar.toLowerCase());
    }

    @Test
    public void testDigitCharacter() {
        randChar = random.getRandomDigitCharacter();
        assertTrue(0 <= Integer.parseInt(randChar) && Integer.parseInt(randChar) <= 10);
    }

    @Test
    public void checkPrime() {
        randChar = random.getRandomDigitCharacter();
        boolean flag = true;
        int num = Integer.parseInt(randChar);
        if (num <= 1) {
            flag = false;
        } else if (num % 2 == 0 && num != 2) {
            flag = false;
        } else {
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0){
                    flag = false;
                }
            }
        }
        assertTrue(flag);
    }
}