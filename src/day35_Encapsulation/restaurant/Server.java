package day35_Encapsulation.restaurant;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID<=0)
            return;
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public String toString() {
        String result="";
        if (fullTime)
            result="full-time";
        else
            result="part-time";
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime status =" + result +
                '}';
    }

    public void takeOrder(){
        System.out.println(name+" is taking an order");
    }
    public void cleanTable(){
        System.out.println(name+" is cleaning the table");
    }

}
