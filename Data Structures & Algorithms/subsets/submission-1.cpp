class Solution {
public:
set<vector<int>> final;
    void ans(vector<int>& nums, vector<int> temp, int index){
        if(index==nums.size()){
            final.insert(temp);
            return;
        }
       
            ans(nums, temp, index+1);
            temp.push_back(nums[index]);
            ans(nums, temp, index+1);

        
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<int> temp;
         ans(nums, temp, 0);
         vector<vector<int>> final2;
         for(auto i:final){
            final2.push_back(i);
         }
         return final2;
        
    }
};
