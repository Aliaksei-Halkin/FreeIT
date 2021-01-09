package module2.task5;

public class Engine {
    double power;
    Fuel fuel;

    public Engine(double power, Fuel fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    public Engine() {

    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", fuel=" + fuel +
                '}';
    }
}
