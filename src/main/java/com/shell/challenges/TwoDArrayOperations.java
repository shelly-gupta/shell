package com.shell.challenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TwoDArrayOperations {

    public int hourglassSum(int[][] arr) {


        for (int i = 0; i < arr[0].length; i++) {


            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
        int sum = 0;
        int[] sumArr = new int[(arr[0].length-2 ) * (arr[1].length-2) ];
        int k = 0;
        for(int i=0;i<arr[0].length-2;i++){
            for(int j=0;j<arr[1].length-2;j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum = sum + arr[i+1][j+1];
                sum = sum + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                sumArr[k++] = sum;

                System.out.println(sumArr[k-1]);
            }
        }
        int largest = sumArr[0];
        for(int i=1;i<sumArr.length;i++){

            if(sumArr[i]>largest){

                largest = sumArr[i];
            }
        }
        return largest;

    }

}
