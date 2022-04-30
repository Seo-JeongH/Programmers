// 이차원 배열간 덧셈
class problem3 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1.length];
        
        for(int i = 0 ; i < arr1.length; i++) {
        	for(int j = 0; j < arr1[i].length; j++) {
//        		if(arr1[i][j] == 0 || arr2[i][j] == 0) {
//        			
//        		}
//        		else {
        			answer[i][j] = arr1[i][j] + arr2[i][j];
//        		}
        	}
        }
        
        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j <answer[i].length; j++) {
        		System.out.print(answer[i][j] + " ");
        	}
        }

        return answer;
    }
    
    public static void main(String arg[]) {
    	int arr1[][] = {{1,2},{2,3}};
    	int arr2[][] = {{3,4},{5,6}};
//    	
//    	int arr1[][] = {{1},{2}};
//    	int arr2[][] = {{3},{4}};
    	
    	solution(arr1,arr2);
//    	for(int i = 0; i < arr1.length; i++) {
//        	for(int j = 0; j <arr1[i].length; j++) {
//        		System.out.print(arr1[i][j] + " ");
//        	}
//        }
//    	
//    	System.out.println();
//    	
//    	for(int i = 0; i < arr2.length; i++) {
//        	for(int j = 0; j <arr2[i].length; j++) {
//        		System.out.print(arr2[i][j] + " ");
//        	}
//        }
    
    }
}