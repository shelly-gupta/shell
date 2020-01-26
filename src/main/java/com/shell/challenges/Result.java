package com.shell.challenges;

import java.util.*;

public class Result {

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */

    public static int countPairs(List<Integer> numbers, int k) {

        Set<Integer> set = new HashSet<Integer>();

        for (Integer list : numbers) {

            set.add(list);
        }
        Integer[] array1 = new Integer[set.size()];

        set.toArray(array1);
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i] + k == array1[j]) {
                    count++;
                    System.out.println("{" + array1[i] + "," + array1[j] + "}");
                }
            }
        }

        /*for(Integer setResult : set){
            set.iterator().next();
        }*/
        return count;
    }

    public static int countHoles(int number) {
        number = 630;
        String strNumber = String.valueOf(number);
        int count = 0;
        /*StringTokenizer stringTokenizer = new StringTokenizer(strNumber);
        while (stringTokenizer.hasMoreTokens()) {*/
        while (number > 0) {
            count += indHoles(number % 10);
            number = number / 10;
        }
        //}
        System.out.println("Holes= " + count);
        return count;
    }

    public static int indHoles(int number) {
        switch (number) {
            case 0:
                return 1;

            case 1:
                return 0;

            case 2:
                return 0;

            case 3:
                return 0;

            case 4:
                return 1;

            case 5:
                return 0;

            case 6:
                return 1;

            case 7:
                return 0;

            case 8:
                return 2;

            case 9:
                return 1;


        }
        return 0;

    }

    public static int countNonUnique(List<Integer> numbers) {
   /*     Set<Integer> set = new HashSet<Integer>();
int count = 0;
        for (Integer list : numbers) {

            if(set.add(list)==false){

                count++;
            }
        }
        return count;*/
        int dupCount = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer n : numbers) {
            Integer count = map.get(n);
            if (count == null) {
                map.put(n, 1);
            } else {
                map.put(n, ++count);
            }
        }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    dupCount++;
                }
            }


        System.out.println("dupCount="+dupCount);
        return dupCount;

    }

    public static void updateList(List<Integer> list) {


       /* ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            if(it.hasNext()) {
                if (it.next() < it.previous() && it.next() < (it.hasNext() ? it.next() : 0)) {
                    it.remove();
                }

            }
        }*/
        List<Integer> resultList = new ArrayList<Integer>();
        //resultList.add(list.get(0));
        resultList.addAll(list);
        while (true) {
            for (int i = 1; i < list.size(); i++) {
                if (i + 1 < list.size()) {
                    if (list.get(i) < list.get(i + 1) && list.get(i) < list.get(i - 1)) {
                        resultList.remove(list.get(i));
                    }
                }
            }
            List<Integer> anotherList = new ArrayList<Integer>();
            anotherList.addAll(resultList);
            Collections.sort(resultList);
            if (anotherList.equals(resultList)) {
                System.out.println("Sorted!");
                list.clear();
                list.addAll(anotherList);
                for (Integer printlist : anotherList) {
                    System.out.println(printlist);
                }
                return;
            } else {
                list.clear();
                list.addAll(anotherList);
            }

        }


    }

}