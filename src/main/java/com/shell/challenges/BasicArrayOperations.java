package com.shell.challenges;

import java.sql.SQLOutput;
import java.util.*;

public class BasicArrayOperations {

    public void missingNumber(int[] arr){
        int actualSum=0;
        int calculatedSum = 0;
        for(int i = arr[0] ;i<arr[arr.length-1];i++){
            actualSum+=i;
        }
        for(int i= 0;i< arr.length-1 ;i++){
            calculatedSum+=arr[i];
        }
        System.out.println("Missing number = " + (actualSum - calculatedSum));
    }

    public void duplicateNumber(int[] arr){
        int actualSum=0;
        int calculatedSum = 0;
        for(int i = arr[0] ;i<arr[arr.length-1];i++){
            actualSum+=i;
        }
        for(int i= 0;i< arr.length-1 ;i++){
            calculatedSum+=arr[i];
        }
        System.out.println("Duplicate number = " + (calculatedSum-actualSum));
    }

    public boolean findNumber(int[] arr, int number){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int number){
        int first = 0;
        int last = arr.length;

       while(first <= last){
           int mid =  (last + first) / 2;
           if(arr[mid] == number){
               return true;
           }
           if(number > arr[mid]){
                first = mid;
           }
           if(number < arr[mid]){
               last = mid;
           }
           if(first == last-1){
               return false;
           }

        }
        return false;
    }

    public void smallestAndLargestNumber(int[] arr){
        int smallest = arr[0];
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Smallest Number = "+ smallest);
        System.out.println("Lasrgest Number = "+largest);
    }

    public void sumOfPair(int[] arr,int number){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j) {
                    if (number - arr[i] == arr[j]){
                        System.out.println("Pair = {" + arr[i] + ","+ arr[j]+ "}");
                    }
                }
            }
        }
    }
    public void repeatedNumbers(int[] arr){
        Map<Integer,Integer> numberCount = new LinkedHashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            numberCount.put(arr[i],numberCount.containsKey(arr[i])?numberCount.get(arr[i])+1:1);
        }
        for(Map.Entry<Integer,Integer> count : numberCount.entrySet()){
            if(count.getValue() > 1) {
                System.out.println(count.getKey() + ": " + count.getValue());
            }
        }

    }

    public void removeDuplicatesCollection(int[] arr){
        int k = 0;
        Set<Integer> removedDup = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            removedDup.add(arr[i]);
        }
        for(Integer finalArray : removedDup){
            System.out.println(finalArray.intValue());
        }
    }

    public void removeDuplicates(int[] arr){
        Arrays.sort(arr);
        int[] removedDup = new int[arr.length];
        int k = 0;
        removedDup[k++] = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            removedDup[k++] = arr[i];
        }
        for(int i =0;i<k;i++){
            System.out.println(removedDup[i]);
        }
    }

}
