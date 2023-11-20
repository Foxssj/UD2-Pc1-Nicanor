public class Farmer extends Thread {
    //** Los requisitos funcionales para el granjero son:
    //    • Debe haber un hilo que simule a un granjero y plante un vegetal.
    //    • Cada granjero sabe qué cantidad de vegetales debe plantar.
    //    • Un granjero puede plantar cualquiera de los siguientes vegetales:
    //    lettuce, cabbage, onion, spinach, potato, celery, asparagus, radish, broccoli, artichoke, tomato, cucumber,
    //    eggplant, carrot y green bean.
    //    • Cada vegetal es único y tendrá un ritmo de crecimiento diferente e impredecible.
    //    El tiempo máximo de crecimiento es igual para todos.
    //    • Cuando el vegetal crezca, el granjero lo llevará al restaurante.
    //    • El restaurante tiene una capacidad de almacenamiento configurable y limitada, si el almacén está lleno,
    //    el granjero debe esperar a que se consuma algún vegetal.


    private Counter counter;
    private int farmGoal;
    private String name;
    private String[] vegetables = {"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli",
            "artichoke", "tomato", "cucumber",
            "eggplant", "carrot", "green bean"};

    public Farmer(Counter counter, int farmGoal, String name) {
        this.counter = counter;
        this.farmGoal = farmGoal;
        this.name = name;
    }




    @Override
    public void run() {

        for (int i = 0; i < farmGoal; i++) {
            System.out.println(name + " esta produciendo " + counter.veggies()
                    + "!!! Vegetales totales: " + counter.getCounter());

        }



    }

}
