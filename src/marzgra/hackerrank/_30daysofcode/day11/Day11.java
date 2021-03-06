/*
TASK:
    Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
    Graphic representation of hourglass:
        a b c
          d
        e f g

SAMPLE INPUT:
    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0

SAMPLE OUTPUT:
    19

 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int sum = 0;
        int max = -63;
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(sum, max);
            }
        System.out.println(max);
    }
}
