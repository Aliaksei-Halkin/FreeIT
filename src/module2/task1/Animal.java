package module2.task1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    abstract void run();
}
