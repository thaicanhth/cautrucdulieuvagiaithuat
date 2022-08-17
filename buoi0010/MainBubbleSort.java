package buoi0010;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class MainBubbleSort {
    public static  void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] + "  ");
        }
}
    public static void main(String[] args) {
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};
        printArray(intArray);
        bubbleSort(intArray);
        System.out.println("");
        System.out.println("Sorted");
        printArray(intArray);
    }
    private static void bubbleSort(int [] arr) {
        int lastIndex = arr.length - 1;
        for (int last = lastIndex; last >= 0; last--) {
            for (int i = 0; i < last; i++) {
                if (arr[i]>arr[i+1]) {
                    swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (i==j) {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
