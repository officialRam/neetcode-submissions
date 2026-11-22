class Solution {
public:

vector<vector<int>> ans;

void backtrack(int index, vector<int>& candidates, int  target, vector<int>& temp){
    if(target==0 && temp.size()>0){
        ans.push_back(temp);
        return;
    }
    else if(target<0){
        return;
    }
    for(int i=index; i<candidates.size(); i++){
        if(i > index && candidates[i] == candidates[i-1]){
    continue;
}
if(candidates[i] > target)
                break;

        temp.push_back(candidates[i]);
        target-=candidates[i];
        backtrack(i, candidates, target, temp);
        target+=candidates[i];
        temp.pop_back();
    }


}

    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        sort(candidates.begin(), candidates.end());
        vector<int> temp;
         backtrack(0, candidates, target, temp);
         return ans;
        
    }
};
