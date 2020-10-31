import java.util.ArrayList;
import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public enum  Algorithms1 {
    ALGO1;
    Random random = new Random();



    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomPigeNavne property OBS: randomPigeNavne skal forblive private!

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)

    // TODO 8 - Skriv en  plet eller krone generator metode (plet er boolean true og krone er boolean false)

    public static void main(String[] args) {

        System.out.println(ALGO1.randomGirlName());
        System.out.println(ALGO1.randomBoyName());
        System.out.println(ALGO1.randomName());
        System.out.println(ALGO1.randomLetter());
        System.out.println(ALGO1.headOrTails());
    }

    String randomBoyName() {

        return Data.DATA.getRandomDrengeNavne()[random.nextInt(Data.DATA.getRandomDrengeNavne().length)];
    }

    String randomGirlName() {

        return Data.DATA.getRandomPigeNavne()[random.nextInt(Data.DATA.getRandomPigeNavne().length)];
    }
    String randomName() {
        ArrayList<String> names = new ArrayList<>();
        names.add(randomGirlName());
        names.add(randomBoyName());

        return names.get(random.nextInt(2));
    }

    char randomLetter() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        return letters.charAt(random.nextInt(letters.length()));
    }
    Boolean headOrTails() {

        return random.nextBoolean();
    }

}
