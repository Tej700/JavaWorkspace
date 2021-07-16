package com.company.collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]){
        //ArrayList implements List interface
        //Non Generic arraylist
        List arrayList1 =  new ArrayList();
        arrayList1.add("String1");
        arrayList1.add(3);
        arrayList1.add(false);
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);

        //Non Generic arraylist
        ArrayList arrayList2 =  new ArrayList();
        arrayList2.add("String2");
        arrayList2.add(4);
        arrayList2.add(true);
        System.out.println(arrayList2);
        arrayList2.remove(0);
        System.out.println(arrayList2);

        //Generic ArrayList
        List<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("String1");
        arrayList3.add("String2");
        arrayList3.add("String3");
        System.out.println(arrayList3);
        arrayList3.remove(0);
        System.out.println(arrayList3);

        //Generic ArrayList
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("String4");
        arrayList4.add("String5");
        arrayList4.add("String6");
        System.out.println(arrayList4);
        arrayList4.remove(0);
        System.out.println(arrayList4);

        //Generic ArrayList
        ArrayList<Double> arrayList5 = new ArrayList<Double>();
        arrayList5.add(1.2);
        arrayList5.add(34.2);
        arrayList5.add(1.34);
        System.out.println(arrayList5);
        arrayList5.remove(0);
        System.out.println(arrayList5);

    }
}
