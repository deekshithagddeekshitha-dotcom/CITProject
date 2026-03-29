import java.util.Scanner;

public class Bus {
    String brand;
    String model;

    Bus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a bus brand");
        brand = sc.nextLine();
        System.out.println("enter a bus model");
        brand = sc.nextLine();
        System.out.println(brand + model + "is created");
    }

    public static void main(String[] args) {
        Bus b1 = new Bus();
    }
}
