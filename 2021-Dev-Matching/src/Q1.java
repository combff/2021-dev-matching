
public class Q1 {
    public int[] solution(int[] lottos, int[] win_nums) { //로또의 최고 순위와 최저 순위
    	
    	int win =0;
    	int zero = 0;
    	for(int i=0;i<lottos.length;i++) {
    		if (lottos[i] == 0) {
    			zero++;
    			continue;
    		}
    		for(int j=0;j<win_nums.length; j++) {
    			if(lottos[i] == win_nums[j]) {
    				win++;
    				break;
    			}
    		}
    	}
    	
//    	순위	당첨 내용
//    	1	6개 번호가 모두 일치
//    	2	5개 번호가 일치
//    	3	4개 번호가 일치
//    	4	3개 번호가 일치
//    	5	2개 번호가 일치
        int[] answer = new int[2];
        answer[0] = win+zero;
        answer[1] = win;
    	for(int i=0;i<2;i++) {
    		if (answer[i] == 6)
    			answer[i] = 1;
    		else if (answer[i] == 5)
    			answer[i] = 2;
    		else if (answer[i] == 4)
    			answer[i] = 3;
    		else if (answer[i] == 3)
    			answer[i] = 4;
    		else if (answer[i] == 2)
    			answer[i] = 5;
    		else
    			answer[i] = 6;
    		
    		System.out.println(answer[i]);
    	}

        return answer;
    }
}
