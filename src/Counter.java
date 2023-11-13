import java.util.Arrays;

public class Counter {
    private int counter = 0;
    private final int WAREHOUSE = 20;

    private String[] vegetables = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli",
            "artichoke", "tomato", "cucumber",
            "eggplant", "carrot", "green bean"};


    public synchronized void diner(int personalTimeEating) throws InterruptedException {
        if (this.counter > 0) {
            counter--;
            Thread.sleep(personalTimeEating);
        } else {
            wait();
        }
    }


        public synchronized String veggies() {
            while (counter <= WAREHOUSE) {
                int randomVeggie = (int) (Math.random() * vegetables.length);
                counter++;
                if (counter == counter) {
                    return (vegetables[randomVeggie]);
                }
                if (counter == WAREHOUSE) {
                    notifyAll();
                }


            }
            return "";
        }





    public int getCounter() {
    return counter;
    }

}
