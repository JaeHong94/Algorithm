package baekjoon.silber4.카드2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 카드의 수
    int N = sc.nextInt();
    Queue<Integer> qu = new LinkedList<>();
    for(int i = 1; i <= N; i++) {
      qu.add(i);
    }

    while(qu.size() != 1) {
      // 맨 위에 카드 제거
      qu.poll();
      // 다음 카드 맨 뒤로 보내기
      qu.add(qu.poll());
    }

    // 마지막으로 남은 카드 출력
    System.out.println(qu.peek());
  }
}
