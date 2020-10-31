import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Algorithms1Test {

    @Test
    void returnsTheCorrectName(){

        Algorithms1.ALGO1.random.setSeed(15L);
        Assertions.assertEquals("Life", Algorithms1.ALGO1.randomBoyName());
    }

    @Test
    void returnsRandomNameFromBoysAndGirls() {

        Algorithms1.ALGO1.random.setSeed(15L);
        Assertions.assertEquals("Harme", Algorithms1.ALGO1.randomName());
    }
}
