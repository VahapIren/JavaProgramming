package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age,batchNumber,groupNumber;

    public static String schoolName;
    public String fieldOfStudy;
    public static String progLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {
        schoolName="CYDEO";
        progLanguage="JAVA";
        secretCode="Wooden Spoon";
    }

    public static void printProgLanguage(){
        System.out.println("language is "+progLanguage);
    }

    public static void printSecretCode(){
        System.out.println("secret coce is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+" ia attending class.");
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public static void printSchooName(){
        System.out.println("your school name is "+schoolName);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", field of study=" + fieldOfStudy +
                ", School Name=" + schoolName +
                ", Prog Language=" + progLanguage +
                '}';
    }
}
