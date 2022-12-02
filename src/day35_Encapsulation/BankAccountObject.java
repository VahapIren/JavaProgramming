package day35_Encapsulation;

public class BankAccountObject {
    public static void main(String[] args) {

        BankAccount account1=new BankAccount("vahap",123445678,10000);
        System.out.println(account1);
        System.out.println("-----------------");

        account1.deposit(5000);
        System.out.println(account1);
        System.out.println("-----------------");

        account1.withdraw(10000);
        System.out.println(account1);

        account1.withdraw(7000);
        System.out.println(account1);


    }
}
