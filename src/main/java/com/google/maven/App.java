package com.google.maven;
import java.io.*;
import com.google.code.externalsorting.ExternalSort;

public class App 
{
    public static void main( String[] args ) throws IOException {

        File inputfile = new File("/Users/luayghazwan/Development/codefellows/501 Java/ExternalSorting/src/main/resources/inputFile.txt");
        File outputfile = new File("/Users/luayghazwan/Development/codefellows/501 Java/ExternalSorting/src/main/resources/outputFile.txt");

        sort(inputfile, outputfile);
    }

    public static void sort(File input, File output) throws IOException {
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(input), output);
    }
}
