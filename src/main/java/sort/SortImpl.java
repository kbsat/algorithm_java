package sort;

import java.util.Arrays;

public class SortImpl {

    public static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        int[] array = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
//        selectionSort(array);
//        insertionSort(array);
//        quickSort(array, 0, array.length - 1);
        countingSort(array);
        Arrays.sort(array);

//        System.out.println(Arrays.toString(array));
    }

    private static void countingSort(int[] array) {
        int[] cnt = new int[MAX_VALUE + 1];
        for (int i = 0; i < array.length; i++) {
            cnt[array[i]] += 1;
        }

        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int piv = start;
        int left = start + 1;
        int right = end;
        while (left <= right) {
            while (left <= end && array[left] <= array[piv]) {
                left++;
            }
            while (right > start && array[right] >= array[piv]) {
                right--;
            }

            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            } else {
                int temp = array[piv];
                array[piv] = array[right];
                array[right] = temp;
            }
        }

        quickSort(array, start, right - 1);
        quickSort(array, right + 1, end);
    }


    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int nowIdx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[nowIdx] > array[j]) {
                    break;
                }

                // 변환 필요
                int temp = array[j];
                array[j] = array[nowIdx];
                array[nowIdx] = temp;
                nowIdx = j;
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }

            }

            // 변환 필요
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }


}
