//정수 내림차순으로 배치하기
//레벨 22.01.23


import java.util.*;

public class problem34 {

	public static long solution(long n) {
        long answer = 0;
        
        ArrayList<Long> arr = new ArrayList<Long>();
        
        long count = 0;
        
        while(n > 0) {
        	count = n % 10;
        	arr.add(count);
        	n /= 10;
        }
        
        Collections.sort(arr);
        Collections.reverse(arr);
        
        String a = "";
        for(int i = 0; i < arr.size(); i++) {
        	a += Long.toString(arr.get(i));
        }
        answer = Long.parseLong(a);
        System.out.print(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(118372);

	}

}
