import java.util.*;

class Solution {
    public String[] solution(String[] record) {
	        String[] answer = {};
	        
	        Map<String, String> idMap= new HashMap<>();
	        List<String> chatLog = new ArrayList<>();
	    
	        for(String str : record) {
	        	StringTokenizer st = new StringTokenizer(str);
	        	String cmd = st.nextToken();
	        	if(cmd.equals("Enter") || cmd.equals("Change")) {
	        		String id = st.nextToken();
	        		String name = st.nextToken();
	        		
	        		idMap.put(id, name);
	        	}        	
	        }
	        
	        for(String str : record) {
	        	StringTokenizer st = new StringTokenizer(str);
	        	String cmd = st.nextToken();
	        	if(cmd.equals("Enter")) {
	        		String id = st.nextToken();
	        		String name = idMap.get(id);
	        		chatLog.add(name + "님이 들어왔습니다.");
	        	}else if(cmd.equals("Leave")) {
	        		String id = st.nextToken();
	        		String name = idMap.get(id);
	        		chatLog.add(name + "님이 나갔습니다.");
	        	}
	        }
	        answer = new String[chatLog.size()];
	        
	        chatLog.toArray(answer);
	        
	        return answer;
    }
}