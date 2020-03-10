package homework.task5;

import homework.task2_4.Order;
import homework.task2_4.PageOrder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CompareSets {
    private static final HashSet<PageOrder> hashSet = new HashSet();
    private static final TreeSet<PageOrder> treeSet = new TreeSet();
    private static final Integer countMin = 100000;
    private static final Integer countMid = 1000000;
    private static final Integer countMax = 10000000;

    public static void main(String[] args) {
        put(countMin);
        iterateAndContains();
        min();
        max();
        iterateAndDelete();

        put(countMid);
        iterateAndContains();
        min();
        max();
        iterateAndDelete();

        put(countMax);
        iterateAndContains();
        min();
        max();
        iterateAndDelete();
    }

    public static void put(int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            hashSet.add(new PageOrder((int)Math.round(Math.random()*count), Order.OrderStatus.COMPLETED));
        }
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet put " + hashSet.size() + " elements. Time : " + finalTime + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            treeSet.add(new PageOrder((int)Math.round(Math.random()*count), Order.OrderStatus.COMPLETED));
        }
        finalTime = System.currentTimeMillis() - startTime;
        System.out.println("TreeSet put " + treeSet.size() + " elements. Time : " + finalTime + "ms");
    }

    public static void iterateAndContains() {
        HashSet<PageOrder> hashSetCopy = (HashSet<PageOrder>) hashSet.clone();
        long startTime = System.currentTimeMillis();
        Iterator<PageOrder> iterHashSet = hashSetCopy.iterator();
        while (iterHashSet.hasNext()) {
            hashSet.contains(iterHashSet.next());
        }
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet iterate and contains " + hashSet.size() + " elements. Time : " + finalTime + "ms");

        TreeSet<PageOrder> treeSetCopy = (TreeSet<PageOrder>) treeSet.clone();
        startTime = System.currentTimeMillis();
        Iterator<PageOrder> iterTreeSet = treeSetCopy.iterator();
        while (iterTreeSet.hasNext()) {
            hashSet.contains(iterTreeSet.next());
        }
        finalTime = System.currentTimeMillis() - startTime;
        System.out.println("TreeSet iterate and contains " + treeSet.size() + " elements. Time : " + finalTime + "ms");
    }

    public static void iterateAndDelete() {
        HashSet<PageOrder> hashSetCopy = (HashSet<PageOrder>) hashSet.clone();
        long startTime = System.currentTimeMillis();
        Iterator<PageOrder> iterHashSet = hashSetCopy.iterator();
        while (iterHashSet.hasNext()) {
            hashSet.remove(iterHashSet.next());
        }
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet iterate and delete " + hashSet.size() + " elements. Time : " + finalTime + "ms");

        TreeSet<PageOrder> treeSetCopy = (TreeSet<PageOrder>) treeSet.clone();
        startTime = System.currentTimeMillis();
        Iterator<PageOrder> iterTreeSet = treeSetCopy.iterator();
        while (iterTreeSet.hasNext()) {
            treeSet.remove(iterTreeSet.next());
        }
        finalTime = System.currentTimeMillis() - startTime;
        System.out.println("TreeSet iterate and delete " + treeSet.size() + " elements. Time : " + finalTime + "ms");
    }

    public static void min() {
        long startTime = System.currentTimeMillis();
        PageOrder order1 = hashSet.stream().min(PageOrder::compareTo).get();
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet min " + hashSet.size() + " elements. Time : " + finalTime + "ms");

        startTime = System.currentTimeMillis();
        PageOrder order2 = treeSet.first();
        finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet min " + treeSet.size() + " elements. Time : " + finalTime + "ms");
    }

    public static void max() {
        long startTime = System.currentTimeMillis();
        PageOrder order1 = hashSet.stream().max(PageOrder::compareTo).get();
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet max " + hashSet.size() + " elements. Time : " + finalTime + "ms");

        startTime = System.currentTimeMillis();
        PageOrder order2 = treeSet.last();
        finalTime = System.currentTimeMillis() - startTime;
        System.out.println("HashSet max " + treeSet.size() + " elements. Time : " + finalTime + "ms");
    }
}
