class Solution {
    public int[] buildArray(int[] nums) {
        int res [] = new int[nums.length];
        for(int i =0 ; i <= res.length-1 ; i++){
            res[i] = nums[nums[i]];

        }
        return res;
    }
}