//수박수박수박수박수박수박수
//level 1
// 22.01.19
public class problem24 {

	public static String solution(int n) {
        String answer = "";
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 0) {
        		answer += "박";
        	}
        	else {
        		answer += "수";
        	}
        }
        System.out.print(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		solution(n);
	}

}
