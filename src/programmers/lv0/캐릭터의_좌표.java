package programmers.lv0;

import java.util.Arrays;

public class 캐릭터의_좌표 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
    System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));
  }

  static int[] solution(String[] keyinput, int[] board) {
    int[] answer = {0, 0};
    for(int i = 0; i < keyinput.length; i++) {
      if(keyinput[i].equals("left")){
        answer[0] -= 1;
        if(board[0]/2 * (-1) > answer[0]) answer[0] = (board[0]/2) * (-1);
      } else if(keyinput[i].equals("right")) {
        answer[0] += 1;
        if(board[0]/2 < answer[0]) answer[0] = board[0]/2;
      } else if(keyinput[i].equals("up")) {
        answer[1] += 1;
        if(board[1]/2 < answer[1]) answer[1] = board[1]/2;
      } else if(keyinput[i].equals("down")) {
        answer[1] -= 1;
        if((board[1]/2) * (-1) > answer[1]) answer[1] = (board[1]/2) * (-1);
      }
    }
    return answer;
  }
}
