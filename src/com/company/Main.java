package com.company;

import java.awt.image.PackedColorModel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
      ArrayList<Integer>  myNumb = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,}));
    doubleNumber(myNumb);
        System.out.println(doubleNumber(myNumb));

        ArrayList<Integer>  arrOfNums = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,5,6,}));
        System.out.println(multiplyNumbers(arrOfNums,4));

        System.out.println(doubleLetters("blah"));

        ArrayList<String>arr1 = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        ArrayList<String>arr2 = new ArrayList<String>(Arrays.asList("d", "e", "f"));
        System.out.println(interleave(arr1,arr2));

//        ArrayList<String>str1 = new ArrayList<String>(Arrays.asList("Blah"));
        System.out.println(createRange("blah",2));

    }

        public static ArrayList<Integer> doubleNumber(ArrayList<Integer>myNumb){

            ArrayList<Integer> acc = new ArrayList<Integer>();
            for(int i = 0; i < myNumb.size();i ++) {
                acc.add(myNumb.get(i)*2);
            }
            return acc;
        }
    public static ArrayList<Integer> multiplyNumbers(ArrayList<Integer> arrOfNums, int multiplyBy) {
        ArrayList<Integer> acc = new ArrayList<Integer>();

        for(int i = 0; i < arrOfNums.size(); i++){
            acc.add(arrOfNums.get(i)* multiplyBy);
        }
        return acc;
    }

    public static String doubleLetters(String str) {
        String newString = "";
        for(int i = 0; i < str.length(); i++) {
            newString += str.charAt(i);
            newString += str.charAt(i);

        }
        return newString;
    }
//
    public static ArrayList<String> interleave(ArrayList<String> arr1, ArrayList<String> arr2) {

        ArrayList<String> acc = new ArrayList<String>();
        for(int i = 0; i <  arr1.size(); i++) {
            acc.add(arr1.get(i));
            acc.add(arr2.get(i));
        }
        return acc;
    }
//
    public static ArrayList<String> createRange(String str, int numberOfTimes) {
        ArrayList<String> acc = new ArrayList<String>();
        for(int i = 0; i <  numberOfTimes; i++){
            acc.add(str);
        }
    return acc;

    }
//
//    public static HashMap<String, Integer> flipArray(ArrayList<String> arrOfStr) {
//
//    }
    }
