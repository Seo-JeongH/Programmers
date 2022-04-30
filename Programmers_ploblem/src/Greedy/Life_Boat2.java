package Greedy;

//구명보트 그리디 레벨2
// 2022.03.01

import java.util.*;

public class Life_Boat2 {

	public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people); 
        //ex.1 sort 결과 50 50 70 80
        //ex.2 sort 결과 50 70 80
        for(int i = 0; i < people.length - 1; i++) {
        	if((people[i] + people[i+1]) <= limit || (people[i] + people[i+1]) > limit) {
        		answer ++;
//        		if(answer == (people.length -1)) {
//        			answer++;
//        		}
        	}
//        	else if((people[i] + people[i+1]) > limit){
//        		answer++;
//        		if(answer == (people.length -1)) {
//        			answer++;
//        		}
//        	}
        }
        //test
        System.out.println(answer);
        
        return answer;
    }

	public static void main(String[] args) {
		int limit = 100;
//		int people[] = {70, 50, 80, 50};
		int people[] = {70, 80, 50};  //50 
		solution(people, limit);
	}

}
