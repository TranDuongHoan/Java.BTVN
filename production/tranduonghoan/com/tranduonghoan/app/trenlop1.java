package com.tranduonghoan.app;

import java.util.Scanner;

public class trenlop1 {
    public static void main(String[] args) {

        int[] intArray = {1,3,4,5,6,6};
        int[] newArr = new int[intArray.length];

        for (int i=0; i<intArray.length; i++) {
            if(intArray[i] % 2 == 0) {
                newArr[i] = intArray[i] + 1;
            }
            else{
                newArr[i] = intArray[i];
            }

        }
        for (int i=0; i<intArray.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
