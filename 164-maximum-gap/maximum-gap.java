class Solution {
    public int maximumGap(int[] nums) {

        Arrays.sort(nums);

        int diff = 0;

        if(nums.length < 2){
            return 0;
        }

        if(nums.length == 2){
            return (nums[1] - nums[0]);
        }

        for(int i = 0; i < nums.length-1; i++){
            
            if(nums[i + 1] - nums[i] > diff){
                diff = nums[i + 1] - nums[i];
            }
        }
        return diff;
        
    }
}