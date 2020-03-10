package homework.task2_4;

public class Main {
    public static void main(String[] args) {
        TestPageOrder testPageOrder = new TestPageOrder(30);
        testPageOrder.createPageOrderList();
        System.out.println(testPageOrder.toString());
        System.out.println();
        System.out.println(testPageOrder.filterByOrder(PageOrder.OrderStatus.COMPLETED));
        System.out.println();
        System.out.println(testPageOrder.filterByCountOfViewsLess(5));
        System.out.println();
        System.out.println(testPageOrder.filterByCountOfViewsMore(25));
        System.out.println();
        System.out.println(testPageOrder.removeDuplicates());
    }
}
