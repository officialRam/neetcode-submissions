class Solution {
public:
    set<vector<int>> ans2(vector<int> nums, int i){
        if(i<0){
            set<vector<int>> ans;
            vector<int> temp;
            ans.insert(temp);
            return ans;
        }
        set<vector<int>> temp=ans2(nums, i-1);
        set<vector<int>> ans;
        for(auto j:temp){
            vector<int> arr=j;
            ans.insert(arr);
            arr.push_back(nums[i]);
            ans.insert(arr);
        }
        return ans;
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());

        for(auto i:ans2(nums, nums.size()-1)){
            ans.push_back(i);
        }
        return ans;
        
    }
};
