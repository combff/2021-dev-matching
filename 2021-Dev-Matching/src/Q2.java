
public class Q2 { // 행렬 테두리 회전하기
	public int[] solution(int rows, int columns, int[][] queries) {

		int[][] pan = new int[rows + 1][columns + 1];

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				pan[i][j] = ((i - 1) * columns + j);
			}
		}

		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {

			int min = 10001; //최대치 row 100 * col 100
			int tmp = 0; // 현재의 값
			int before = pan[queries[i][0]][queries[i][1]]; // 이전 값
			for (int j = queries[i][1] + 1; j <= queries[i][3]; j++) { // top row
				tmp = pan[queries[i][0]][j];
				pan[queries[i][0]][j] = before;
				min = Math.min(min, before);
				before = tmp;
			}

			for (int j = queries[i][0] + 1; j <= queries[i][2]; j++) {

				tmp = pan[j][queries[i][3]];
				pan[j][queries[i][3]] = before;
				min = Math.min(min, before);
				before = tmp;
			}
//			System.out.println("tmp2 : " + tmp);
			for (int j = queries[i][3] - 1; j >= queries[i][1]; j--) { // bottom row 고정 / col for문

				tmp = pan[queries[i][2]][j];
				pan[queries[i][2]][j] = before;
				min = Math.min(min, before);
				before = tmp;
			}
//			System.out.println("tmp3 : " + tmp);
			for (int j = queries[i][2] - 1; j >= queries[i][0]; j--) {

				tmp = pan[j][queries[i][1]];
				pan[j][queries[i][1]] = before;
				min = Math.min(min, before);
				before = tmp;
			}
//			System.out.println("tmp4 : " + tmp);
			answer[i] = min;
		}//for i

		for (int val : answer)
			System.out.println(val);
//		for (int i = 1; i <= rows; i++) {
//			for (int j = 1; j <= columns; j++) {
//				System.out.print(pan[i][j] + " ");
//			}
//			System.out.println("");
//		}

		return answer;
	}
}
