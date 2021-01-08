package module2.task1;

public class Runner {
    public static void main(String[] args) {
        Lion lion= new Lion("BigLion",150);
        Dog dog= new Dog("Maks","kolly");
        Cat cat =new Cat("Mashka","Siamsky" ){
            @Override
            void run() {
                System.out.println("Cat don't run");
            }
        };
        lion.run();
        lion.hunting();
        dog.run();
        cat.run();

    }
}
