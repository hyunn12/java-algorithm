package org.example.chap2_array;

import java.util.Scanner;

/**
 * @desc
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * @input
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * @output
 * 첫 줄에 소수의 개수를 출력합니다.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(solution(num));
    }

    // 에라토스테네스의 체
    public static int solution(int num) {
        boolean[] primes = new boolean[num + 1];
        int answer = 0;

        for (int i = 2; i <= num; i++) {
            if (!primes[i]) {
                answer++;

                for (int j = i; j <= num; j = j + i) {
                    primes[j] = true;
                }
            }
        }

        return answer;
    }

}
