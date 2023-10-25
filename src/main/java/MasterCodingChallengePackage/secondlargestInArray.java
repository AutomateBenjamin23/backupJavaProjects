package MasterCodingChallengePackage;

public class secondlargestInArray {
        public static int findSecondLargest(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array should have at least two elements");
                return -1;
            }

            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                    secondLargest = arr[i];
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second-largest element found.");
                return -1;
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            int[] arr = {10, 5, 20, 8, 15, 30};
            int secondLargest = findSecondLargest(arr);
            System.out.println("The second-largest element is: " + secondLargest);
        }
}





