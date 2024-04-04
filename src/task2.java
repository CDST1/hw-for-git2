import java.util.Scanner;


//TODO Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO – в противном случае.
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число для проверки: ");
        int num = sc.nextInt();
        if (isPowerOfTwo(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPowerOfTwo(int num) {
        if (num == 1) {
            return true;
        } else if (num % 2 != 0 || num <= 0) {
            return false;
        } else {
            return isPowerOfTwo(num / 2); //!!!!!!!!!!
        }
    }
}
