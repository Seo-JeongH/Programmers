class ploblem4 { //a와 b를 더하는데 그 사이의 수까지 다 더하는 프로그램
    public static long solution(int a, int b) {
        long answer = 0;
        
        if(a < b) {
        	for(int i = a; i <= b ; i++) {
            	answer += i;
            }
        }
        else {
        	for(int i = b; i <= a ; i++) {
            	answer += i;
            }
        }            
        
        System.out.println(answer);
        
        return answer;
    }
    
    public static void main(String arg[]) {
    	int a = 3; 
    	int b = 5;
    	
    	solution(a,b);
    }
}