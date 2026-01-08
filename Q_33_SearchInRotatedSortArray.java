class Solution {
   public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            // if the current mid equals target we return the middle index
            if(nums[mid]==target){
                return mid;
            }
            
            // for the case of Left sorted portion
            if(nums[mid]>=nums[l]){
                // checks if target exist in the left sorted portion
                if(nums[mid]>=target&&nums[l]<=target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            // for the Right sorted portion
            else{
                // check if target not exist inside the right sorted portion
                if(!(nums[r]>=target&&nums[mid]<=target)){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        // if no value is returned then the target is not present in the array and we return -1
        return -1;
    }
}
