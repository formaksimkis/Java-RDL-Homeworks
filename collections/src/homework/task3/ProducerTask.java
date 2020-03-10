package homework.task3;

import homework.task2_4.Order;
import homework.task2_4.PageOrder;

public class ProducerTask implements Runnable {
    private Buffer buffer;

    public ProducerTask(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            PageOrder order = new PageOrder(i, Order.OrderStatus.COMPLETED);
            System.out.println("Producer produced : " + order);
            buffer.put(order);
        }
    }
}
