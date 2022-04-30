package Hash;

//코딩테스트 연습 해시 위장.
//레벨2 2022.02.27
//아 될거 같은데 뭔가 안됨 ...

import java.util.*;

public class Whijang {

	public static int solution(String[][] clothes) {
		int answer = 0;
		int set[] = new int[clothes[0].length];
		
		ArrayList<String> arr = new ArrayList<>(clothes.length);
		// arr에 clothes배열 다 넣기.
		for(int i = 0; i < clothes.length; i++) {
			for(int j = 0; j < clothes[i].length; j++) {
				arr.add(clothes[i][j]); 
			}
		}

		//test
		System.out.println(arr);
		System.out.println();
		
		//clothes 배열의 요소 HashMap에 집어넣기.
		Map<String, String> a = new HashMap<>();
		
		for(int i = 0; i < arr.size(); i+=2) {
			a.put(arr.get(i), arr.get(i+1));
			if(i == arr.size() -1) {
				break;
			}
		}
		
		String setting[] = new String[a.size()+1];
		int i = 0;
		
		Iterator it = a.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
			setting[i] = entry.getValue();
			System.out.println(setting[i]);
			i++;
		}
		
		for(int j = 0; j < setting.length; j++) {
			if(setting[j] == setting[j+1]) {
				
			}
		}
//		
//		for(int i = 0; i < a.size(); i++) {
//			if(a.get(key) == a.get(i+1)) {
//				set[i]++;
//			}
//		}
//		
		System.out.println();
		//test
		System.out.println(a);
		
		
		return answer;
	}

	public static void main(String[] args) {
		String clothes[][] = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

		solution(clothes);

	}

}
