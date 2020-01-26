package com.shell.challenges;

 public class StringOperations {


       public String solution(String S) {
            int[] occurrences = new int[26];
            for (char ch : S.toCharArray()) {
                occurrences[ch - 'a']++;
            }

            char best_char = 'a';
            int  best_res  = 0;

            for (int i = 0; i < 26; i++) {
                if(occurrences[i]>1){
                    //if((char)((int)'a' + i) < best_res){
                    best_char = (char)((int)'a' + i);
                    best_res  = occurrences[i];
                    return Character.toString(best_char);
                }
            }

            return Character.toString(best_char);
        }

}
