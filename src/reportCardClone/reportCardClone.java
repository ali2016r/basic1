
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
        for(int i=0; i<tedadStd ; i++){
            
            System.out.println("شماره دانشجویی دانشجو:"+ (i+1));
            std.studentNumber = sc.nextInt();
            studentNumber[i] = std.studentNumber;
            System.out.println("نام دانشجو:"+ (i+1));
            std.name = sc.next();
            name[i] = std.name;
            System.out.println("نام خانوادگی:"+ (i+1));
            std.family = sc.next();
            family[i]=std.family;
            System.out.println("نام پدر"+(i+1));
            std.fatherName=sc.next();
            fatherName[i]=std.fatherName;
            System.out.println("رشته دانشجو:"+ (i+1));
            std.field = sc.next();
            field[i]=std.field;
            System.out.println("تعداد دروس:"+ (i+1));
            std.tedadDorus = sc.nextInt();
            tedadDorus[i]=std.tedadDorus;
        }
        
        
        
        System.out.println("ثبت دروس دانشجو");
        String[] dars = new String[tedadStd];
        double[] nomre;
        double avg;
        double[] average =new double[tedadStd];
        for(int j=0;j<tedadStd ;j++){
            nomre= new double[tedadDorus[j]];
            System.out.println("دانشجو"+(j+1)+"به شماره دانشجویی"+studentNumber[j]);
            for (int i=0;i<tedadDorus[j];i++){
                System.out.println("نام درس");
                dars[i] = sc.next();
                System.out.println("نمره");
                nomre[i]= sc.nextDouble();
            }
            average[j] = calcAverage(nomre);
            System.out.println(average[j]);
        }
              
            System.out.println("شماره دانشجویی"+ "\t" +"نام دانشجو"+ "\t" +"نام خانوادگی"+ "\t" +"نام پدر"+ "\t" +"رشته تحصیلی"+ "\t" +"معدل");
            for (int j=0;j<tedadStd; j++){ 
            System.out.println(studentNumber[j]+ "\t" +name[j]+ "\t" +family[j] + "\t" + fatherName[j] + "\t" + field[j] + "\t" + average[j]);
            }
    }

    /**
     *
     * @param nomr
     * @return
     */
    public static double calcAverage(double[] nomr) {
        double sum = 0;
        for (int i=0; i < nomr.length; i++) {
        sum = sum + nomr[i];
    }
        double result = sum / (double)nomr.length;
        return result;
    }
}
