import java.util.Arrays;
//배열이 두개 주워진다 participant가 참가선수 completion이 완주선수 이 두 배열을 참조해서 완주를 하지 못한 선수를 출력해라.
// 아직 미완성

class problem7_1 {
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant); 
		Arrays.sort(completion);
		int i;
		for(i = 0; i < completion.length; i++) { 
			if(!participant[i].equals(completion[i])) {
				return participant[i]; 
			}
		}
		System.out.print(participant[i]);
		return participant[i];


	}

	public static void main(String arg[]) {
		String participant[] = {"leo","kiki","eden"};  // completion은 participant보다 크기가 -1이다
		String completion[] = {"eden", "kiki"};

		solution(participant,completion);
	}
}
