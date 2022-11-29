package day33_Statics;

public class CydeoStudentObject {
    public static void main(String[] args) {
        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolName();

        CydeoStudent student1=new CydeoStudent("Vahap",28,'F',125,'A',10,8);
        System.out.println(student1);

    }
}

