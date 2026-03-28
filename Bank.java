import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Enter deposite amount");
        int deposite = sc.nextInt();
        balance = balance + deposite;
        System.out.println("balance:" + balance);
    }
}
