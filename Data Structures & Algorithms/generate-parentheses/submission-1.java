class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        helper(0,0,"",n,ans);
        return ans;
    }
    public void helper(int i , int j ,String ans , int n , List<String>temp){
        if(ans.length()==n*2){
            temp.add(ans);
            return;
        }

        if(i<n){
           helper(i + 1, j, ans + '(', n, temp);
        }
        if(j<i){
            helper(i,j+1,ans+')',n,temp);
        }
    }

}
