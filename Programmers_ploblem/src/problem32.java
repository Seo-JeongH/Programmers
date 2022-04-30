//짝수와 홀수
//레벨1 22.01.23

public class problem32 {

	public static String solution(int num) {
        String answer = "";
        
        if(num % 2 != 0) {
        	answer = "Odd";
        }
        else {
        	answer = "Even";
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
