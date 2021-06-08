import java.util.HashMap;

public class Q3 { // 다단계 칫솔 판매

	public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		// enroll : 1 이상 10,000 이하 (민호 미포함) = referral 길이 동일 ("-") = return 길이, 순서 동일
		// seller : 1 이상 100,000 이하 (값 중복 가능) = amount 길이 동일 (1 이상 100 이하인 자연수)

		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0; i<enroll.length;i++)
			map.put(enroll[i], i);
		
		int[] answer = new int[enroll.length];
		for (int i = 0; i < seller.length; i++) { //주의할 점 seller 중복가능이라고 해서 amount를 한꺼번에 계사하면 안됨 ***
			// 10% 에서 1원 미만은 0
			// 800 -> 80 -> 8 -> 0, 300-> 30->3->0
			// 1100 -> 110 -> 11 ->1
			// 값이 달라
			
			String str = seller[i]; // young
			int res = amount[i] * 100;

			while (true) {

				System.out.println(str);
				if (str.equals("-") || res == 0) //이익이 0원이면 더이상 찾을 필요없어 ****** max = 100 * 100 에서 10% 씩 줄어들기때문에 가격조건이 들어가야 시간초과가 안 걸림
					break;

				int j = map.get(str);
				int tmp = (int) (res * 0.1);
				answer[j] += (res - tmp);
				str = referral[j]; 
				res = tmp;

			} // while

		}

		for (int val : answer)
			System.out.println(val);
		return answer;
	}

}
