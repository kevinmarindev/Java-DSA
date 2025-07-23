package sortingAlgos;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("RUNNING");
        int[] sorted = sort(arr);
        System.out.println("AFTER");
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

    private static int[] sort(int[] arr){
        if(arr.length <= 1) return arr;
        //else calculate the middle so you can split the array
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] finalArr = new int[left.length + right.length];
        int i = 0, j = 0, idx = 0;

        while(i < left.length || j < right.length){
            if(i >= left.length){
                finalArr[idx] = right[j];
                j++;
            } else if(j >= right.length){
                finalArr[idx] = left[i];
                i++;
            }else if(left[i] <= right[j]){
                finalArr[idx] = left[i];
                i++;
            } else if(left[i] > right[j]){
                finalArr[idx] = right[j];
                j++;
            }
            idx++;
        }
        return finalArr;
    }


}
