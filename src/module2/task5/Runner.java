package module2.task5;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Train train;
        train = new Train(
                new Locomotive(20, new Engine(1120.5, Fuel.DIESEL)));
        for (int i = 0; i < 60; i++) {
            train.addWagon(new Wagon(10.5, 12));
        }
        System.out.println(train);


    }
}
