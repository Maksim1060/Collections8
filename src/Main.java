import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("hello", "world", "good bye", "world","how","are","you","hello"));
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,33,55));
        task1(nums);
        task2(nums);
        task3(strings);
        task4(strings);

    }

    public static void task1(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }System.out.print(result);
        System.out.println( " ");
    }public static void task2(List<Integer>nums) {
        List<Integer> result2 = new ArrayList<>();
        for (Integer i : nums) {
            if (i % 2 == 0) {
                result2.add(i);
            }
        } System.out.println(result2);
    }

    public static void task3(List<String> strings) {
        Set<String> uniqWords = new HashSet<>(strings);
        System.out.println(uniqWords);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> countWord = new HashMap<>();
        for (String str : strings) {
            if (!countWord.containsKey(str)) {
                countWord.put(str, 1);
            } else {
                countWord.put(str, countWord.get(str) + 1);
            }
        }for (Map.Entry<String,Integer> e:countWord.entrySet()){
            if (e.getValue() >= 1) {
                System.out.println(e);

            }
        }System.out.println(countWord);

    }

}