package homework.task2_4;

import java.util.Objects;

import static homework.task2_4.Order.OrderStatus;

public class PageOrder implements Order<Integer, OrderStatus>, Comparable {
    private Integer countOfWatches;
    private OrderStatus order;

    public PageOrder(Integer countOfWatches, OrderStatus order) {
        this.countOfWatches = countOfWatches;
        this.order = order;
    }

    @Override
    public Integer getCount() {
        return countOfWatches;
    }

    @Override
    public OrderStatus getOrder() {
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageOrder pageOrder = (PageOrder) o;
        return countOfWatches.compareTo(pageOrder.countOfWatches) == 0 &&
                order == pageOrder.order;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfWatches, order);
    }

    @Override
    public String toString() {
        return "PageOrder{" +
                "countOfWatches=" + countOfWatches +
                ", order=" + order +
                '}' + '\n';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) return 1;
        PageOrder pageOrder = (PageOrder) o;
        return countOfWatches.compareTo(pageOrder.countOfWatches);
    }
}
