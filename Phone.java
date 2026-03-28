public class Phone {
    String brand = "apple";
    String model = "17 pro max";

    void call() {
        System.out.println("calling from " + model);
    }

    void msg() {
        System.out.println("msg from iphone");
    }

    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        Phone p4 = new Phone();
        p1.call();
        p2.msg();
        p3.call();
        p4.msg();
    }
}
