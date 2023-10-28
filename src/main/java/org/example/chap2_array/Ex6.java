package org.example.chap2_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @desc
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * @input
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * @output
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int a : arr) {
            StringBuilder sb = new StringBuilder();
            int temp = Integer.parseInt(sb.append(a).reverse().toString());
            if(isPrime(temp)) answer.add(temp);
        }

        for (int i : answer) System.out.print(i+" ");
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
