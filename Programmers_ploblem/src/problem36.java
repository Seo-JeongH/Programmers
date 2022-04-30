
public class problem36 {

	String A[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String B[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

	public static String solution(String s, int n) {
		String answer = "";


		//       char a = (char)s.charAt(i);

		for(int i = 0; i < s.length(); i++) {
			char a = (char)s.charAt(i);

			if(a == ' ') {
				answer += a;
				continue;
			}

			if(a >= 'a' && a <= 'z') {
				if(a + n > 'z') {
					answer += (char)(a -26 +n);
				}
				else {
					answer += (char)(a + n);
				}
			}
			else if(a >= 'A' && a <= 'Z') {
				if(a + n > 'Z') {
					answer += (char)(a -26 +n);
				}
				else {
					answer += (char)(a + n);
				}
			}
		}        
		// System.out.print(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB";
		solution(s, 1);
		//		char a = 'a';
		//		a += 1;
		//		System.out.print(a);

	}

}
