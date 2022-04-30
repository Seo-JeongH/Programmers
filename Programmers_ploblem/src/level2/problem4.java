package level2;

//22.04.16
//프로그래머스 짝지어 제거하기 level2

import java.util.Stack;

public class problem4 {

	public int solution(String s)
	{				
		int answer = 0;
		char a[] = new char[s.length()];
		a = s.toCharArray();
		Stack<Character> arr = new Stack<Character>();
					
		for(int i = 0; i < a.length ; i++) {
			if(arr.isEmpty()) {
				arr.push(a[i]);
			}
			else {
				if(arr.peek() != a[i]) {
					arr.push(a[i]);
				}
				else {
					arr.pop();
				}
			}
		}
		
		if(arr.size() == 0) {
			answer = 1;
		}
		else {
			answer = 0;
		}
	
		System.out.println(arr);
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		problem4 a = new problem4();

		a.solution("cdcd");

	}

}
