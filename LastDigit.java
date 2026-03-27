import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int LastDigit = num % 10;
        System.out.println("last digit of num is" + (LastDigit));
        sc.close();
    }

}
