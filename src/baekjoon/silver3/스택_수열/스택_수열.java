package baekjoon.silver3.스택_수열;

import java.util.Scanner;
import java.util.Stack;

public class 스택_수열 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 수열의 수
    int[] A = new int[N]; // 수열 배열
    for(int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    StringBuffer sb = new StringBuffer();
    int num = 1;
    boolean result = true;

    for (int su : A) {
      // 현재 수열 값 >= 오름차순 자연수: 값이 같아질 때까지 push() 수행
      if (su >= num) {
        while (su >= num) {
          stack.push(num++);
          sb.append("+\n");
        }
        stack.pop();
        sb.append("-\n");
      } else { // 현재 수열 값 < 오름차순 자연수: pop()을 수행해 수열 원소를 꺼냄
        int n = stack.pop();
        // 스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
        if (n > su) {
          System.out.println("NO");
          result = false;
          break;
        } else {
          sb.append("-\n");
        }
      }
    }
    if(result) System.out.println(sb.toString());
  }
}
