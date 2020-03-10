package homework.task6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cashing {
    public static void main(String[] args) {
        Map<String, Integer> cityCashMap = new TreeMap<>();
        System.out.println("Enter please city: ");
        Scanner scanner = new Scanner(System.in);
        String key = "";
        while (true) {
            key = scanner.nextLine();
            if (!key.equals("exit")) {
                if (!cityCashMap.containsKey(key)) {
                    getCitizens(key, cityCashMap);
                }
                System.out.println(cityCashMap.get(key));
                System.out.println("For exit write 'exit'");
            } else break;
        }
    }

    public static void getCitizens(String string, Map<String, Integer> map) {
        Integer count;
        count = (int)Math.round(Math.random()*1000000);
            map.put(string, count);
    }
}
