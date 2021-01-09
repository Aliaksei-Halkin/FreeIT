package module2.task5;

public class Wagon {
    double weight;
int wheels;

    public Wagon(double weight, int wheels) {
        this.weight = weight;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "weight=" + weight +
                ", wheels=" + wheels +
                '}'+"\n";
    }
}
