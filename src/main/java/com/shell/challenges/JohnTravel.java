package com.shell.challenges;

import java.util.*;

public class JohnTravel {

    public void solution(String string) {
        List<String> photos = new ArrayList<String>();
        Map<String, String> namePlace = new HashMap<String, String>();
        List<String> finalPhotos = new ArrayList<String>();
        StringTokenizer strtkn = new StringTokenizer(string, "\n");
        while (strtkn.hasMoreTokens()) {
            photos.add(strtkn.nextToken());
        }

        for (int j = 0; j < photos.size(); j++) {
            String tempV = photos.get(j);
            StringTokenizer strtknComma = new StringTokenizer(tempV, ", ");
            while (strtknComma.hasMoreTokens()) {
                String temp = strtknComma.nextToken();
                strtknComma.hasMoreTokens();
                namePlace.put(temp, strtknComma.nextToken());
                strtknComma.hasMoreTokens();
                strtknComma.nextToken();
            }

    }

        Iterator<Map.Entry<String,String>> iterator = namePlace.entrySet().iterator();
        int count =0;
        String strCount="";
        while(iterator.hasNext()){
            StringTokenizer strtknDot = new StringTokenizer(iterator.next().getKey(),".");
            while(strtknDot.hasMoreTokens()){
                strtknDot.hasMoreTokens();
                strtknDot.nextToken();
                String temp2 = strtknDot.nextToken();
                if(finalPhotos.isEmpty()){
                    count =1;
                    strCount  = String.valueOf(count);
                }
                for(int i =0;i<finalPhotos.size();i++){
                    if(finalPhotos.get(i).substring(0,temp2.length() ).equals(strtknDot.nextToken())){
                        count ++;
                        strCount = "0" + count;
                    }else{

                    }
                }
                strtknDot.hasMoreTokens();
                finalPhotos.add(iterator.next().getValue()+ strCount + "." +temp2);

            }

        }
        String f;
        f = "shelly";
        String str = "";
        for(String finalP : finalPhotos){
             str = str + "\n" + finalP ;
        }

    }
}
