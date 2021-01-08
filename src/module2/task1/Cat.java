package module2.task1;

public class Cat extends Animal {
    private String breedOfCat;

    public Cat(String name, String breedOfCat) {
        super(name);
        this.breedOfCat = breedOfCat;
    }

    public Cat() {

    }

    @Override
    void run() {
        System.out.println("Cat is running, muayyyyyyyyyyyyyyy");
    }
}
