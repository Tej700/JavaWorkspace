package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] studentName;
        studentName = new String[]{"Jin", "Tae", "Suga", "RM", "Jimin"};
        int[] age = new int[]{29, 26, 27, 28, 26};
        String[] studentSubjects = new String[5];
        int i = 1;
        //studentSubjects[0] = "History";
        char[] studentGrade = new char[]{'A', 'B', 'C', 'D', 'E'};
        System.out.println(studentName[0] + ": " + age[0] + " Grade: " + studentGrade[0] + "" + studentSubjects[0]);
        System.out.println(studentName[1] + ": " + age[1] + " Grade: " + studentGrade[1]);
        System.out.println(studentName[2] + ": " + age[2] + " Grade: " + studentGrade[2]);
        System.out.println(studentName[3] + ": " + age[3] + " Grade: " + studentGrade[3]);
        System.out.println(studentName[4] + ": " + age[4] + " Grade: " + studentGrade[4]);
//        while (i <= 10) {
//            System.out.println("*" + i);
//            i++;
//        }
        for (i = 1; i<  5; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print("  "+(j+i)+ " ");
            }
            System.out.println("  "+ " ");
        }
    }
}
