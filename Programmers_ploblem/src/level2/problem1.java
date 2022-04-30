//124나라 속도가 느림 , 해결못함(이해를 못한거)

package level2;

class problem1 {
    public static String solution(int n) {
        String answer = "";
        String arr[] = {"4", "1", "2"};
        
        while(n > 0) {
        	
        	answer = arr[n % 3] + answer;
        	n = (n - 1) / 3;
        }
        System.out.println(answer);
        return answer;
    }
    
    public static void main(String arg[]) {
    	int n = 10;
    	
    	solution(n);
    	
    }
}