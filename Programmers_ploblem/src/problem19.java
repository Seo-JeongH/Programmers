// 나누어 떨어지는 숫자 배열 22.01.12

import java.util.*;

public class problem19 {

	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		al.add(arr[i]);
        	}
//        	else {
//        		al.add(-1);
//        		continue;
//        	}
        }
        if(al.size() == 0) {
        	al.add(-1);
        }
        
        Collections.sort(al);
        
        answer = new int[al.size()];
        
        for(int i = 0; i <al.size(); i++) {
        	answer[i] = al.get(i);
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int arr[] = {};
		
		

	}

}
