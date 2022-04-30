package kakao;
//2021 카카오 채용연계형 인턴십 
//숫자 문자열과 영단어
//레벨1 2022.02.19

//깨달음 : replace 함수를 알게되었다.

public class KaKao2021 {

	public static int solution(String s) {
        int answer = 0;
        
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String arr1[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0; i <arr.length; i++) {
        	s = s.replace(arr[i], arr1[i]);
        }
        answer = Integer.parseInt(s);
        System.out.print(s);
        
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "23four5six7";
		solution(s);

	}

}
