package org.example.chap2_array;

import java.util.Scanner;

/**
 * @desc
 * 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
 * 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 * 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
 * @input
 * 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
 * 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
 * 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
 * @output
 * 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
 * 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) { // 학생 번호
            for (int j = 0; j < 5; j++) { // 학년
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < n; i++) { // 학생
            int count = 0;
            for (int j = 0; j < n; j++) { // 학생별 반
                for (int k = 0; k < 5; k++) { // 그 반에 속했던 학생
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break; // 같은 반을 했던 학생 수를 계산하는 것이므로 같은 학생을 여러번 계산하면 안됨
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i+1; // 학생의 번호는 인덱스+1
            }
        }
        return answer;
    }
}
