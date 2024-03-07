package ParikhJainDSASheet.BasicDSA.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q6_FindKthElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(4);
        arr1.add(6);
        arr1.add(7);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(3);
        arr2.add(5);
        arr2.add(6);

        System.out.println(findKthElement(arr1, arr2, 6));
    }
    public static int findKthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i=0, j=0;
        int count = 0;
        int n = arr1.size();
        int m = arr2.size();

        while (i<n && j<m){
            if(arr1.get(i)<arr2.get(j)){
                count++;
                if(count == k){
                    return arr1.get(i);
                }
                i++;
            }else{
                count++;
                if(count==k){
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i<n){
            count++;
            if(count == k){
                return arr1.get(i);
            }
            i++;
        }

        while (j<m){
            count++;
            if(count==k){
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }
    //Using Extra Space
    public static int findKthElementWithExtraSpace(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr1.size() + arr2.size();

        int p=0, q=0;
        for(int i=0; i<len; i++){
            if(p<arr1.size() && q<arr2.size()){
                if(Objects.equals(arr1.get(p), arr2.get(q))){
                    list.add(arr1.get(p));
                    list.add(arr2.get(q));
                    p++;
                    q++;
                } else if (arr1.get(p)<arr2.get(q)) {
                    list.add(arr1.get(p));
                    p++;
                }else{
                    list.add(arr2.get(q));
                    q++;
                }
            }
        }
//        System.out.println(list);
        return list.get(k);
    }
}
