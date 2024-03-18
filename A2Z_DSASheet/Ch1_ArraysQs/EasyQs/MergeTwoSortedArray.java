package A2Z_DSASheet.Ch1_ArraysQs.EasyQs;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        int[] b = {2, 2, 4};
        System.out.println(sortedArray(a, b));
    }

    public static List< Integer > sortedArray(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                if(list.isEmpty() || list.getLast()!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }else{
                if(list.isEmpty() || list.getLast()!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }

        while(i<a.length){
            if(list.isEmpty() || list.getLast()!=a[i]){
                list.add(a[i]);
            }
            i++;
        }

        while(j<b.length){
            if(list.isEmpty() || list.getLast()!=b[j]){
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }
}
