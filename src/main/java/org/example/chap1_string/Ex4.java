package org.example.chap1_string;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @desc
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * @input
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * @output
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) strings[i] = in.next();

        for (String answer : solution(n, strings)) {
            System.out.println(answer);
        }
    }

    public static String[] solution(int n, String[] strings) {
        String[] answer = new String[n];

        IntStream.range(0, n).forEach(i -> {
            StringBuilder sb = new StringBuilder(strings[i]).reverse();
            answer[i] = sb.toString();
        });

        return answer;
    }

}
