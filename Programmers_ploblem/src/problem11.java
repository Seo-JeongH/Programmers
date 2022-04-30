import java.util.ArrayList;
import java.util.Arrays;

//숫자두개를 뽑아서 answer배열에 더해서 나올수 있는수를 모두 저장해서 출력하기 

class problem11 {
    public static int[] solution(int[] numbers) {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	int a;
    	
    	for(int i = 0; i < numbers.length; i++) {
    		for(int j = i + 1 ; j < numbers.length; j++) {
    			a = numbers[i] + numbers[j];
    			if(!arr.contains(a)) {
    				arr.add(a);
    			}
    		}
    	}
    	
    	int[] answer = new int[arr.size()];
    	
    	for(int i = 0; i <arr.size(); i++) {
    		answer[i] = arr.get(i);
    	}
    	
    	Arrays.sort(answer);
    	
    	for(int i = 0; i <arr.size(); i++) {
    		System.out.print(answer[i] + " ");
    	}
    	
        
        return answer;
    }
    
    public static void main(String arg[]) {
    	int arr[] = {2,1,3,4,1};
    	solution(arr);
    }
}
