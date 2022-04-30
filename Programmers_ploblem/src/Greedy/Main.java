// 그리디 체육복 문제. 70점 ㅅㅂ;;
// n에서 reserve길이를 더하고 lost길이를 빼면 70점임

package Greedy;

public class Main {

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        int count[] = new int[n];
        
        for(int i : lost) {
        	count[i - 1]--;
        }
        
        for(int i : reserve) {
        	count[i - 1]++;
        }
        
        for(int i = 0; i < count.length; i++) {
        	if(count[i] == -1) {
        		if(i-1 >= 0 && count[i-1] == 1) {
        			count[i]++;
        			count[i-1]--;
        		}
        		else if(i+1 < count.length && count[i+1] == 1) {
        			count[i]++;
        			count[i+1]--;
        		}
        		else {
        			answer--;
        		}
        	}
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
//		int n = 5;
//		int a[] = {2, 4};
//		int b[] = {3};
//		
//		System.out.println(solution(n, a, b));
	}

}
