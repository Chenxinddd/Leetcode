class Solution {
    public int firstMissingPositive(int[] nums) {
        int test = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                test = 1;
            }
            if(nums[i] < 1 || nums[i] > nums.length){
                nums[i] = 0;
            }
        }
    // test if the it has 1
    if(test == 0){
        return 1;
    }
    

    for(int i = 0; i < nums.length; i++){
        //get abs value
        int temp = Math.abs(nums[i]);
        if(temp == 0){
            continue;
        }
        
        if(nums[temp - 1] == 0){
            nums[temp -1] = -1;
        }else if(nums[temp - 1] < 0){
            continue;
        }
        else{
            nums[temp -1] = -nums[temp -1];
        }
        
       
    }

    for(int i = 0; i < nums.length; i++){
       if(nums[i] >= 0){
           return i+1;
       }
    }
    return nums.length + 1;
}
}