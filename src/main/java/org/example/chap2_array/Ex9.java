package org.example.chap2_array;

import java.util.Scanner;

/**
 * @desc
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * @input
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * @output
 * 최대합을 출력합니다.
 */
public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int lSum = 0, rSum = 0;
        for (int i = 0; i < n; i++) {
            int hSum = 0, vSum = 0;
            for (int j = 0; j < n; j++) {
                hSum += arr[i][j];
                vSum += arr[j][i];
            }

            lSum += arr[i][i];
            rSum += arr[i][n - i - 1];

            answer = Math.max(answer, Math.max(hSum, vSum));
        }
        answer = Math.max(answer, Math.max(lSum, rSum));

        return answer;
    }
}
