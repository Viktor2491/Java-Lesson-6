import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRCounterService;

public class SQRCounterTest {
@Test
    void numberOfSquares() {
        SQRCounterService service = new SQRCounterService();
        int min = 500;
        int max = 800;
        // вычисляем какое количество чисел получилось
    System.out.println("Количество чисел:" + service.sqrofCount(min, max));
        }

}
