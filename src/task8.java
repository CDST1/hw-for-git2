import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое будет возводиться в степень: ");
        int num = sc.nextInt();
        System.out.println("Введите степень, в которую будем возводить: ");
        int power = sc.nextInt();
        int result = PowerOfNum(num, power);
        System.out.println(result);
    }
    public static int PowerOfNum (int num,int power) {
        if (power == 0) {
            return 1;
        } else {
            return num * PowerOfNum(num, power - 1);
        }

    }
}
