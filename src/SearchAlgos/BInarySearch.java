package SearchAlgos;

public class BInarySearch {

    public static void main(String[] args){
        int arr[] = {10,20,30};
        int x = 40;
        int result = search(arr, 0, arr.length - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }


    private static int search(int[] arr, int start, int end, int target){
        if(arr.length == 0  || end >= arr.length || start > end) return -1;
//        int end = arr.length - 1, start = 0;
        int mid = start + (end - start) / 2;



        if(arr[mid] == target) return mid;

        if(arr[mid] > target){
            return search(arr, start, mid - 1, target);
        }

        return search(arr, mid + 1, end, target);

    }
}
