package com.pluralsight;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private final static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void init(){
        FileHandler fh;
        try{
            fh = new FileHandler("C:/Users/milic/files/JAVA2_fundamentals.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            logger.info("Logger initialized!");

        }catch (Exception e){
            logger.log(Level.WARNING, "Exception: " , e);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        init();
        InputFileReader inputFileReader = new InputFileReader();
        Sorter sorter = new Sorter();
        ResultFileSaver resultFileSaver = new ResultFileSaver();


        int niz[] = inputFileReader.readNewFile();

        System.out.println("Nakon sortiranja quickSort: ");
        sorter.quickSort(niz, 0, niz.length-1);
        System.out.println(Arrays.toString(niz));
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        resultFileSaver.writeFile();

        logger.info("End of program...");
    }
}
