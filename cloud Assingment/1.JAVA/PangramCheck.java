

import java.util.Scanner;

public class PangramCheck {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                mark[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a sentence to check if it's a pangram:");
            String input = scanner.nextLine();

            boolean isPangram = isPangram(input);
            if (isPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }
    }
}
