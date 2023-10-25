package MasterCodingChallengePackage;

import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr []){
        boolean flag = true;

        for (int i =0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; i++){
                if (arr[j]<arr[j-1]) {

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;

                    flag = false;

                }
            }
            if (flag == true){
                break;

        }

        }

    }

}
