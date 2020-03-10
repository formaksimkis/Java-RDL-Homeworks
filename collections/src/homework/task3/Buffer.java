package homework.task3;

import homework.task2_4.Order;
import homework.task2_4.PageOrder;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;


public class Buffer {
    private Queue queue = new ConcurrentLinkedQueue<Order>();

    public Order get() {
        return (Order) queue.poll();
    }

    public void put(PageOrder order) {
        queue.add(order);

    }

    public boolean isBufferEmpty() {
        return queue.isEmpty();
    }
}
