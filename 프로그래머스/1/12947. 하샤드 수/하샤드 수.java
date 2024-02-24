class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;
        
        // 자릿수 합 구하기
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        // 하샤드 수 확인
        if(x % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}