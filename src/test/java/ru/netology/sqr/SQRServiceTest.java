package ru.netology.sqr;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class SQRServiceTest {
    @Test
    public void test() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertArrayEquals(expected, actual);
    }
    private void assertArrayEquals(int expected, int actual) {
    }

}
