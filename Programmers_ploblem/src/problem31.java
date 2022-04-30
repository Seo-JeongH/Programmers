//최대공약수와 최소공배수 ***************************
//레벨1 22.01.23

public class problem31 {
	
	public static int gcd(int n, int m) {
		int a = 0;
		
		while(m > 0) {
        	a = m;
        	m = n % m;
        	n = a;
        }
		return n;
	}
	
	public static int gcd2(int n, int m) {
		int b = (n * m) / gcd(n,m);
		
		return b;
	}
	
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n,m);
        answer[1] = gcd2(n,m);
        
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3, 12));
	}

}
