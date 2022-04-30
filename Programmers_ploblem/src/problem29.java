//x만큼 간격이 있는 n개의 숫자
//레벨1 22.01.19

public class problem29 {

	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long count = 0;
        for(int i = 0; i < answer.length; i++) {
        	count += x;
        	answer[i] = count;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= -4;
		int n = 2;
		solution(x, n);
		

	}

}
