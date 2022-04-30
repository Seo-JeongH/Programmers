package level2; 
//22.04.12

import java.util.*;

public class problem2 {
	
	public static class Solution {
	    public String solution(int[] numbers) {
	        String answer = "";
	        
	        String arr[] = new String[numbers.length];
	        // numbers를 String배열로 변환.
	        for(int i = 0; i < numbers.length; i++) {
	        	arr[i] = Integer.toString(numbers[i]);
	        }
	        
	        //정렬
	        Arrays.sort(arr, new Comparator<String>() {

				@Override
				public int compare(String arg0, String arg1) {
					return (arg1 + arg0).compareTo(arg0 + arg1);
				}	        		        	
	        });
	        
	        if(arr[0].equals("0")) {
	        	return "0";
	        }
	        
	        for(String a : arr) {
	        	answer += a;
	        }
	        
	        
	        return answer;
	    }
	}
	

	public static void main(String[] args) {
				
		System.out.println();
		
	}

}
