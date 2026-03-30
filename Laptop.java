public class Laptop {
    void browse() {
        System.out.println("Browsing the internet...");
    }

    void playGame() {
        System.out.println("Playing a game...");
    }

    void shutdown() {
        System.out.println("Shutting down the laptop...");
    }

    void install(String software) {
        System.out.println("Installing " + software + "...");
    }
}

class Main {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.browse();
        L1.playGame();
        L1.install("Chrome");
        L1.shutdown();
    }
}
