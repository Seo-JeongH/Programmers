import java.util.Arrays;

//array배열의 i번째 숫자부터 j번째 숫자를 가져온뒤 정렬을하고 k번째 숫자를 리턴한다. 
class problem13 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i ++) {
			int copy[] = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]);
//					System.out.println(copy[i]);
					Arrays.sort(copy);
			answer[i] = copy[commands[i][2]-1];
			
        }
        for(int i = 0; i < answer.length; i++) {
        	System.out.print(answer[i]);
        }
        return answer;
        
    }
    
    public static void main(String arg[]) {
		int array[] = {1,5,2,6,3,7,4};
		int commands[][] = {{2,5,3},{4,4,1},{1,7,3}};

		solution(array,commands);
	}
}