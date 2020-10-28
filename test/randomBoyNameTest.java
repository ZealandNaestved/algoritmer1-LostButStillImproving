import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class randomBoyNameTest {

    @Test
    void returnsTheCorrectName(){
        Algorithms1 algo = new Algorithms1();
        algo.random.setSeed(15L);
        Assertions.assertEquals("Life", algo.randomBoyName());
    }
}
