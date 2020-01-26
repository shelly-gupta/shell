import com.shell.challenges.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) throws Exception{




/*
        int[][] arr = {{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,-5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};

        TwoDArrayOperations twoDArrayOperations = new TwoDArrayOperations();
        int result = twoDArrayOperations.hourglassSum(arr);
        System.out.println(result);
        Rotation rotation = new Rotation();
        int[] array = {1,2,3,4,5,6,7,8,9,11,12,13,14};
        int[] rotatedArray = rotation.leftRotation(array, 4);
        if(rotatedArray!=null) {
            for (int k = 0; k < rotatedArray.length; k++) {
                System.out.println(rotatedArray[k]);
            }
        }


        BasicArrayOperations basicArrayOperations = new BasicArrayOperations();
        basicArrayOperations.missingNumber(array);

        int[] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        basicArrayOperations.duplicateNumber(array2);

        System.out.println("Linear Search=" + basicArrayOperations.findNumber(array2,3));

        System.out.println("Binary Search=" + basicArrayOperations.binarySearch(array2,2));

        int[] array3 = {11,12,13,14,5,6,7,8,3,10,11,12,13,14};
         basicArrayOperations.smallestAndLargestNumber(array3);
        basicArrayOperations.sumOfPair(array,8);

        BasicStringOperations basicStringOperations = new BasicStringOperations();
        basicStringOperations.firstNonRepeatingChar("shelly");

        basicArrayOperations.repeatedNumbers(array3);
        basicArrayOperations.removeDuplicates(array3);

        Result result1 = new Result();*/
       /* List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);
        list.add(4);
        list.add(20);
        list.add(60);
        Result.countPairs(list,1);
Result.countHoles(630);
Result.countNonUnique(list);
Result.updateList(list);*/

        /*StringOperations stringOperations = new StringOperations();

        System.out.println(stringOperations.solution("llaa"));
      JohnTravel johnTravel = new JohnTravel();
      johnTravel.solution("photo.jpg, Warsaw, 2013-09-05\n" +
              "john.jpg, London, 2013-09-05\n" +
              "a.png, Warsaw, 2013-09-05\n");*/



        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(0);
        list.add(5);
        list.add(30);
        list.add(0);
        list.add(20);
        list.add(60);

        System.out.println("Count of zeroes = " + list.stream().filter(a -> a==0).count());

    }
}
