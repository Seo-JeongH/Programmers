package Hash;

//코딩테스트 연습 해시 위장.
//레벨2 2022.02.27
// 참고하면서 다시해보기.

import java.util.*;

public class Whijang_final {
	
	public static int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> a = new HashMap<>();
        
        //여기 for문이 이해가 안감. 제발 ..
        for(String arr[] : clothes) {
        	String type = arr[1];
        	System.out.println(type);   
        	a.put(type, a.getOrDefault(type, 0)+1);
        }
        

        
        Iterator<Integer> it = a.values().iterator();
        
        while(it.hasNext()) {
        	answer *= it.next().intValue() + 1;
        }
        
        System.out.println(answer-1);
        
        return answer - 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clothes[][] = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

		solution(clothes);
	}

}
