import java.util.Scanner;

public class task4 {
    public static void Reverse(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.print(num % 10 + " ");
            Reverse(num / 10); //"функция вызова оставшегося номера"

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число для переворота: ");
        int num = sc.nextInt();
        Reverse(num);
    }
}
