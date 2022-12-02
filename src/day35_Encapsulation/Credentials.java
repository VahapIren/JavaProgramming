package day35_Encapsulation;

public class Credentials {

    private String userName,password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassword(password))
            return;
        this.password=password;
    }

    public boolean isStrongPassword(String password){

        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false;
        boolean r3=false;
        boolean r4=false;
        char[] result=password.toCharArray();
        for (char each : result) {
            if (Character.isLetter(each))
                r2=true;
            else if (Character.isDigit(each)) {
                r3=true;
            } else  {
                r4=true;
            }
        }
        boolean isStrong=r1&r2&r3&r4;
        return isStrong;
    }

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String toString() {

        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
