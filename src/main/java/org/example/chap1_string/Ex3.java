package org.example.chap1_string;

import java.util.Scanner;

/**
 * @desc
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장 속 각 다넝는 공백으로 구분됩니다.
 *
 * @input
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * @output
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String string) {
        String answer = "";
        int max = 0;

        String[] strs = string.split(" ");
        for (String str : strs) {
            int length = str.length();
            if (length > max) {
                max = length;
                answer = str;
            }
        }
        return answer;
    }
}
