package com.personal.gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ApacheLogTop10 {
    public static void main(String[] args) {
        String s[] = {"192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /abc HTTP/1.1\" 404 201",
                      "192.168.1.2 - - [17/Sep/2013:22:18:19 -0700] \"GET /favicon.ico HTTP/1.1\" 200 1406",
                      "192.168.1.3 - - [17/Sep/2013:22:18:27 -0700] \"GET /wp/wp-content/themes/twentytwelve/js/navigation.js?ver=1.0 HTTP/1.1\" 200 863"};
        top10(s);
    }

    private static void top10(String[] logs) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String log: logs){
            String s1[] = log.split(" ");
            map.put(s1[0],map.getOrDefault(s1[0],0)+1);
        }
        System.out.println(map);
        int freq=0;
        String freqIp = "";
        for(Entry<String, Integer> e: map.entrySet()){
            if(e.getValue()>freq){
                freq = e.getValue();
                freqIp = e.getKey();
            }
        }
        System.out.println("Freq Ip:"+freqIp);
    }
}
