package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] filtersNums = nums.stream().filter(num -> num >= 3).map(num -> num * num).toArray(Integer[]::new);

        System.out.println(Arrays.toString(filtersNums));
    }
}
