package programmers.lv0;

public class 나이_출력 {
  public static void main(String[] args) {
    System.out.println(solution(23));
    System.out.println(solution(40));
  }

  static int solution(int age) {
    int answer = 2022 - age + 1;
    return answer;
  }
}
