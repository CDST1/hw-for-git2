import java.util.Scanner;

//возможно, я что-то не понял, но это ведь копия 4 задания?

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для переворота: ");
        int num = sc.nextInt();
        Reverse(num);
    }
    public static void Reverse(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.print(num % 10);
            Reverse(num / 10); //"функция вызова оставшегося номера"

        }
    }
}
