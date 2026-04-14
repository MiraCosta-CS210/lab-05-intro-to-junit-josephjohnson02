import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {
    @Test
    void calculateTipTest1() {
        TipCalculator tipTest1 = new TipCalculator();
        double tipAnswer = tipTest1.calculateTip(100, 20);
        assertEquals(20, tipAnswer);
    }

    @Test
    void calculateTipTest2() {
        TipCalculator tipTest2 = new TipCalculator();
        double tipAnswer = tipTest2.calculateTip(20, 50);
        assertEquals(10, tipAnswer);
    }
}