package com.company.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharacterStreamInput {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        try {
            in = new FileInputStream("/JavaWorkspace/src/com/company/fileio/input.txt");
            int i = 0;
            //while loop
            while ((i = in.read()) != -1) {
                System.out.print((char)i);
            }
        } finally {

            if(in != null){
                in.close();
            }
        }
    }
}
