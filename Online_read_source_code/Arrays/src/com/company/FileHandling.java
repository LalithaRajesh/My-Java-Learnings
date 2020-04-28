package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        File f1 = new File("C:/Users/Rajesh/OneDrive/Desktop/Latest_Master_List.csv");
        File f2 = new File("C:/Users/Rajesh/OneDrive/Desktop/cp_metric_noc_20181216150600_60.csv");

        FileReader fR1 = new FileReader(f1);
        FileReader fR2 = new FileReader(f2);
        BufferedReader reader1 = new BufferedReader(fR1);
        BufferedReader reader2 = new BufferedReader(fR2);

        String line1 = null;
        String line2 = "";
        String line3 = null;
        String line4 = "";

        while ((line1 = reader1.readLine()) != null) {
            line2 += line1 + "\n";

        }
        System.out.println(line2);
        while ((line3 = reader2.readLine()) != null) {

            if (reader1["xCP Protocol ID"] == reader2["protocol"]) {
//            if (line2.contains(line3)) {
//                System.out.println(line3 + ":found");
//            } else {
//                System.out.println(line3 + ": Not found");
//            }
        }


    }

}
