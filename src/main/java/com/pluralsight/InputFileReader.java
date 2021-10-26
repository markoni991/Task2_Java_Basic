package com.pluralsight;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class InputFileReader {

    public int[] readNewFile() {

        System.out.println("Podaci iz fajla: ");
        File fajl = new File("C:/Users/milic/Files/input.txt");

        try {
            byte niz[] = new byte[(int) fajl.length()];
            FileInputStream fis = new FileInputStream(fajl);
            fis.read(niz);
            fis.close();
            String[] vrednosti = new String(niz).trim().split(", ");
            int noviNiz[] = new int[vrednosti.length];

            for (int i = 0; i < vrednosti.length; i++) {
                noviNiz[i] = Integer.parseInt(vrednosti[i]);
            }
            System.out.println(Arrays.toString(noviNiz));
            return noviNiz;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return readNewFile();
    }
}