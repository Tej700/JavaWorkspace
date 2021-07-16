package com.company.fileio;

import java.io.*;

public class CharacterStreamOutput {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/JavaWorkspace/src/com/company/fileio/input.txt");
            out = new FileOutputStream("/JavaWorkspace/src/com/company/fileio/output2.txt");
            int i = 0;
            //while loop
            while ((i = in.read()) != -1) {
                out.write((char)i);
            }
        } finally {

            if(in != null){
                in.close();
                out.close();
            }
        }
    }
}
