//제일 작은 수 제거하기
//레벨1 22.01.19
import java.util.*;

public class problem30 {
	public int[] solution(int[] arr) {
		int[] answer = null;

		if(arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		else {
			ArrayList<Integer> save = new ArrayList<Integer>();

			for(int i = 0; i < arr.length; i++) {
				save.add(arr[i]);
			} // 배열을 save에 다 저장

			//save의 최솟값 알기
			int check = Collections.min(save);
			int index = save.indexOf(check);


			save.remove(index);

			answer = new int[arr.length -1];

			for(int i = 0; i < save.size(); i++) {
				answer[i] = save.get(i);
			}       

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
