package com.shell.challenges;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BasicStringOperations {

    public void firstNonRepeatingChar(String s) {

        Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.containsKey(s.charAt(i)) ? charCount.get(s.charAt(i))+1 : 1);
        }


        for (Map.Entry<Character,Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }

        }
    }
}
