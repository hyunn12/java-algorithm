package org.example.chap1_string;

import java.util.Scanner;

/**
 * @desc
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * @input
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * @output
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer;

        char[] chars = str.toCharArray();
        int leftIdx = 0;
        int rightIdx = chars.length - 1;

        char left, right;

        // while 을 쓰지 않고 for 문으로 해결할 수는 없나?
        while (leftIdx < rightIdx) {
            // 알파벳인지 체크 Character.isAlphabetic
            if (!Character.isAlphabetic(chars[leftIdx])) leftIdx++;
            else if (!Character.isAlphabetic(chars[rightIdx])) rightIdx--;
            else {
                left = chars[leftIdx];
                right = chars[rightIdx];

                chars[leftIdx] = right;
                chars[rightIdx] = left;

                leftIdx++;
                rightIdx--;
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

}
