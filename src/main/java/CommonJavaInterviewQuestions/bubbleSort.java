package CommonJavaInterviewQuestions;

import java.util.Arrays;

public class bubbleSort {
    public static void bubbleSort(int arr []){                      // 2 methods bubbleSort and Main

        boolean flag = true;                                       // boolean flag
        for (int i=0; i<arr.length; i++){                           // for loop

            for (int j=1; j< arr.length-i; j++){                    // nested for loop
                if (arr[j]<arr[j-1]) {
                    //swap;
                    int temp = arr[j];                              // swap temp
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    flag = false;
                }
            }
            if(flag == true){                             // flag true break statement
                break;
            }
        }
    }
    public static void main(String[] args) {                        // main method
        int arr[] = {20,13,15,67,89,12};                            // define array
        bubbleSort(arr);                                            // call bubbleSort method
        System.out.println(Arrays.toString(arr));
    }
}

//solution: [12, 13, 15, 20, 67, 89]