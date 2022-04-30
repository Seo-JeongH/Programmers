//서울에서 김서방 찾기 ==은 안되고 equals메소드 써야댐 씨발
class problem12 {
    public static String solution(String[] seoul) {
        String answer = "";
        String Kim = "Kim";
        
        for(int i = 0 ; i < seoul.length; i++) {
        	if(seoul[i].equals(Kim)) {
        		answer = "김서방은 " + i + "에 있다";
        	}
        }
        System.out.println(answer);
        return answer;
    }
    
    public static void main(String arg[]) {
    	String seoul[] = {"Jane", "Kim"};
    	solution(seoul);
    }
}