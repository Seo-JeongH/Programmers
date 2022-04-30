//level.1 문자열 내 마음대로 정렬하기 22.01.12

import java.util.*;

public class problem17 {

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};

		ArrayList<String> arr = new ArrayList<String>();

		for(int i = 0 ; i < strings.length; i++) {
			arr.add(strings[i].charAt(n) +strings[i]);
		}  // ex. n = 1 이면 두번째 글지를 맨앞에 붙여준다. 
		// == sun -> usun으로

		Collections.sort(arr); // arr 정렬

		answer = new String[arr.size()];  // answer 배열 생성.

		for(int i = 0; i < arr.size(); i ++) {
			answer[i] = arr.get(i).substring(1);  //arr의 i번 인덱스에서 1번째 문자부터get함. 자르는 기능.
		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strings[] = {"sun", "bed", "car"};

		solution(strings, 1);

	}

}
