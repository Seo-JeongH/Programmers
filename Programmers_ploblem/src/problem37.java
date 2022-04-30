//하샤드 수
//레벨1 22.01.24


public class problem37 {
	
	public boolean solution(int x) {
        boolean answer = true;
        
        int count = 0;
        int temp = x;
        while(temp > 0) {
        	count += temp % 10;
        	temp /= 10;
        }
        
        if(x % count == 0) {
        	return true;
        }
        else {
        	return false;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
