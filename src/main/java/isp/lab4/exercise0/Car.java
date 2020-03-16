package isp.lab4.exercise0;


public class Car {

    /**
     * Relatia de compozitie. Atentie la modul de initalizare a acestui atribut in constructorul de mai jos.
     */
    private CarAlarm carAlarm;

    /**
     * Relatia de agregare.
     */
    private Engine engine;

    private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
        this.carAlarm = new CarAlarm();
    }

    public void startCar(){
        System.out.println("Starting car...");
        if(engine==null) {
            System.out.println("Car cannot be started. No engine present.");
        }
        else{
            carAlarm.setActive(false);
            engine.startEngine();
        }
    }

    public void stopCar(){
        System.out.println("Stopping car...");
        engine.stopEngine();
        carAlarm.setActive(false);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carAlarm=" + carAlarm +
                ", engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
