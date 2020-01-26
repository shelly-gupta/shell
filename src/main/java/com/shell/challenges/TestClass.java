package com.shell.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestClass {
    public static void main(String args[]) throws Exception {


        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());                // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
           // Writing output to STDOUT

        int[] arr = new int[num];
        int j =0;
        StringTokenizer str = new StringTokenizer(name, " ");
        while (str.hasMoreTokens() && j<num) {
            arr[j++] = Integer.parseInt(str.nextToken());
            // Write your code here
        }

        int[] b = arr;
        Arrays.sort(b);
        int neg = 0;
        int post = 0;
        int closestNumberToZero;

        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                neg++;
                post++;
            }
            // if (b[i] == 0) post++;
        }
        --neg;

        if (b[0] >= 0) closestNumberToZero = b[post];
        else {
            if ((b[neg] * -1) < b[post]) {
                closestNumberToZero = (b[neg] * -1);
            } else closestNumberToZero = b[post];
        }
        System.out.println("Closest Number = " + closestNumberToZero);

        // Write your code here

    }
}

