package com.example;

import java.util.ArrayList;

public class ListToArray {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");

        System.out.println("list contents:" +list);
        String[] myArray = new String[list.size()];
        list.toArray(myArray);

        for(int i=0; i<myArray.length; i++){

            System.out.println("Element at the index "+i+" is :"+myArray[i]);
        }
        
    }
    
}
