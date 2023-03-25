public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,23,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
             int mid = start + (end - start) / 2;
             if(arr[mid]>arr[mid+1]){
                 // you are in decreasing part of array
                 // this may be the ans , but look at left
                 end = mid;
             }
             else{
                 // you are in ascending part of array
                 start = mid+1; // because we know that mid+1 element is greater than mid element
             }

        }
        return start;

    }
}
