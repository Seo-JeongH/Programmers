// 2016년 문제 
//22.01.12


public class problem18 {
	public static String solution(int a, int b) {
		String answer = "";
		String Date[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"}; // 1월 1일은 금요일이므로 금요일을 0번에넣음.
		int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		int day = 0;
		
		for(int i = 0; i < a-1; i++) {
			day += month[i];
		}
		
		day += b;
		
		answer = Date[(day-1) % 7];		
		
//		System.out.printf(answer);
		
		return answer;
	}


	public static void main(String[] args) {
		solution(5,24);

	}

}
