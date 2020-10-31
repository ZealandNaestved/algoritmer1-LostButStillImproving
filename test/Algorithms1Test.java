import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Algorithms1Test {

    @Test
    void returnsTheCorrectName(){
        Algorithms1 algo = new Algorithms1();
        algo.random.setSeed(15L);
        Assertions.assertEquals("Life", algo.randomBoyName());
    }

    @Test
    void returnsRandomNameFromBoysAndGirls() {
        Algorithms1 algo = new Algorithms1();
        algo.random.setSeed(15L);
        Assertions.assertEquals("Harme", algo.randomName());
    }
}
