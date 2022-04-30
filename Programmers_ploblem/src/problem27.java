//자연수 뒤집어 배열로 만들기
//레벨 1 22.01.19


public class problem27 {
	
	public static int[] solution(long n) {
        int[] answer = new int[(int)(Math.log10(n)+1)]; //long n의 자리수 계산
        int i = 0;
        while(n != 0) {
        	answer[i] = (int) (n % 10);
        	n /= 10;
        	i++;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 12345;
		solution(n);

	}

}
