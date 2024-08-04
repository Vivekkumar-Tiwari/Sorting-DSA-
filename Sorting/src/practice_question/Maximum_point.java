package practice_question;



public class Maximum_point {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,7,2,1,7,1};
        int k = 4;
    }
    static int twopointer(int nums[],int k){
        int lsum=0;
        int rsum=0;
        int maxsum = 0;
        for(int i=0;i<=k-1;i++){
            lsum = lsum+nums[i];
            maxsum=lsum;
            int rindex =nums.length-1;
            for(i=k-1;k>=0;i++){
                lsum = lsum-nums[i];
                rsum = rsum+nums[rindex];
                rindex = rindex-1;
            }
            maxsum=max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}
