package homework.task2_4;

public interface Order<K, V> {

    K getCount();

    V getOrder();

    enum OrderStatus {NOT_STARTED, PROCESSING, COMPLETED};
}
