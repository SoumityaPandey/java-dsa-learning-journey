 import java.util.*;
public class randomshuffle {
    public static void main(String[] args) {
        // Note: Must use Integer[] (not int[]) for Collections.shuffle
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Convert to list and shuffle
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);

        System.out.println("Shuffled array: " + Arrays.toString(arr));
    }
}

