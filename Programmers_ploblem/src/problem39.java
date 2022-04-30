//이상한 문자 만들기
//레벨1 22.01.24
//32차이

public class problem39 {

	public static String solution(String s) {
		String answer = "";
		String arr[] = s.split("");

		int count = 0;

		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == " ") {
				count = 0;
			}
			else {
				if(count % 2 == 0) { // 짝수번째 인덱스면 대문자.
					arr[i] = arr[i].toUpperCase();
					count++;
				}
				else {  //홀수번째 인덱스면 소문자
					arr[i] = arr[i].toLowerCase();
					count++;
				}
			}

			answer += arr[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "try hello world";
		solution(a);
	}

}
