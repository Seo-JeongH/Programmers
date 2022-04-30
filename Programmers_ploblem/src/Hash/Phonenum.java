//레벨2 고득점Kit 해쉬
//전화번호 문제
//2022.02.19 문제.

package Hash;

import java.util.Map;
import java.util.HashMap;

public class Phonenum {
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        //해시에 폰북배열 삽입
        for(int i = 0; i < phone_book.length; i++) {
        	map.put(phone_book[i], i);
        }
        
        // 해시에 포함된 키들중에서 폰북배열에서 첫번째부터 j번째까지 포함하고있나 확인.
        for(int i = 0; i < phone_book.length; i++) {
        	for(int j = 0; j < phone_book[i].length(); j++) {
        		if(map.containsKey(phone_book[i].substring(0, j))) {
        			return false;
        		}
        	}
        }
        
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
