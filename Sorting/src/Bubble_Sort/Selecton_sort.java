package Bubble_Sort;

import java.util.Arrays;

public class Selecton_sort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void select(int arr[]) {
        for(int i=0;i<arr.length;i++){
            //find the max item in the reming array and swap with correct index.
            int last = arr.length-i-1;
            int maxIndex = mexele(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

     static int mexele(int arr[],int start, int end) {
         int max = start;
         for (int i = start; i <= end; i++) {
             if (arr[max] < arr[i]) {
                 max = i;
             }
         }
         return max;
     }

         static void swap(int[] arr, int first, int second){
             int temp = arr[first];
             arr[first] = arr[second];
             arr[second] = temp;
         }
    }

