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

    int findMax(Integer[] nums){
        int max = -1;
        for(int n: nums) max = Math.max(n, max);
        return max;
    }
    Integer[] findDuplicates(Integer[] input){
        Arrays.sort(input);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < input.length; i++){
            int cnt = 1;
            if(i < input.length - 1 && input[i] == input[i + 1]){
                i++;
                cnt++;
            }
            if(cnt > 1) ans.add(input[i]);
        }
        Integer[] arr = new Integer[ans.size()];
        for(int i = 0; i < ans.size(); i++) arr[i] = ans.get(i);
        return arr;
    }
    Integer[] findUnique(Integer[] input){
        Arrays.sort(input);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < input.length; i++){
            if(i != 0 && input[i] == input[i - 1]) continue;
            if(i != input.length - 1 && input[i] == input[i + 1]) continue;
            ans.add(input[i]);
        }
        Integer[] arr = new Integer[ans.size()];
        for(int i = 0; i < ans.size(); i++) arr[i] = ans.get(i);
        return arr;
    }
    
}

