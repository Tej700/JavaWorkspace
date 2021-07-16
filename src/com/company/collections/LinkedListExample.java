package com.company.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        //Non Generic LinkedList that contain any objects
        List linkedList1 = new LinkedList();
        linkedList1.add("String1");
        linkedList1.add(2);
        linkedList1.add(false);
        System.out.println(linkedList1);
        linkedList1.remove(1);
        System.out.println(linkedList1);
        linkedList1.removeAll(linkedList1);
        System.out.println(linkedList1);

        //Generic LinkedList
        List<String> linkedList2 = new LinkedList<String>();
        linkedList2.add("String1");
        linkedList2.add("String2");
        linkedList2.add("String3");
        System.out.println(linkedList2);
        linkedList2.remove(1);
        System.out.println(linkedList2);
        linkedList2.removeAll(linkedList2);
        System.out.println(linkedList2);

        //Generic LinkedList
        List<String> linkedList3 = new LinkedList<String>();
        linkedList3.add("String4");
        linkedList3.add("String5");
        linkedList3.add("String6");
        System.out.println(linkedList3);
        linkedList3.remove(1);
        System.out.println(linkedList3);
        linkedList3.removeAll(linkedList3);
        System.out.println(linkedList3);
    }

}
