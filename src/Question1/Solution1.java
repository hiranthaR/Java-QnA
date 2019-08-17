package Question1;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        int[] numbers = {12, 2, 6, 9, 1, 7, 20, 5, 10, 4, 15};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int number = sc.nextInt();

        for (int i = 0; i <= numbers.length; i++) {
            if (i == numbers.length) {
                System.out.println("Number does not exist in the array");
                break;
            }
            if (numbers[i] == number) {
                System.out.println("Number exists in the array at index " + i);
                break;
            }
        }

        int[] sorted = sort(numbers);
        System.out.print("sorted : ");
        for (int n : sorted)
            System.out.print(n + " ");
    }

    // bubble sort algorithm
    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }
}
