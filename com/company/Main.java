package com.company;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {3, 56, 98, 23, 102};
        FindObjectInArray objectInArray = new FindObjectInArray(numbers);
        boolean check;
        // Chot thoi diem bat dau tim kiem
        long start = System.nanoTime();
        check = objectInArray.contains(numbers, 1029);
        long end = System.nanoTime();
        // Chot thoi diem ket thuc tiem kiem
        long duration = end-start;
        System.out.println("TIme of execution is "+ duration +"nanotimes");
    }
    public static class FindObjectInArray {
        private int[] myArrays;

        public FindObjectInArray() {
        }

        public FindObjectInArray(int[] myArrays) {
            this.myArrays = myArrays;
        }

        // Muon tim 1 value no co nam trong danh sach myArrays
        public boolean contains(int[] myArrays, int value) {
            for (int i = 0; i < myArrays.length; i++) {
                if (myArrays[i] == value) {
                    return true;
                }

            }
            return false;
        }
    }
}

