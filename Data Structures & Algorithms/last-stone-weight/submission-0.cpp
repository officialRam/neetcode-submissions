class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> pq;
        int n=stones.size();
        if(n==1){
            return stones[0];
        }
        for(int i=0; i<n; i++){
            pq.push(stones[i]);
        }
        while(pq.size()>1){
            int a=pq.top();
            pq.pop();
            int b=pq.top();
            pq.pop();
            if(a-b>0){
                pq.push(a-b);
            }
        }
        if(pq.size()==1){
            return pq.top();
        }
        return 0;

    }
};
