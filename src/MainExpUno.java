public class MainExpUno {
    public static void main(String[] args) {
        Counter counter = new Counter();

        final int product = 5;

        Farmer nicanor = new Farmer(counter, product, "Nicanor");

        Customer nauzet = new Customer(counter, product, "Nauzet");

        nicanor.start();
        nauzet.start();

        try {
            nicanor.join();
            nauzet.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
