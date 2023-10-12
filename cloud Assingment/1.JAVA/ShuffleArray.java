
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the values separated by spaces (e.g., 1 2 3 4 5 6 7):");
            String input = scanner.nextLine();
            String[] values = input.split(" ");

            Integer[] array = new Integer[values.length];
            for (int i = 0; i < values.length; i++) {
                array[i] = Integer.parseInt(values[i]);
            }

            List<Integer> list = Arrays.asList(array);
            Collections.shuffle(list);

            System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
