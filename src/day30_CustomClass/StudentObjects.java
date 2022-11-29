package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

     Student student1=new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');
        System.out.println(student1);

        Student student2=new Student();
        student2.setInfo("Hulya",'F',26,2123,'B');

        Student student3=new Student();
        student3.setInfo("Elminur",'F',26,2215,'A');

        Student student4=new Student();
        student4.setInfo("Ali",'M',28,5511,'B');

        Student student5=new Student();
        student5.setInfo("Mert",'M',26,2552,'C');


        Student[] students={student1,student2,student3,student4,student5};

        for (Student each : students) {
            System.out.println(each);
        }
        System.out.println("----------------------------------------");

        ArrayList<Student> earlyBirds=new ArrayList<>();   //grade'A'
        ArrayList<Student> angryBirds=new ArrayList<>();
        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        ArrayList<Student> earlyBirds1=new ArrayList<>(Arrays.asList(students));   //grade'A'
        ArrayList<Student> angryBirds1=new ArrayList<>(Arrays.asList(students));
        earlyBirds1.removeIf(p->p.grade!='A');
        angryBirds1.removeIf(p->p.grade=='A');
        System.out.println("angryBirds1 = " + angryBirds1);
        System.out.println("earlyBirds1 = " + earlyBirds1);


    }
}
