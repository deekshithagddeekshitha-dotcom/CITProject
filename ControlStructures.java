import java.util.Scanner;

public class ControlStructures {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the age");
        // int age=sc.nextInt();
        // if(age>=18)
        // System.out.println("Elegible for voting");
        //sc.close();
        // if else largest number
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the first number ");
        int a= sc.nextInt();
        System.out.println("Enter the second number ");
        int b= sc.nextInt();
        if(a>b)
            System.err.println("first number is larger");
        else
              System.err.println("second number is larger");
    }
}
