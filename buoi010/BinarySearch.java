package buoi010;

import javax.swing.text.Style;

public class BinarySearch {
    public static void main(String[] args) {
        int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
        // Cho ni trinh bay 2 cach
        // Cach 1 khong dung de quy
        System.out.println(" iterativeBinarySearch= " + iterativeBinarySearch(intArray, 20));
        // Cach 2 dung de quy
        System.out.println(" recursiveBinarySearch= " + recursiveBinarySearch(intArray, -22));
    }

    private static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;
        // quan trong la thuc hien khi start nho hon end
        while (start < end) {
            // tim midpoint
            int midpoint = (start + end) / 2;
            // Neu bang midpoint thi return luon
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) { // Lon hon midpoint thi qua Phai: midpoint+1 den end
                start = midpoint + 1;
                // end giu nguyen la input lenth. Tim khoang sau do
            } else {
                // Nho hon midpoint thi qua trai: Tim nua ben trai 1 den midpoint
                //start=1 giu nguyen
                end = midpoint;// Di doan truowc
            }
        }
        // di het roi, start>=end ma tim ko ra
        return -1;
    }

    private static int recursiveBinarySearch(int[] input, int value) {
        // goi 1 ham de search nha
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1; // Dieu kien dung de quy
        }
        int midpoint = (start + end) / 2;
        //System.out.println("mid= "+midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {// Phai
            // Lon hon midpoint thi qua Phai: midpoint+1 den end
            return recursiveBinarySearch(input, midpoint + 1, input.length, value);

        } else {
            // Nho hon midpoint thi qua trai: Tim nua ben trai 1 den midpoint
            return recursiveBinarySearch(input, start, midpoint, value);
        }

    }
}


