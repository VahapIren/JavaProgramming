package day20_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Deneme6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {0,1,2,54,0,5,0,5};
        int a = inhabitants[1] + inhabitants[2] + inhabitants[3] + inhabitants[4] + inhabitants[5] + inhabitants[6] + inhabitants[7] + inhabitants[0];
        int day=0;

        while (a!=0){

            for (int i=0;i<=7;i++) {
                if(inhabitants[i]==0){
                    if (i==0)inhabitants[1]/=2;
                    else if (i==7)inhabitants[6]/=2;
                    else {inhabitants[i-1]/=2; inhabitants[i+1]/=2;

                    }
                    System.out.println(day+" "+Arrays.toString(inhabitants));
                    day++;
                }}
        }
    }

}
