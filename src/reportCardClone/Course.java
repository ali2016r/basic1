package reportCardClone;

import java.util.LinkedList;

public class Course {

    private final LinkedList<String> dorus;
    private final LinkedList<Double> nomreDorus;

    public Course() {
        dorus = new LinkedList<>();
        nomreDorus = new LinkedList<>();
    }

    public LinkedList<String> getDorus() {
        return dorus;
    }

    public LinkedList<Double> getNomreDorus() {
        return nomreDorus;
    }

    public void addDars(String str) {
        dorus.add(str);
    }

    public void addNomre(double nomre) {
        nomreDorus.add(nomre);
    }

}
