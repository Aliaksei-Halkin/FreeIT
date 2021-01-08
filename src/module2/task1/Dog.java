package module2.task1;

public class Dog extends Animal{
    private String breedOfDog;

    public Dog(String name, String breedOfDog) {
        super(name);
        this.breedOfDog = breedOfDog;
    }

    public Dog() {

    }

    @Override
    void run() {
        System.out.println("Dog is running and loudly barking");
    }
}
