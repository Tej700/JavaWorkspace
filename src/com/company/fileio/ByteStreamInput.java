package com.company.fileio;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ByteStreamInput {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader in = null;
        try {
            in = new FileReader("/JavaWorkspace/src/com/company/fileio/input.txt");
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
