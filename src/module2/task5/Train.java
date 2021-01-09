package module2.task5;

import java.util.ArrayList;
import java.util.List;

public class Train {
    List<Wagon> list;
    Locomotive locomotive;

    public Train(Locomotive locomotive) {
        this.list = new ArrayList<>();
        this.locomotive = locomotive;
    }

    void addWagon(Wagon wagon) {
        list.add(wagon);
    }

    @Override
    public String toString() {
        return "Train{" +
                "list=" + list +
                ", locomotive=" + locomotive +
                '}';
    }
}
