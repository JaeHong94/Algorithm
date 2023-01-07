package baekjoon.silver1.구간_합_구하기5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        // 2차원 숫자 배열 생성
        int[][] numArr = new int[size + 1][size + 1];
        for(int i = 1; i <= size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= size; j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 2차원 구간 합 배열 생성
        int[][] sumArr = new int[size + 1][size + 1];
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                sumArr[i][j] = sumArr[i][j - 1] + sumArr[i - 1][j] - sumArr[i - 1][j - 1] + numArr[i][j];
            }
        }
        // (x1, y1) ~ (x2, y2) 구간 합 계산
        for(int i = 0; i < quizNo; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = sumArr[x2][y2] - sumArr[x1 - 1][y2] - sumArr[x2][y1-1] + sumArr[x1 - 1][y1 - 1];
            System.out.println(result);
        }

    }
}
