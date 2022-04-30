//3진법 뒤집기 레벨1
//2022.02.22


public class problem44 {
	
	public static int solution(int n) {
        int answer = 0;
        
        String a = "";
        
        while(n != 0) {
        	a += n % 3;
        	n /= 3;
        }
        
        answer = Integer.parseInt(a, 3);
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(45);
	}

}
