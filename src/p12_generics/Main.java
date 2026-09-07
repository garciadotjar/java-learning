//09-07-2026
//generics
package p12_generics;


import java.util.*;

public class Main {
    public static <T> Map<T, Integer> countOccurrences(List<T> list){
        Map<T, Integer> map = new HashMap<>();
        for (T item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lucas", "Ana", "Ana", "Roberto", "Lucas", "Lucas", "Lucas");
        Map<String, Integer> result = countOccurrences(names);
        System.out.println(result);
    }
}
