class Solution {
    public int missingNumber(int[] nums) {
        
        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return nums.length;

        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ nums.length;
    }
}