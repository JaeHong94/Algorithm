package baekjoon.bronze1.평균;

import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 과목 개수
        int num = sc.nextInt();
        int[] score = new int[num];
        double sum = 0;
        // 배열에 과목 점수를 넣고 총합을 구한다.
        for(int i = 0; i < num; i++) {
            score[i] = sc.nextInt();
            sum += score[i];
        }
        double max = 0;
        // 가장 높은 점수 구하기
        for(int i : score) {
            if (max < i) max = i;
        }
        double avg = sum / max * 100 / num;
        System.out.println(avg);
    }
}
