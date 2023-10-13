package org.example.chap1_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @desc
 * 소문자로 된 한 개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * @input
 * 첫 줄에 문자열이 입력됨니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * @output
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer;

        // 1. 내 풀이
        List<String> charList = new ArrayList<>();
        char[] chars = str.toCharArray();
        for (char s : chars) {
            if (!charList.contains(String.valueOf(s))) charList.add(String.valueOf(s));
        }

        answer = String.join("", charList);

        // 2. 강의 풀이
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            // 현재 indexOf 를 사용하면 해당 문자의 가장 앞 index 출력
            // for 문의 index 번호와 해당 번호가 다르다면 기존에 존재하는 문자라는 뜻
            if (str.indexOf(str.charAt(i)) == i) sb.append(str.charAt(i));
        }
        answer = sb.toString();

        return answer;
    }

}
