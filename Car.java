public class Car {
    String brand;
    String model;
    int speed = 0;

    void accerlerate() {
        speed = speed + 5;
        if (speed > 45)
            System.out.println(brand + "is accelerating,speed is maximum ");
        else
            System.out.println(brand + "is accelerating,speed is " + speed);
    }

    void Break() {
        speed = speed - 5;
        if (speed < 0)
            System.out.println(brand + "is not moving");
        else
            System.out.println(brand + "is deccelerating,speed is " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.brand = "BMW";
        c2.brand = "porsche";
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c1.accerlerate();
        c2.accerlerate();
        c2.accerlerate();
        c2.accerlerate();
        c2.accerlerate();
        c1.Break();
        c1.Break();
        c1.Break();
        c1.Break();
        c1.Break();
        c1.Break();
        c2.Break();
        c2.Break();
        c2.Break();
    }
}