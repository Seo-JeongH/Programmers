import java.util.Collections;
import java.util.ArrayList; //완성본  다시공부하자
//array배열의 i번째 숫자부터 j번째 숫자를 가져온뒤 정렬을하고 k번째 숫자를 리턴한다. 
class problem5 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        ArrayList<Integer> arr;
        
        for(int i = 0; i < commands.length; i ++) {
        	arr = new ArrayList<Integer>();
			for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				arr.add(array[j]);
			}
			
			Collections.sort(arr);
			answer[i] = (arr.get(commands[i][2]-1));
			
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