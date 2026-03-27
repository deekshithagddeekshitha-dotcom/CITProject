import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);
        sc.close();
    }
}
