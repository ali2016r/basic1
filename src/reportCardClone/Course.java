package reportCardClone;

import java.util.LinkedList;

public class Course {

    private final LinkedList<String> dorus;
    private LinkedList<Double> nomreDorus;

    public Course() {
        dorus = new LinkedList<>();
        nomreDorus = new LinkedList<>();
    }

    public double getNomreDorus(int i) {
      return  nomreDorus.get(i);
       
    }

    public void addDars(String str) {
        dorus.add(str);
    }

    public void addNomre(double nomre) {
        nomreDorus.add(nomre);
    }

}
