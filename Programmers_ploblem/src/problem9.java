////실력체크 1 숫자 내림차순으로 정렬
//
//import java.util.Collections;
//import java.util.ArrayList;
//
//class Solution {
//    public static int solution(int n) {
//        int answer = 0;
//        int count = 0;
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        
//        while(n > 0) {
//        	count = n % 10;
//        	arr.add(count);
//        	n = n / 10;
//        }
//        
//        Collections.sort(arr);
//        Collections.reverse(arr);
//        System.out.println(arr);
//       
//        
//        return answer;
//    }
//    
//    public static void main(String arg[]) {
//    	int n = 118372;
//    	
//    	solution(n);
//    }
//}