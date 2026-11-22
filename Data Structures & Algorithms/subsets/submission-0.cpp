class Solution {
public:
set<vector<int>> final;
    void ans(vector<int>& nums, vector<int> temp, int index){
        if(index==nums.size()){
            final.insert(temp);
            return;
        }
        for(int i=index; i<nums.size(); i++){
            ans(nums, temp, i+1);
            temp.push_back(nums[i]);
            ans(nums, temp, i+1);

        }
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
