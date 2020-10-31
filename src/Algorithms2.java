
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.stream;


/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {
    Data data = new Data();

    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH
    public int findNumberLinear(int number) {
        for (int i = 0; i < data.getRandomNumbers1000().length; i++) {
            if (data.getRandomNumbers1000()[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int findNameLinear(String name){
        for (int i = 0; i < data.getRandomNumbers1000().length; i++) {
            if (data.getRandomDrengeNavne()[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public int[] sortNumbersArray(){
        return stream(data.getRandomNumbers1000()).sorted().toArray();
    }
    public List<String> sortBoyNameArray(){
        return stream(data.getRandomDrengeNavne()).sorted().collect(Collectors.toList());
    }

    public int binarySearchNumber(int number){
        return binarySearch(data.getRandomNumbers1000(),number);
    }

    public static void main(String[] args) {
        Algorithms2 algo2 = new Algorithms2();
        System.out.println(algo2.findNumberLinear(1336));
        System.out.println(algo2.findNameLinear("Faktor"));
        stream(algo2.sortNumbersArray()).forEach(System.out::println);
        System.out.println(algo2.sortBoyNameArray().get(0));
        System.out.println(algo2.binarySearchNumber(5));
    }
}
