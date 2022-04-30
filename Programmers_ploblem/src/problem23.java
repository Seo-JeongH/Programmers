//import java.util.*;
//약수의 합.
//22.01.19 레벨1

public class problem23 {

	public static int solution(int n) {
        int answer = 0;
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
        	if(n % (i+1) == 0) {
        		arr[i] = i+1;
        	}
        }
                
        for(int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i] + " ");
        	answer += arr[i];
        }
        System.out.print(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		
		solution(n);
	}

}
