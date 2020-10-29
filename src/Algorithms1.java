import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {
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
        exampleOfPredictableRandomNumber();
        Algorithms1 algo = new Algorithms1();
        Algorithms1 algo1 = new Algorithms1();
        System.out.println(algo.randomName());
        System.out.println(algo1.randomName());
    }

    String randomBoyName() {

        String[] drengeNavne = new Data().getRandomDrengeNavne();
        return drengeNavne[random.nextInt(drengeNavne.length)];

    }

    String randomGirlName() {

        String[] pigeNavne = new Data().getRandomPigeNavne();
        return pigeNavne[random.nextInt(pigeNavne.length)];

    }
    String randomName() {
        ArrayList<String> names = new ArrayList<>();
        names.add(randomGirlName());
        names.add(randomBoyName());
        return names.get(random.nextInt(2));

    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

}
