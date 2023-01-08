package baekjoon.gold3.나머지_합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;
        int[] count = new int[M];
        // 배열 값 입력
        st = new StringTokenizer(br.readLine());
        // 합 배열을 계산하면서 M으로 나누어 떨어지는 값 계산, M으로 나눠서 나온 나머지 값 개수 저장
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            count[sum]++;
        }

        long ans = count[0];
        // 3C2, 2C2에대한 경우의 수 계산
        for (int i = 0; i < M; i++) {
            ans += (long) count[i] * (count[i] - 1) / 2;
        }
        System.out.println(ans);
    }
}