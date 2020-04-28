package com.company;

//Find the size of a specified file

import java.io.File;

public class Ex30_Find_the_size_of_specified_file {
    public static void main(String[] args) {
        System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
    }
}
