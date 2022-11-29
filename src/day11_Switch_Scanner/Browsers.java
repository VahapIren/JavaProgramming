package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName="edge";
        String result="";
        boolean validBrowser=browserName=="chrome"||browserName=="firefox"||browserName=="opera"||browserName=="safari"||browserName=="edge";
        if(validBrowser){
            if(browserName=="chrome"){
                result=(browserName+" browser is selected");
            } else if (browserName=="firefox") {
                result=(browserName+" browser is selected");
            } else if (browserName=="safari") {
                result=(browserName+" browser is selected");
            } else if (browserName=="opera") {
                result=(browserName+" browser is selected");
            }else{
                result=(browserName+" browser is selected");
            }

        }else
            result="Invalid Browser Name";
        System.out.println(result);
    }
}
