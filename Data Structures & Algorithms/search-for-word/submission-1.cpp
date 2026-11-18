class Solution {
public:
bool check(int i, int j, vector<vector<char>>& board, string word){
     if(word.size()==0){
        return true;
    }
    if(i<0 || j<0 || i>board.size()-1 || j>board[0].size()-1){
        return false;
    }

   
    if(board[i][j]==word[0]){
         cout<<board[0].size()<<endl;
         char temp=board[i][j];
         board[i][j]='#';
        bool ch1=check(i, j+1, board, word.substr(1));
                    bool ch2=check(i+1, j, board, word.substr(1));
                   
                    bool ch3=check(i-1, j, board, word.substr(1));
                    bool ch4=check(i, j-1, board, word.substr(1));
                    board[i][j]=temp;
                    
                        return ch1 || ch2 || ch3 || ch4;
                    
    }
    return false;
}
    bool exist(vector<vector<char>>& board, string word) {
        cout<<board[0].size()<<board.size();
        for(int i=0; i<board.size(); i++){
            for(int j=0; j<board[0].size(); j++){
                    bool ch1=check(i, j, board, word);
                    if(ch1){
                        return true;
                    }
                
            }
        }
        return false;
        
    }
};
