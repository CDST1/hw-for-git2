import java.util.Scanner;
// TODO: Вычислить сумму чисел в определенном диапазоне. Начало и конец диапазона задается параметрами.
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало диапазона: ");
        int first = sc.nextInt();
        System.out.println("Введите конец диапазона: ");
        int last = sc.nextInt();
        int sum = Calc(first, last);
        System.out.println("Сумма чисел данного диапазона равняется: " + sum);
    }
    public static int Calc (int first, int last) {
        if (first == last) {
            return 0; //!!!
        }  else {
            return first + Calc(first + 1, last); //!!!
        }
    }
}
