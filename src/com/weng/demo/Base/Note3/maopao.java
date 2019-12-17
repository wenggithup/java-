package com.weng.demo.Base.Note3;

public class maopao {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 4, 2, 6, 7, 9, 10, 21, -5};
        int i, j;
        for (i = 0; i < arr.length-1; i++) {
            for (j = 0; j < arr.length-1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int k = 0; k <arr.length-1 ; k++) {
            System.out.print(arr[k]);

        }
        }

}
