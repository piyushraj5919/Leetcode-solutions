class Solution {
    int n;
    public int findKthLargest(int[] nums, int k) {

        n = nums.length;

        for(int j = nums.length/2 -1; j >= 0 ; j--){
            max_heapify(nums,j);

        }

        for(int i = 1; i <= k-1;i++){

            int temp = nums[0];
            nums[0] = nums[n - 1];
            nums[n-1] = temp;

            n = n - 1;

            max_heapify(nums,0);

        }

        return nums[0];
        
    }
    void max_heapify(int[]nums,int i){
    
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int largest = i;

            if(left < n && nums[left] > nums[largest]){
                largest = left;
            }
            if(right < n && nums[right] > nums[largest]){
                largest = right;
            }

            if(largest != i){
                int temp = nums[i];
                nums[i] = nums[largest];
                nums[largest] = temp;

                max_heapify(nums, largest);
            }
        }
}