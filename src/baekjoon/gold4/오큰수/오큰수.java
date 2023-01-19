package baekjoon.gold4.오큰수;

import java.io.*;
import java.util.Stack;

public class 오큰수 {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    // 수열 배열
    int[] A = new int[n];
    // 정답 배열
    int[] ans = new int[n];
    String[] str = bf.readLine().split(" ");
    for(int i = 0; i < n; i++) {
      A[i] = Integer.parseInt(str[i]);
    }

    Stack<Integer> stack = new Stack<>();
    // 처음에는 항상 스택이 비어 있으므로 최초 값을 push해 초기화
    stack.push(0);
    for(int i = 1; i < n; i++) {
      // 스택이 비어있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
      while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
        // 정답 배열에 오큰수를 현재 수열로 저장
        ans[stack.pop()] = A[i];
      }
      // 신규 데이터 push
      stack.push(i);
    }

    // 반복문을 다 돌고 나왔는데 스택이 비어 있지 않다면 빌 떄까지
    while(!stack.empty()) {
      // 스택에 쌓인 index에 -1 넣기
      ans[stack.pop()] = -1;
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i = 0; i < n; i++) {
      // 출력
      bw.write(ans[i] + " ");
    }
    bw.write("\n");
    bw.flush();
  }
}
