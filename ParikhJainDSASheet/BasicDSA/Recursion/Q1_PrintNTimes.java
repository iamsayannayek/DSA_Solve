package ParikhJainDSASheet.BasicDSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q1_PrintNTimes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(printNtimes(4, list));
    }

    public static List<String> printNtimes(int n, List<String> list){
        // Write your code here.
//        List<String> list = new ArrayList<>();
        if(n==1){
            list.add("Coding Ninjas");
            return list;
        }
        list.add("Coding Ninjas");
        return printNtimes(n-1, list);
    }
}
