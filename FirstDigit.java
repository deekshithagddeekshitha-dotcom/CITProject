import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int FirstDigit = num / 10;
        while (num >= 10) {
            num = num / 10;
        }
        System.out.println("first digit of num is " + num);
        sc.close();
    }
}