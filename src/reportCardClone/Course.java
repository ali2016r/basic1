/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportCardClone;

import java.util.LinkedList;

/**
 *
 * @author Ali
 */
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
