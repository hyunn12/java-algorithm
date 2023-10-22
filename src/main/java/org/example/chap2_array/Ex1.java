package org.example.chap2_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @desc
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요. (첫 번째 수는 무조건 출력한다)
 *
 * @input
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * @output
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        solution(num, arr);
    }

    public static void solution(int num, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int temp = -1;
        for (int i = 0; i < num; i++) {
            if (temp < arr[i]) answer.add(arr[i]);
            temp = arr[i];
        }

        for (int i : answer) {
            System.out.print(i+" ");
        }
    }

}
