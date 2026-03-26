public class BetwiseOperator {
    public static void main(String[] args) {
        int a = 4;//1001
        int b=2;//0010
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("NOT: " + (~b));
    }

}