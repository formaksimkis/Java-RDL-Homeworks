package homework.task2_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestPageOrder {
    private List<PageOrder> pageOrderList;
    private int countOfPages;

    public TestPageOrder(int countOfPages) {
        this.countOfPages = countOfPages;
        pageOrderList = new ArrayList<>();
    }

    public void createPageOrderList() {
        for (int i = 0; i <= countOfPages; i++) {
            pageOrderList.add(new PageOrder((int)Math.round(Math.random()*countOfPages),
                    i <= countOfPages/3 ? PageOrder.OrderStatus.NOT_STARTED :
                            ((i > countOfPages/3 && i <= countOfPages/3*2) ?
                                    PageOrder.OrderStatus.PROCESSING : PageOrder.OrderStatus.COMPLETED)));
        }

    }

    public List<PageOrder> filterByOrder (PageOrder.OrderStatus status) {
        return pageOrderList.stream()
                .filter(o -> o.getOrder().equals(status))
                .collect(Collectors.toList());
    }

    public List<PageOrder> filterByCountOfViewsMore(Integer count) {
        return pageOrderList.stream()
                .filter(o -> o.getCount() > count)
                .collect(Collectors.toList());
    }

    public List<PageOrder> filterByCountOfViewsLess(Integer count) {
        return pageOrderList.stream()
                .filter(o -> o.getCount() < count)
                .collect(Collectors.toList());
    }

    public List<PageOrder> removeDuplicates() {
        return pageOrderList.stream()
                .distinct().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "TestPageOrder{" +
                "pageOrderList=" + pageOrderList +
                '}';
    }
}
