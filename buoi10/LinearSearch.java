package buoi10;

public class LinearSearch {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int foundIndex = linearSearch(intArray, -15);
        if (foundIndex != -1) {
            System.out.println("We found the value at : " + foundIndex);
        } else {
            System.out.println("Not found");
        }
    }
    private static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
