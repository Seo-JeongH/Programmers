//음양 더하기
//레벨1 22.02.07
public class problem41 {

	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int arr[] = new int[absolutes.length];
        
        for(int i = 0; i < absolutes.length; i++) {
        	if(signs[i] == true) {
        		arr[i] = absolutes[i];
        	}
        	else {
        		arr[i] = absolutes[i] * -1;
        	}
        }
        
        for(int i = 0; i < arr.length; i++) {
        	answer += arr[i];
        }        
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
