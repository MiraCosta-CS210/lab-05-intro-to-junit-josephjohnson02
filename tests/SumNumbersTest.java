import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {
    @Test
    void sumIsEvenTest1() {
        SumNumbers sumTest1 = new SumNumbers();
        int sumAnswer = sumTest1.sumIsEven(1, 1);
        assertEquals(1, sumAnswer);
    }

    @Test
    void sumIsEvenTest2() {
        SumNumbers sumTest2 = new SumNumbers();
        int sumAnswer = sumTest2.sumIsEven(1, 2);
        assertEquals(0, sumAnswer);
    }
}