package org.example.chap1_string;

import java.util.Scanner;

/**
 * @desc
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 * @input
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * @output
 * 첫 줄에 압축된 문자열을 출력한다.
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        // 마지막 자리 문자 처리 위해 뒤에 공백 한자리 추가
        str += " ";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) sb.append(count);
                count = 1;
            }
        }

        return sb.toString();
    }
    
}
