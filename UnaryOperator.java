public class UnaryOperator {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Original: +x");
        // x++
        System.out.println("Post increment:" + (x++));// 5
        System.out.println("After increment:" + x);// 6
        System.out.println("Pre increment:" + (++x));
        System.out.println("After increment:" + x);
        System.out.println("Pre decrement:" + (--x));
        System.out.println("After decrement:" + x);
        System.out.println("Post decrement:" + (x--));
        System.out.println("After decrement:" + x);

    }

}
