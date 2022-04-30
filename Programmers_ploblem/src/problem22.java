//문자열 내림차순으로 배치하기.
// 22.01.18 레벨 1

import java.util.*;

public class problem22 {

	public static String solution(String s) {
		String answer = "";
		
	    char[] arr = s.toCharArray();
	    
        Arrays.sort(arr);  // 처음에 sort 했다가 다시함. 이부분만 오류
        
        char[] save = new char[arr.length];  //저장용
        int j = 0;
	    for(int i = arr.length - 1; i >= 0; i--) {
	       	 save[j] = arr[i];
            j++;
        }
        
        answer = new String(save);

	    return answer;
	} //실행 성공

	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);

	}

}
