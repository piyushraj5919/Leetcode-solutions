class Solution {
    public int[] productExceptSelf(int[] nums) {

        int before_multiply[] = new int[nums.length];

        int before = 1;

        for(int i = 1; i < nums.length; i++){
            before =  before * nums[i-1];
            before_multiply[i] = before;
        }

        int after_multiply[] = new int[nums.length];

        int after = 1;

        for(int i = nums.length-2; i >= 0 ; i--){
            after = after * nums[i+1];
            after_multiply[i] = after;
        }

        int answer[] = new int[nums.length];
        answer[0] = after_multiply[0];
        answer[answer.length - 1] = before_multiply[nums.length - 1];

        for(int i = 1; i < nums.length-1; i ++){
            answer[i] = before_multiply[i] * after_multiply[i];
        }

        return answer;
        
    }
}