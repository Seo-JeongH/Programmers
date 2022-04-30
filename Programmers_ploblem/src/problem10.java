//가운데 글자만 출력 홀수면 1개 짝수면 2개
class Solution {
	public static String solution(String s) {
		String answer = "";

		String arr[] = new String[s.length()];

		arr = s.split("");

		if(s.length() % 2 == 1) {
			answer = arr[s.length() / 2];
		}
		else {
			answer = arr[s.length() / 2 - 1];
			answer = answer + arr[s.length() / 2];
		}        

		return answer;
	}

	public static void main(String arg[]) {
		String s = "abcde";
		//		String s = "qwer";
		solution(s);
	}
}
