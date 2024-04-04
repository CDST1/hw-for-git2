import java.util.Scanner;

public class task1 {
    public static void recursion(int numA, int numB) {
        if (numA < numB) {
            System.out.println(numA);
            recursion(numA + 1, numB);
        } else if (numA > numB) {
            System.out.println(numA);
            recursion(numA - 1, numB);
        } else {
            System.out.println(numA);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int numA = sc.nextInt();

        System.out.println("Enter num2: ");
        int numB = sc.nextInt();
        recursion(numA, numB);
    }
}
