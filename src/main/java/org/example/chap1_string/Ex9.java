package org.example.chap1_string;

import java.util.Scanner;

/**
 * @desc
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * @input
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * @output
 * 첫 줄에 자연수를 출력합니다.
 */
public class Ex9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        // 강의 풀이
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
        }
//        return Integer.parseInt(sb.toString());

        // 내 풀이
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
    }

}
