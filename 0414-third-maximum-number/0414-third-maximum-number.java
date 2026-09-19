class Solution {
    public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max1 || nums[i]==max2 || nums[i]==max3){
                continue;
            }
            if(nums[i]>max1){
                long temp1=max1;
                max1=nums[i];
                long temp2=max2;
                max2=temp1;
                max3=temp2 ;
                }

                else if(nums[i]>=max2){
                    long temp1=max2;
                     max2=nums[i];
                     max3=temp1;
                }

                else if(nums[i]>=max3){
                    max3=nums[i];
                }                
        }
        if(max3==Long.MIN_VALUE){
            return (int)max1;
        }
        return (int)max3;
        
    }
}