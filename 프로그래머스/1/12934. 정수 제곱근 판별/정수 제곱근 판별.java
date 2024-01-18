class Solution {
    public long solution(long n) {
        long answer = 0;
        
        if(n <= 50000000000000L){
            for(long i = 1; i<=n; i++){
                if((i*i)==n){
                    return ((i+1)*(i+1));
                }
            }
        }
        
        return -1;
    }
}