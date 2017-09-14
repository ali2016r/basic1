package reportCardClone;

import java.util.Scanner;

public class reportCardClone {

    public static void main(String[] args) {
        Student[] students = readStudents();
        System.out.println("شماره دانشجویی" + "\t" + "نام دانشجو" + "\t" + "نام خانوادگی" + "\t" + "نام پدر" + "\t" + "رشته تحصیلی" + "\t" + "معدل");
        for (Student student : students) {
            System.out.println(student.getStudentNumber() + "\t" + student.getName() + "\t" + student.getFamily() + "\t" + student.getfatherName() + "\t" + student.getField() + "\t" + student.calcAverage());
        }
    }

    public static Student[] readStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ثبت دانشجو:");
        System.out.println("تعداد دانشجویان؟");
        int tedadStd = sc.nextInt();
        Student[] students = new Student[tedadStd];
        for (int i = 0; i < tedadStd; i++) {
            System.out.println("شماره دانشجویی دانشجو:" + (i + 1));
            students[i] = new Student();
            students[i].setStudentNumber(sc.nextInt());
            System.out.println("نام دانشجو:" + (i + 1));
            students[i].setName(sc.next());
            System.out.println("نام خانوادگی:" + (i + 1));
            students[i].setFamily(sc.next());
            System.out.println("نام پدر" + (i + 1));
            students[i].setFatherName(sc.next());
            System.out.println("رشته دانشجو:" + (i + 1));
            students[i].setField(sc.next());
            System.out.println("تعداد دروس:" + (i + 1));
            students[i].setTedadDorus(sc.nextInt());
            readDorus(students[i]);
        }
        return students;
    }

    public static void readDorus(Student s) {
        Scanner sc = new Scanner(System.in);
        int n = s.getTedadDorus();
        for (int i = 0; i < n; i++) {
            System.out.println("name dars?");
            s.addDars(sc.next());
            System.out.println("nomre?");
            s.addNomre(sc.nextDouble());
        }
    }
}
