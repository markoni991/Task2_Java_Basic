package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ResultFileSaver {

    InputFileReader inputFileReader = new InputFileReader();
    Sorter sorter = new Sorter();

    public void writeFile(){

        try{
            FileWriter fileWriter = new FileWriter("result.txt");

            int niz[] = inputFileReader.readNewFile();
            sorter.quickSort(niz, 0, niz.length-1);

            fileWriter.write(Arrays.toString(niz));


            fileWriter.close();
            System.out.println("Rezultat je uspesno sacuvan!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
