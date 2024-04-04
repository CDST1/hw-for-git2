import java.util.Scanner;

public class task7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите предложение: ");
            String sentence = scanner.nextLine();

            String[] words = sentence.split(" ");

            for (String word : words) {
                if (isPalindrome(word)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        public static boolean isPalindrome(String word) {
            if (word.length() <= 1) {
                return true;
            } else if (word.charAt(0) != word.charAt(word.length() - 1)) {
                return false;
            } else {
                return isPalindrome(word.substring(1, word.length() - 1));
            }
        }
    }

