class Solution {
public:
    int reverse(int x) {
        bool negative=false;
        if(x<0){
            negative=true;
        }
        vector<int> temp;
        while(x!=0){
            int a=x%10;
            temp.push_back(a);
            x=x/10;
        }
        long long xx=temp[0];
        for(int i=1; i<temp.size(); i++){
            xx=xx*10;
            xx=xx+temp[i];
            if(xx>INT_MAX || xx<INT_MIN){
                return 0;
            }
        }
        
        return xx;
    }
};
