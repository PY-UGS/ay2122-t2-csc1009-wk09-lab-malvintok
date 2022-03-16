import java.util.ArrayList;
import java.util.Random;

/**
 * RandomCharacter
 */
public class RandomCharacter {

    Random random;
    ArrayList<String> randomCharacter;

    public RandomCharacter(int numOfChar) {
        random = new Random();
        randomCharacter = new ArrayList<String>();
    }

    public void setRandomCharacter(String randomCharacter) {
        this.randomCharacter.add(randomCharacter);
    }

    public String getRandomLowerCaseLetter() {
        return Character.toString((char)(random.nextInt(26) + 'a'));
    }

    public String getRandomUpperCaseLetter() {
        return Character.toString((char)(random.nextInt(26) + 'A'));
    }

    public String getRandomDigitCharacter() {
        return Integer.toString(random.nextInt(10));
    }

    public ArrayList<String> getRandomCharacter(int numOfChar) {
        for(int i = 0; i < numOfChar; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    setRandomCharacter(getRandomLowerCaseLetter());
                    break;
                case 1:
                    setRandomCharacter(getRandomUpperCaseLetter());
                    break;
                case 2:
                    setRandomCharacter(getRandomDigitCharacter());
                    break;
            }
        }
        return randomCharacter;
    }
}