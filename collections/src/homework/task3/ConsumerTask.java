package homework.task3;

public class ConsumerTask implements Runnable {
    private Buffer buffer;
    private int id;

    public ConsumerTask(Buffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    @Override
    public void run() {
        while (!buffer.isBufferEmpty()) {
            int ms = 10 * id;
            System.out.println("Consumer " + id + " received : " + buffer.get());
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
