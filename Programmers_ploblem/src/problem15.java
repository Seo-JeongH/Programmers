//프로그래머스 Level.1
// 같은 숫자는 싫어   22.01.12

import java.util.*;

public class problem15 {
	public static int[] solution(int []arr) {
		int[] answer = {};
        int count = 10; // 10이상의 숫자는 안나오니까 일단 10을 넣어둠 (비교용)
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(count != arr[i]) {
        		al.add(arr[i]);
        	}
            count = arr[i];
        }
        
        answer = new int[al.size()];
        
        for(int i = 0; i <al.size(); i++) {
        	answer[i] = al.get(i);
        }

        return answer;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,3,3,0,1,1};
		
		solution(arr);

	}

}
