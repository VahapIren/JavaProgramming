package day35_Encapsulation;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance<0)
            return;
        this.balance = balance;
    }

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double deposit){
        balance+=deposit;
        setBalance(balance);
    }
    public void withdraw(double withdraw){
        if (withdraw>balance) {
            System.out.println("your balance is " + balance + " you cant withdraw " + withdraw);
            return;
        }
        balance-=withdraw;
        setBalance(balance);
    }
    public void checkBalance(){
        System.out.println(balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
