package hwork3;

import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        int[] numericArray = {5, 2, 9, 1, 7};

        System.out.println("Original numeric array: " + Arrays.toString(numericArray));

        Arrays.sort(numericArray);

        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        //sorting String Arrays
        String[] stringArray = {"Vishal", "Kartik", "Mukul", "Jagruti", "Beena", "Rupal"};

        System.out.println("Original string array: " + Arrays.toString(stringArray));

        Arrays.sort(stringArray);

        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
