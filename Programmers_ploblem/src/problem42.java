//최소직사각형
//레벨1 22.02.08 인터넷 참고함.

public class problem42 {

	public static int solution(int[][] sizes) {
        int answer = 0;
        int max_1 , max_g = 0, max_2, max_r = 0;
        
        for(int i = 0 ; i < sizes.length; i ++) {
        	max_1 = Math.max(sizes[i][0], sizes[i][1]);
        	max_2 = Math.min(sizes[i][0], sizes[i][1]);
            max_g = Math.max(max_g, max_1);
            max_r = Math.max(max_r, max_2);
        }
        answer = max_g * max_r;
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		solution(arr);
		
	}

}
