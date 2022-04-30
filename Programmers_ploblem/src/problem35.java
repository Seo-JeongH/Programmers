//핸드폰 번호 가리기
// 레벨1 22.01.23

public class problem35 {

	 public static String solution(String phone_number) {
	        String answer = "";
	        
	        for(int i = 0; i < phone_number.length() -4; i++) {
	            answer += "*";
	        }
	        
	        for(int i = phone_number.length()-4; i < phone_number.length(); i++) {
	        	answer += phone_number.charAt(i);
	        }
	        
	        System.out.print(answer);
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone_number = "01033334444";
		solution(phone_number);
	}

}
