package buoi011;

public class QuickSortDemo {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 12, 5, 26, 7, 14, 3, 7, 2};
        printArray(intArray);
        quickSort(intArray, 0, intArray.length - 1);
        printArray(intArray);
    }

    private static void quickSort(int[] arr, int left, int right) {
        // Neu left> right thi thoi dung
        if (left >= right) {
            return;
        } else {
            // Cho ni la bat dau chia ra 2 phan ne
            int index = partion(arr, left, right);
            if (left < index - 1) {
                // Sap xep ben trai
                quickSort(arr, left, index - 1); // Dieu kien gi thi lam
            }
            // Sap xep phan ben phai
            if (index < right) {
                quickSort(arr, index, right);
            }
        }
    }
    // Chu xay dung ham tim ra partion
    private static int partion(int[] arr, int left, int right) {
        int i=left, j=right;
        int midpoint=(left+right)/2;
        int pivot = arr[midpoint];// Phan tu giua
        //phần tử mô mà nhỏ hơn pivot là ở bên trái pivot
        //mà lớn hơn là bên phải( cái ni là sắp xếp tăng dần
        while (i<=j) {
            while (arr[i]<pivot) {
                i++;// Tang i vi nho hon pivot la duoc roi.
            }
            // Thoat khoi while, ta tim duoc phan tu ma o do, arr[i]> pivot
            // Chuan bi chot de swap

            while (arr[j]>pivot) {
                j--;// Vi on roi nen duyet tiep
            }
            // Thoat khoi while, ta tim duoc phan tu ma o do, arr[j]< pivot
            // Chuan bi chot de swap
            // chu la ca arr[i] va arr[j] deu ko thoa man,
            // Nen ta moi quyet dinh swap han do nghe
            if (i<=j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;// Tra ve index cua partion, chia cach 2 phan de goi de quy tiep
        // Kieu i la chia ra 2 phan, phan nho hon pivot va lon hon pivot
        // Sau do apply de quy, de sort phan nho truoc, vi nho hon, ma da cos sap xep mo.
        //Hieu ko??????
    }
}
