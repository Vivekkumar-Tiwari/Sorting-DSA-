package cyclic_sort;

import java.util.ArrayList;
import java.util.List;

class Disappernumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //just find missing number
        List<Integer> ans = new ArrayList<>();
        for(int index = 0;index<nums.length;index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }


     void swap(int arr[], int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}