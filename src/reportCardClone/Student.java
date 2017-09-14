package reportCardClone;

import java.util.LinkedList;

public class Student {

    private String name;
    private int studentNumber;
    private String family;
    private String fatherName;
    private String field;
    private Course c;
    private int tedadDorus;
   // private LinkedList<String> dorus;
    //private LinkedList<Double> nomreDorus;
    private double average;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String f) {
        family = f;
    }

    public String getFamily() {
        return family;
    }

    public void setFatherName(String fn) {
        fatherName = fn;
    }

    public String getfatherName() {
        return fatherName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getTedadDorus() {
        return tedadDorus;
    }

    public void setTedadDorus(int tedadDorus) {
        this.tedadDorus = tedadDorus;
    }

//    public void addDars(String str) {
//        dorus.add(str);
//    }

//    public void addNomre(double nomre) {
//        nomreDorus.add(nomre);
//    }

    public void setStudentNumber(int sn) {
        if (sn == 0) {
            System.out.println("Student number is zero, try another student number");
            return;
        }
        studentNumber = sn;
    }

    /**
     * This function is getter of student number
     *
     * @return student number of corresponding student
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * This is Constructor of Student class
     */
//    public Student() {
//        dorus = new LinkedList<>();
//        nomreDorus = new LinkedList<>();
//    }

    /**
     * This function is getter of student number
     *
     * @return student number of corresponding student
     */
    public double calcAverage() {
        double sum = 0;
        for (int i = 0; i < tedadDorus; i++) {
            sum = sum + c.getNomreDorus().get(i);
        }
        average = sum / (double)tedadDorus;
        return average;
    }
}
