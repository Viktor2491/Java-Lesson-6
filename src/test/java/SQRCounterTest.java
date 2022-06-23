import org.junit.jupiter.api.Test;
import ru.netology.sqr.services.SQRCounter;

public class SQRCounterTest {
@Test
    void numberOfSquares() {
        SQRCounter service = new SQRCounter();
        int min = 500;
        int max = 800;
        // вычисляем какое количество чисел получилось
    System.out.println("Количество чисел:" + service.sqrofCount(min, max));
        }

}
