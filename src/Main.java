public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        final int FARM_GOAL = 10;

        Farmer paco = new Farmer(counter, FARM_GOAL, "Paco");
        Farmer ramon = new Farmer(counter, FARM_GOAL, "Ramon");

        Customer faustino = new Customer(counter, 5, "Faustino");
        Customer mrGentleman = new Customer(counter, 10, "Mr gentleman");
        Customer loquendo = new Customer(counter, 5, "Loquendo");

        paco.start();
        ramon.start();

        try {
            paco.join();
            ramon.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }


        faustino.start();
        mrGentleman.start();
        loquendo.start();


        try {
            faustino.join();
            mrGentleman.join();
            loquendo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        System.out.println("Los Comensales han terminado de comer");


    }
}