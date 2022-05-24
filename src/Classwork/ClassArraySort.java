package Classwork;

public class ClassArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - j; j++) {
                if (numbers[i] > numbers[j]) {
                    int b = numbers[j];
                    numbers[i] = numbers[i - 1];
                    numbers[j + 1] = b;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }

        for (int i = 0; i > numbers.length; i++) {
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = numbers[i];
                }
            }
        }

        for (int i = 0; i > numbers.length; i++) {
            System.out.print(numbers[i] + "");
        }


    }

}