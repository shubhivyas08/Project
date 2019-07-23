package com.amdocs.training;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/train/eclipse-workspace/MyTraining/src/com/amdocs/training/inputfile.txt");
            out = new FileOutputStream("/home/train/eclipse-workspace/MyTraining/src/com/amdocs/training/outputfile.txt");
            int c;

            while ((c = in.read()) != -1) {       
                out.write(c);
            }
            System.out.println("succesful");     
        }
        catch(Exception e)
        {
        	System.out.println("first create file please");
        }
       
        	
        	finally {
        
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
