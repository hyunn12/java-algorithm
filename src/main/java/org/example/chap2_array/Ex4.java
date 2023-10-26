package org.example.chap2_array;

import java.util.Scanner;

/**
 * @desc
 * 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * @input
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * @output
 * 첫 줄에 피보나치 수열을 출력합니다.
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        solution(num);
    }

    // 내가 생각한 답
    public static void solution(int num) {
        int[] answer = new int[num];
        int temp = 0;
        answer[0] = 1;
        for (int i = 1; i < num; i++) {
            answer[i] = answer[i - 1] + temp;
            temp = answer[i - 1];
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    // 강의에서 나온 답
    public static void solution2(int num) {
        int a = 1, b = 1;
        System.out.print(a+" "+b+" ");

        for (int i = 2; i < num; i++) {
            System.out.print((a+b) + " ");
        }
    }
}
