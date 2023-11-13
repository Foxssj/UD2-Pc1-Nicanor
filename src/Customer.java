public class Customer extends Thread {
    private Counter counter;
    private int fullBelly;
    private String name;
    private int personalTime = (int) (Math.random() * (3000 - 1000 + 1));

    public Customer(Counter counter, int fullBelly, String name) {
        this.counter = counter;
        this.fullBelly = fullBelly;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < fullBelly; i++) {
            try {
                counter.diner(personalTime);
                System.out.println(name + " ha comido: " + (i + 1) + " vegetales");
            } catch (InterruptedException e) {
                System.out.println("Error 404: vegetales no encontrados");
            }

        }


    }
}
