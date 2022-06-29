package ru.netology.sqr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRCounterTest {
    @Test
    void numberOfSquares() {
        SQRCounterService service = new SQRCounterService();
        int min = 200;
        int max = 300;
        int expected = 3;
        // вычисляем какое количество чисел получилось
        int actual = service.sqrofCount(min, max);
        //сравниваем результаты
        Assertions.assertEquals( expected, actual);
        System.out.println("Количество чисел:" + actual);
    }

}
