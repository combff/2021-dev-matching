
public class Application {
	public static void main(String[] args) {
		Q1 q1 = new Q1();
		int[] lottos = {45, 4, 35, 20, 3, 9}	;//{0, 0, 0, 0, 0, 0}	;//{44, 1, 0, 0, 31, 25};	
		int[] win = {20, 9, 3, 45, 4, 35};//{38, 19, 20, 40, 15, 25};//{31, 10, 45, 1, 6, 19};
//		System.out.println(q1.solution(lottos,win));
		
		Q2 q2 = new Q2();
		int[][] queries ={{2,2,5,4},{2,2,5,4}};//{{2,2,5,4},{3,3,6,6},{5,1,6,3}};//,[3,3,6,6],[5,1,6,3]]
		System.out.println(q2.solution(6, 6, queries));
	}
}
