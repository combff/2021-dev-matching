public class Q3 { // 다단계 칫솔 판매

	public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		// enroll : 1 이상 10,000 이하 (민호 미포함) = referral 길이 동일 ("-") = return 길이, 순서 동일
		// seller : 1 이상 100,000 이하 (값 중복 가능) = amount 길이 동일

		int[] amount2 = new int[enroll.length];
		String[] seller2 = new String[enroll.length];
		for (int j = 0; j < enroll.length; j++) {
			for (int i = 0; i < seller.length; i++) {
				if(enroll[j].equals(seller[i])) {
					amount2[j] += amount[i]; 
					seller2[j] = seller[i];
					break;
				}
			}
		}
		
//		for (int j = 0; j < enroll.length; j++) 
//			System.out.println(seller2[j] + " : " + amount2[j]);

		int[] answer = new int[enroll.length];
		for (int i = 0; i < seller2.length; i++) {
			
			if(seller2[i] == null)
				continue;

			String str = seller2[i]; // young
			int res = (int) (amount2[i] * 100);
			
			while (true) {

				if (str.equals("-"))
					break;

				for (int j = 0; j < enroll.length; j++) {
					if (str.equals(enroll[j])) {	
						int tmp = (int) (res * 0.1);
						answer[j] += res - tmp;
						str = referral[j]; // edward
						res = tmp;
						break;
					}
				}

			} // while

		}

		for (int val : answer)
			System.out.println(val);
		return answer;
	}

}
