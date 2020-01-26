package com.shell.challenges;

public class Rotation {
    public int[] leftRotation(int[] arr,int n){
        if(n>arr.length || n<0){
            return null;
        }
        int[] rotatedArray = new int[arr.length];
        int j =0;
        for(int i=0;i<n;i++){
             j = arr.length -n +i;
             rotatedArray[j] = arr[i];
        }
        int l = 0;
        for(int i=n;i<arr.length;i++){
            rotatedArray[l++] = arr[i];
        }
        return rotatedArray;
    }
}
