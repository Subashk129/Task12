package com.example;

import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemap {
    
     TreeMap<String, Integer> treeMap = new TreeMap<>();


public void addkeyvaluesToTreeMap(){

    treeMap.put("Raja",04);
    treeMap.put("Arun",06);
    treeMap.put("Subash",03);
    treeMap.put("Dhoni",01);
    treeMap.put("Kala",07);
    treeMap.put("Vijay",02);
    treeMap.put("Bala", 05);

    System.out.println("Employee Names in Alphabetical Order: ");
    for (Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
   
}   
    public static void main(String[] args) {
        Treemap tMap = new Treemap();
        tMap.addkeyvaluesToTreeMap();
}
}
