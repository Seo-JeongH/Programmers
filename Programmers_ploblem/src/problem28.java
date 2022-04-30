//정수 제곱근 판별
//레벨 1 22.01.19
public class problem28 {
	
	public static long solution(long n) {
        long answer = 0;
        
        answer = (long) Math.sqrt(n);
        
        if(answer * answer == n) {
        	answer = (answer + 1) * (answer + 1);
        }
        else {
        	answer = -1;
        }
        
//        System.out.print(answer);
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 3;
		solution(n);
	}

}
