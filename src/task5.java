import java.util.Scanner;

//    TODO: Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками
public class task5 {
    public static void output(int num) {

        if (num < 10) {
            System.out.println(num);
        } else {
            output(num / 10);
            System.out.println(num % 10);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        System.out.println("Ух ты! Вы правда ввели число ? 0_0");
        output(num); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
}
