package baekjoon.silver3.구간_합_구하기4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 구간합구하기 {
    public static void main(String[] args) throws IOException {
        // 방법1 메모리: 257,156B    시간: 2488ms
        Scanner sc = new Scanner(System.in);
        int suNo = sc.nextInt(); // 데이터 개수
        int quizNo = sc.nextInt(); // 질의 개수
        // 데이터 담을 배열
        int[] numArr = new int[suNo + 1];
        for(int i = 0; i < suNo; i++) {
            numArr[i] = sc.nextInt();
        }
        // 합 배열 생성
        int[] sumArr = new int[suNo + 1];
        for(int i = 1; i <= suNo; i++) {
            sumArr[i] = sumArr[i - 1] + numArr[i - 1];
        }
        // 구간 합 구하기
        for(int i = 0; i < quizNo; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(sumArr[k] - sumArr[j - 1]);
        }

        // 방법2 메모리: 58,844KB    시간: 1408ms
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int suNo = Integer.parseInt(st.nextToken());
//        int quizNo = Integer.parseInt(st.nextToken());
//        int[] sumArr = new int[suNo + 1];
          // new StringTokenizer(br.readLine())를 해야 엔터 후에 값을 받을 수 있음
//        st = new StringTokenizer(br.readLine());
//        for(int i = 1; i <= suNo; i++) {
//            sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());
//        }
//        for(int i = 0; i < quizNo; i++) {
//            st = new StringTokenizer(br.readLine());
//            int j = Integer.parseInt(st.nextToken());
//            int k = Integer.parseInt(st.nextToken());
//            System.out.println(sumArr[k] - sumArr[j - 1]);
//        }
    }
}
