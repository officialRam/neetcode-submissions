class Solution {
public:
    vector<vector<int>> ans(int index, int n, vector<int>& nums){
        if(index==n-1){
            return {{nums[index]}};
        }
        vector<vector<int>> temp=ans(index+1, n, nums);
        set<vector<int>> unique;
        for(int i=0; i<temp.size(); i++){
            
            for(int j=0; j<=temp[i].size(); j++){
                vector<int> curr=temp[i];
                curr.insert(curr.begin() + j, nums[index]);
                unique.insert(curr);
            }
           
            cout<<endl;
            
        }
        vector<vector<int>> final;
        for(auto k:unique){
            final.push_back(k);
        }
        return final;
    }
    vector<vector<int>> permute(vector<int>& nums) {
        int n=nums.size();
        return ans(0, n, nums);
        
    }
};
