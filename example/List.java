package com.example;

import java.util.ArrayList;

public class List {

    ArrayList<String> arraylist = new ArrayList<>();


public void addElementstoArray(){

    arraylist.add("sunday");
    arraylist.add("Monday");
    arraylist.add("Wednesday");
    arraylist.add("Thursday");
    arraylist.add("Friday");
    arraylist.add("saturday");
    arraylist.add("Tuesday");
    
    System.out.println("Length of ArrayList is: "+ arraylist.size());
    System.out.println("After removing: "+ arraylist.removeAll(arraylist));
}    


public static void main(String[] args) {
    
    List obj = new List();
    obj.addElementstoArray();

}
    
}
