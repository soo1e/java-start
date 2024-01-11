package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum =  0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double avg = sum / array.length;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avg);
    }
}
