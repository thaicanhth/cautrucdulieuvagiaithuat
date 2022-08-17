//package demo2;
//
//public class Main {
//    public static void printArray(Fruit arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println("");
//    }
//    public static void quickSortByCode(Fruit arr[], int left, int right){
//        if (left >= right){
//            return;
//        } else {
//            int index = partition(arr, left, right);
//            if (left < index - 1){
//                quickSortByCode(arr, left, index - 1);
//            }
//            if (index < right){
//                quickSortByCode(arr, index, right);
//            }
//        }
//    }
//    public static void quickSortByPrice(Fruit arr[], int left, int right){
//        if (left >= right){
//            return;
//        } else {
//            int index = partitionByPrice(arr, left, right);
//            if (left < index - 1){
//                quickSortByPrice(arr, left, index - 1);
//            }
//            if (index < right){
//                quickSortByPrice(arr, index, right);
//            }
//        }
//    }
//
//    public static int partition(Fruit arr[], int left, int right) {
//        int i = left, j = right;
//        Fruit pivot = arr[(left + right) / 2];
//        while (i <= j) {
//            while (arr[i].getCode() < pivot.getCode()) {
//                i++;
//            }
//            while (arr[j].getCode() > pivot.getCode()) {
//                j--;
//            }
//            if (i <= j) {
//                swap(arr, i, j);
//                i++;
//                j--;
//            }
//        }
//        return i;
//    }
//    public static void swap(Fruit[] array, int i, int j){
//        if (i == j){
//            return;
//        }
//        Fruit temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
//    public static void main(String[] args) {
//        Fruit[] myFruits = new Fruit[5];
//        myFruits[0] = new Fruit(111, "Apple", "DaLat", 10);
//        myFruits[1] = new Fruit(333, "Mango", "DaLat", 8);
//        myFruits[2] = new Fruit(555, "Pear", "HoChiMinh", 15);
//        myFruits[3] = new Fruit(666, "Banana", "HaNoi", 3);
//        myFruits[4] = new Fruit(777, "Lemon", "DaNang", 10);
//        printArray(myFruits);
//        quickSortByCode(myFruits, 0, myFruits.length -1);
//        System.out.println("=======================");
//        printArray(myFruits);
//    }
//}
