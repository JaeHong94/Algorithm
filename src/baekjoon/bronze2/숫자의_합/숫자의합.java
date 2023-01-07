package baekjoon.bronze2.숫자의_합;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        char[] chArr = str.toCharArray();
        int answer = 0;
        for(int i = 0; i < chArr.length; i++) {
            answer += chArr[i] - '0';
        }
        System.out.println(answer);
    }
}
