import java.util.Scanner;

public class task3 {
    //    TODO: Дано натуральное число N. Вычислите сумму его цифр.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int result = sum_of_digits(num);
        System.out.println(result);
    }

    public static int sum_of_digits(int num) {
        if (num < 0 || num == 0) {
            return 0;
        } else {
            return (num % 10 + sum_of_digits(num / 10)); //!!!!!!!!!!
        }

    }
}
