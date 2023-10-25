package CommonJavaInterviewQuestions;

import java.util.Arrays;
public class BubbleSortV2 {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;

            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i]) {
                        // Swap arr[i-1] and arr[i]
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                    }
                }
                n--; // Reduce the size of the unsorted portion of the array
            } while (swapped);
        }
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Original array: " + Arrays.toString(arr));
            bubbleSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }



