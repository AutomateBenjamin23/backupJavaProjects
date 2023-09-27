package FileHandling;

import java.io.*;

public class FileCopy {

    //File handling - 1:
    //Copy a File (pdf) and create a different file in the same location
    //@param arg

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\"C:\\Users\\pride\\Downloads\\ebay-label-41fa909f-07a9-48fe-a1f8-dda77e85b274 (1).pdf\"");
        File opfile = new File("\"C:\\Users\\pride\\Downloads\\ebay-label-41fa909f-07a9-48fe-a1f8-dda77e85b274 (1)-copy.pdf\"");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(opfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int i = 0;
        try {
            while ((i = fileInputStream.read())!=-1) {
                fileOutputStream.write(i);
        }
            } catch (IOException e) {
                e.printStackTrace();
            }
        finally {
            //close the streams:
            if (fileInputStream !=null){
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        }

    }

