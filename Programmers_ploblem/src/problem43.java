import java.util.Arrays;

//그리디 큰 수 만들기   존나 어렵다 ....
//레벨2 22.02.08


public class problem43 {
	
	public static String solution(String number, int k) {
		char a, b;
		StringBuilder sb = new StringBuilder();
		
		int index = 0;
		
		for(int i = 0; i < number.length() - k; i++) {
			a = '0';
			for(int j = index; j <= k + i; j++) {
				b = number.charAt(j);
				if(b > a) {
					a = b;
					index = j + 1;
				}
			}
			sb.append(a);
		}
		
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "1231234";
		
		solution(number, 3);
	}

}
