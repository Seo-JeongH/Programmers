//부족한 금액 계산하기
//레벨2 22.02.07

public class problem40 {
	// price = 3 , money = 20, count = 4, result = 10
	public static long solution(int price, int money, int count) {
		long answer = 0;
		int check = 0;
		for(int i = 1 ; i <= count; i++) {
			check += price * i;
		}
		if(check > money) {
			answer = (long)(check - money);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(3, 20, 4);

	}

}
