class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            var temp=map.get(nums[i]);
            if(temp!=null){
                return new int[]{temp, i};
            }else{
                map.put(target-nums[i], i);
            }
        }
        return new int[]{-1, -1};

    }
}
