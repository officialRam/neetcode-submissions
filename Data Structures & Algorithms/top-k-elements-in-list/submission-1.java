class Solution {
    public int[] topKFrequent(int[] nums, int k) {
int[] ans=new int[nums.length];
int index=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])==null){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+ 1);
            }
        }

List<Map.Entry<Integer, Integer>> list =
        new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        for (int i = 0; i < k; i++) {
    ans[index++] = list.get(i).getKey();
}
        return Arrays.copyOf(ans, index);
        
    }
}
