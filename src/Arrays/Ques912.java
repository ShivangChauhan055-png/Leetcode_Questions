package Arrays;

import java.util.ArrayList;

public class Ques912 {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        mergeSort(arr,0,arr.length-1);
        //print sorted array
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
    // Recursive Merge Sort
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        //sort left half
        mergeSort(arr,low,mid);
        //sort right half
        mergeSort(arr,mid+1,high);
        // merge the sorted halves
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid+1;

        // temporary list
        ArrayList<Integer> list = new ArrayList<>();
        //merge two halves in a sorted order
        while (left<=mid && right<=high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        // copy remianing elements of left half
        while (left<=mid){
            list.add(arr[left]);
            left++;
        }
        while (right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
    }
}



