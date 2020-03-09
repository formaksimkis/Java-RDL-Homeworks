package homework.task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CientTest {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new ProducerTask(buffer));
        executorService.execute(new ConsumerTask(buffer,1));
        executorService.execute(new ConsumerTask(buffer,2));
        executorService.execute(new ConsumerTask(buffer,3));
        executorService.shutdown();
    }

}
