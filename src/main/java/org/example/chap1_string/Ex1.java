package org.example.chap1_string;

import java.util.Scanner;

/**
 * @desc
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정 문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하시오
 *
 * @input
 * 첫 줄에 문자열이 주어지고, 두번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어있다.
 *
 * @output
 * 해당 문자의 개수를 출력
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c) {
        int answer = 0;

        c = Character.toLowerCase(c);
        char[] chars = str.toLowerCase().toCharArray();

        for (char t : chars) {
            if (t == c) answer++;
        }

        return answer;
    }
}
