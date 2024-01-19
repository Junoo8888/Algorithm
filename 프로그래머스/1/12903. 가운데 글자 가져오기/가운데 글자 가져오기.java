class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        int leng = s.length();
        int quotient = leng/2;
        int remainder = leng%2;
        
        
        if(remainder==0){
            answer = s.substring((quotient-1), (quotient+1));
        } else {
            answer = s.substring((quotient), (quotient+1));
        }
        
        
        return answer;
    }
}