package Classwork;

public class ClassArraySort {
    public static void main(String[] args) {
        int[] array = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[i] > array[j - 1]) {
                    int tmp = array[j];
                    array[i] = array[i - 1];
                    array[j - 1] = tmp;
                }
            }
            for (int x : array) {
                System.out.print(x + " ");
            }

            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length - i; k++) {
                    if (array[i] < array[k - 1]) {
                        int tmp = array[k - 1];
                        array[i] = array[i - 1];
                        array[k - 1] = tmp;
                        {
                        }
                        for (int x : array) {
                            System.out.print(x + "");

                        }
                    }
                }

            }
        }
    }


}