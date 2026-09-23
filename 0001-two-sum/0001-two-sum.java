class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>list =new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        
        
    }
}