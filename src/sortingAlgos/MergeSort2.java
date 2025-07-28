package sortingAlgos;

import Tree.Main;

import java.util.Arrays;

final class MergeSort2 {

    public static void main(String[] args){
        int[] startingArr = {5, 2, 9, 1, 5, 6};
        int[] sorted = sort(startingArr);
        System.out.println("AFTER");
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

    public static int[] sort(int[] arr){
        if(arr.length <= 1) return arr;
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] finalArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, idx = 0;

        while(i < arr1.length || j < arr2.length){
            if(i >= arr1.length){
                finalArr[idx] = arr2[j];
                j++;
            } else if(j >= arr2.length){
                finalArr[idx] = arr1[i];
                i++;
            }else if(arr1[i] <= arr2[j]){
                finalArr[idx] = arr1[i];
                i++;
            }else if(arr1[i] > arr2[j]){
                finalArr[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        return finalArr;
    }

}
