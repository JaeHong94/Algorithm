package baekjoon.sliver5.수들의_합5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수들의_합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 1;
        // start_index ~ end_index까지 더해서 15가 나오면 count++
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != N) {
            // sum이 N보다 커지면 sum에서 start_index를 빼주고 start_index++
            if(sum > N) {
                sum -= start_index;
                start_index++;
            } else if(sum < N) { // sum이 N보다 작아지면 end_index++, sum에 end_index를 더해준다.
                end_index++;
                sum += end_index;
            } else { // sum과 N이 같아지면 count++, end_index++, sum에 end_index를 더해준다.
                count++;
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}
