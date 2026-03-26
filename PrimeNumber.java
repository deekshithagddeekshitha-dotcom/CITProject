import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag = true;
        if (n <= 1)
            flag = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println(n + "is a prime Prime number ");
        else
            System.out.println(n + "is not a prime number");
        sc.close();
    }
}
