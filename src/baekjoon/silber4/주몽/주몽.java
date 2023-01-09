package baekjoon.silber4.주몽;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 재료 개수
        int N = Integer.parseInt(br.readLine());
        // 갑옷을 만드는데 필요한 수
        int M = Integer.parseInt(br.readLine());
        // N개의 재료들이 가진 고유한 번호 배열
        int[] numArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArr);
        int i = 0;
        int j = N - 1;
        int count = 0;
        // 정렬한 배열을 인덱스를 옮겨가면서 M과 같은 수가 나오면 갑옷을 만들 수 있음
        while(i < j) {
            if(numArr[i] + numArr[j] < M) {
                i++;
            } else if(numArr[i] + numArr[j] > M) {
                j--;
            } else { // numArr[i] + numArr[j] == M
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
