//콜라츠 추측
//레벨1 22.01.24

public class problem38 {

	public static int solution(long num) {
		int answer = 0;

		while(num != 1) {
			if(num % 2 == 0) {
				num /= 2;
			}
			else {
				num = num * 3 + 1;
			}
			answer++;
			if(answer == 500) {
				answer = -1;
				break;
			}
		}
//		
//		if(answer >= 500)
//			answer = -1;

		System.out.print(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		int a = Integer.parseInt(s);
		solution(626331);
	}

}
