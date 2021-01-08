package module2.task1;

public class Lion extends Animal implements Hunting {
    private int weight;

    public Lion(String name, int weight) {
        super();
        this.weight = weight;
    }

    public Lion() {

    }

    @Override
    void run() {
        System.out.println("Lion is running and growling");
    }

    @Override
    public void hunting() {
        System.out.println("Lion hunting on other animal");
    }
}
