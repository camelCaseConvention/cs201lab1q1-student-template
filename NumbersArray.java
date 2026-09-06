import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    public static Integer findMax(Integer[] input) {
        Integer max = input[0];

        for (Integer num : input) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (Integer num : input) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input) {
        Map<Integer, Integer> count = new LinkedHashMap<>();

        for (Integer num : input) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> unique = new ArrayList<>();

        for (Integer num : input) {
            if (count.get(num) == 1) {
                unique.add(num);
            }
        }

        return unique.toArray(new Integer[0]);
    }
}