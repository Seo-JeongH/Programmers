//level.1 문자열 내 p와 y의 개수  22.01.12
import java.util.Arrays;

public class problem16 {
	
	static boolean solution(String s) {
        boolean answer = true;
       
        char arr[] = s.toCharArray();
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == 'p' || arr[i] == 'P') {
        		count1++;
        	}
        	else if(arr[i] == 'y' || arr[i] == 'Y') {
        		count2++;
        	}
        }
        
        if(count1 == count2) {
        	answer = true;
        }
        else {
        	answer = false;
        }

        return answer;
    }

	public static void main(String[] args) {
		
		String s = "pPoooyY";
		
		solution(s);
		
	}

}
