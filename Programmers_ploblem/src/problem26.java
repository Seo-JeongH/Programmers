//약수의 개수와 덧셈 (한방컷!)
//레벨1 22.01.19

import java.util.*;

public class problem26 {
	
	public static int solution(int left, int right) {
        int answer = 0;
        
        ArrayList<Integer> arr;
        
        while(left != right + 1) {
        	arr = new ArrayList<Integer>();
        	for(int i = 1; i <= left; i++) {
        		if(left % i == 0) {
        			arr.add(i);
        		}
        	}
        	if(arr.size() % 2 == 0) {
        		answer += left;
        	}
        	else if(arr.size() % 2 == 1) {
        		answer -= left;
        	}
        	
        	left++;
        }
        
        System.out.println(answer);
        
        return answer;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 24;
		int right = 27;
		
		solution(left, right);

	}

}
