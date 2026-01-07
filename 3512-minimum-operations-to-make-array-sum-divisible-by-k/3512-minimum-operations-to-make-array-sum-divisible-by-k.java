class Solution {
    public int minOperations(int[] nums, int k) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

        }
        long remainder=sum%k;
        if (remainder==0){
            return 0;
        }
        else{
            return (int)remainder;
        }
        
    }
}