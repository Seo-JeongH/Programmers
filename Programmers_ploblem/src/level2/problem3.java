package level2;

//22.04.13 레벨2 소수 찾기. 순열 이용.. 아직 못풀었다리 ㅠㅠㅠㅠ

import java.util.*;

public class problem3 {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static boolean visit[] = new boolean[7];
	
	public int solution(String numbers) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length(); i++) {
        	dfs(numbers, "", i + 1);
        }
        
        for(int i = 0; i < arr.size(); i++) {
        	if(prime(arr.get(i))) {
        		answer++;
        	}
        }  
                
        return answer;
    }
	
	//DFS
	public static void dfs(String str, String temp, int m) {
		if(temp.length() == m) {
			int num = Integer.parseInt(temp);
			
			if(!arr.contains(num)) {
				arr.add(num);
			}
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(!visit[i]) {
				visit[i] = true;
				temp += str.charAt(i);
				dfs(str, temp, m);
				visit[i] = false;
				temp = temp.substring(0, temp.length() -1);
				
			}
		}	
	}
	
	public static boolean prime(int a) {
		if(a < 2) {
			return false;
		}
		
		else {
			for(int i = 2; i * i <= a; i++) {
				if(a % i == 0) {
					return false;
				}
			}
		}
		
		return true;
		
	}
    

	public static void main(String[] args) {
		problem3 arr = new problem3();
		System.out.println(arr.solution("011"));
		
	}

}
