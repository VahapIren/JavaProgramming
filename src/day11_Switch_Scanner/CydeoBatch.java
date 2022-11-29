package day11_Switch_Scanner;

public class CydeoBatch {
    public static void main(String[] args) {
        String batchType="US ";
        String result="";
        /*if (batchType=="US Morning"){
            result="Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchType=="US Evening") {
            result="Class times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batchType=="EU") {
            result="Class times are  10-5 EST. M, T, W, Th, F.";
        }else
            result="Invalid Batch";
        System.out.println(result);*/
        boolean validBatch=batchType=="US Morning"||batchType=="US Evening"||batchType=="EU";
        if (validBatch) {
            switch (batchType) {
                case "US Morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US Evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                case "EU":
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;

            }
        }else
            result="Invalid Batch";
        System.out.println(result);
    }
}
