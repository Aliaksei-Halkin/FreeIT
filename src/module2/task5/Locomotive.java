package module2.task5;

public class Locomotive {
    int weight;
    Engine engine;

    public Locomotive(int weight, Engine engine) {
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "weight=" + weight +
                ", engine=" + engine +
                '}';
    }
}
