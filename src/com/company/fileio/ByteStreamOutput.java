package com.company.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamOutput {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("/JavaWorkspace/src/com/company/fileio/input.txt");
            out = new FileWriter("/JavaWorkspace/src/com/company/fileio/output.txt");
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
