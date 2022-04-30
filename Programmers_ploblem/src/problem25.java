//자릿수 더하기
// 레벨1, 22.01.19


public class problem25 {
	
	public static int solution(int n) {
        int answer = 0;
//        System.out.println("Hello Java");

        while(n != 0) {
        	answer += (n % 10);
        	n /= 10;
        }
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 987;
		
		solution(n);
		
	}

}
