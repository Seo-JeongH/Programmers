//import java.util.ArrayList;
//// 프로그래머스 실력체크 : 배열중 연속된 같은값이 있으면 하나만 출력 , 연속되지 않고 하나만 있다면 하나만 출력
//public class problem1 {
//    public static ArrayList<Integer> solution(int []arr) {
////        int[] answer = new int [arr.length];
//        ArrayList<Integer> answer = new ArrayList();
//        
//        for(int i = 0; i < arr.length-1; i++) {
//        	if(arr[i] == arr[i+1]) {
//        		answer.add(arr[i]); 
//        	}
//        	else if(arr[i] != arr[i+1] && arr[i+1] != arr[i+2]) {
//        		answer.add(arr[i+1]);
//        	}
//        }
//        
//        for(int i = 0 ; i < answer.size()-1; i++) {
//        	if(answer.get(i) == answer.get(i+1)) {
//        		answer.remove(i+1);
//        	}
//        }
//        
//        for(int i = 0; i < answer.size(); i++) {
//        	System.out.print(answer.get(i));
//        }
//
//        return answer;
//    }
//    
//    public static void main(String arg[]) {
//    	int arr[] = {1,1,3,3,0,1,1};
//    	int ar[] = {4,4,4,3,3};
////    	solution(arr);
//    	solution(ar);
//    }
//}
//
