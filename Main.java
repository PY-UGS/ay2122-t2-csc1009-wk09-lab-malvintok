import java.util.ArrayList;

public class Main {
    public static final int NUMBEROFCHAR = 15;
    public static void main(String[] args) {
        RandomCharacter randChar = new RandomCharacter(NUMBEROFCHAR);
        ArrayList<String> charArr = randChar.getRandomCharacter(NUMBEROFCHAR);
        for (int i=0; i < NUMBEROFCHAR; i++) {
            System.out.print(charArr.get(i) + " ");
        }
    }
}
