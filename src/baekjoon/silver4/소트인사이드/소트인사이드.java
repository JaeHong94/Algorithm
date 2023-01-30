package baekjoon.silver4.소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소트인사이드 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();
    int[] arr = new int[N.length()];
    for(int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(N.substring(i, i + 1));
    }
    for(int i = 0; i < arr.length; i++) {
      int max = i;
      for(int j = i + 1; j < arr.length; j++) {
        if(arr[j] > arr[max]) max = j;
      }
      if(arr[i] < arr[max]) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
      }
    }
    for (int j : arr) {
      System.out.print(j);
    }
  }
}
