
package reportCardClone;

import java.util.Scanner;

public class reportCardClone {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ثبت دانشجو:");
        Student std = new Student();
        System.out.println("تعداد دانشجویان؟");
        int tedadStd = sc.nextInt();
        int[] studentNumber = new int[tedadStd];
        String[] name = new String[tedadStd];
        String[] family = new String[tedadStd];
        String[] fatherName = new String[tedadStd];
        String[] field = new String[tedadStd];
        int[] tedadDorus = new int[tedadStd];
        
        //String[] listStudent = new String[tedadStd];
        for(int i=1; i<=tedadStd ; i++){
            System.out.println("شماره دانشجویی دانشجو:"+i);
            std.studentNumber = sc.nextInt();
            studentNumber[i] = std.studentNumber;
            System.out.println("نام دانشجو:"+i);
            std.name = sc.next();
            name[i] = std.name;
            System.out.println("نام خانوادگی:"+i);
            std.family = sc.next();
            family[i]=std.family;
            System.out.println("رشته دانشجو:"+i);
            std.field = sc.next();
            field[i]=std.field;
            System.out.println("تعداد دروس:"+i);
            std.tedadDorus = sc.nextInt();
            tedadDorus[i]=std.tedadDorus;
        }
        //for(int j=0;j<tedadStd ;j++){
            
            
        //}
        //vared kardan dorus
      
    }
    
}
