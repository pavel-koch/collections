import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 2, 6, 2, 3, 4, 5, 6, 7, 5, 8));
    private static final List<String> simv = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task3Ver2();

    }

    public static void task1() {
        System.out.println("Задание №1");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("Задание №2");
        Collections.sort(nums);
        int uniqueness = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != uniqueness) {
                System.out.println(num);
                uniqueness = num;
            }
        }
    }
    public static void task3() {
        System.out.println("Задание №3");
        Collections.sort(simv);
        String uniqueness = "";

        for (String s : simv) {
            if (!s.equals(uniqueness)) {
                System.out.println(s);
                uniqueness = s;
            }
        }

    }
    public static void task3Ver2() {
        System.out.println("Задание №3 Версия 2");
        Set<String> uniquenessWords = new HashSet<>(simv);
        System.out.println(uniquenessWords);
    }



}
