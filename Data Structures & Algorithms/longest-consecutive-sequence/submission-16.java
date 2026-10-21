class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], 1);
        }
        int maxAns=0;
        for(Integer each:map.keySet()){
            if (!map.containsKey(each - 1)) {
            int ans=1;
            int temp2=each+1;
            while(map.containsKey(temp2)){
                ans++;
                temp2=temp2+1;
            }
            maxAns=Math.max(ans, maxAns);
            }

        }
        return maxAns;
        
        
    }
}
