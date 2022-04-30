// 22.01.18 문자열 다루기 기본 레벨1
public class problem20 {

	public static boolean solution(String s) {
		boolean answer = true;

		if(s.length() == 4 || s.length() == 6) {

			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) < '0' || s.charAt(i) >'9') {
					answer = false;
				}
			}
		}
		else {
			answer = false;
		}

		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a234";

		solution(s);
	}

}
