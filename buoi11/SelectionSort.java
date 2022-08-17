package buoi11;

public class SelectionSort {
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "    ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Before: ");
        printArray(intArray);
//        selectionSort(intArray);
//        printArray(intArray);
    }

    private static void selectionSort(int[] intArray) {
        // Cho ni tim vi tri cua Hoa hau
        int lastIndex = intArray.length - 1;
        // Di 1 vong lap for, the hien cac vi tri index cua hoa hoa tinh tu ben phai
        // 6...5...4...3... kieu rua
        for (int lastUnsortedIndex = lastIndex; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // Chot dau tien la so 6.
            // Gia su coi largest la 20, index=0
            int largest = 0;
            // Di tu 1, di tu 35
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                // Neu tim duoc phan tu lon nhat, lon hon largest thi largest truyen ngoi
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            // Ket thuc vong nay, ta CHON ( nen moi goi la sap xep chon)
            // Chon duoc phan tu lon nhat.
            // Gan phan tu lon nhat do cho lastUnsortedIndex(// Chot dau tien la so index= 6.
            swap(intArray, largest, lastUnsortedIndex);

        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
