// 소수찾기  레벨1
// 에라토스테네스의 체 // 존나어려움 ㅅㅂ


public class probelm21 {
	public static int solution(int n) {
        int answer = 0;
        
        int arr[] = new int[n+1];
        
        for(int i = 2; i <= n; i++) {
        	arr[i] = i;
        }
        
        for(int i = 2; i <= n; i++) {
        	if(arr[i] == 0) {
        		continue;
        	}
        	
        	for(int k = 2*i; k <= n; k+=i) {
        		arr[k] = 0;
        	}
        }
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != 0) {
        		answer++;
        	}
        }
        
        System.out.println(answer);
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		int n = 10;
		
		solution(n);

	}

}
