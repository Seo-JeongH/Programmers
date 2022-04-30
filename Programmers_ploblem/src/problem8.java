class problem8 {  // x가 n의 제곱근인지 확인한후 맞으면 n+1의 제곱을 출력 아니면 -1출력
    public long solution(long n) {
        long answer = 0;
        int x = 0;
        
        while(x*x < n) {
        	x++;
        }
        if(x*x == n) {
        	x++;
        	answer = x*x;
        }
        return answer;
    }
}