package org.example.chap1_string;

import java.util.Scanner;

/**
 * @desc
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * @input
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * @output
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char target = in.next().charAt(0);

        for (int i : solution(str, target)) {
            System.out.print(i+" ");
        }
    }

    public static int[] solution(String str, char target) {
        int[] answers = new int[str.length()];
        int d = 100;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                d = 0;
            } else {
                d++;
            }
            answers[i] = d;
        }

        d = 100;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == target) {
                d = 0;
            } else {
                d++;
                answers[i] = Math.min(d, answers[i]);
            }
        }

        return answers;
    }

}
