package com.pluralsight;

public class Sorter {

    public void quickSort(int niz[], int l, int d) {

        int sredina = (l + d) / 2;
        int i = l;
        int j = d;
        int pivot = niz[sredina];

        while (i <= j) {

            while (pivot > niz[i]) {
                i++;
            }
            while (pivot < niz[j]) {
                j--;
            }
            if (i <= j) {
                int temp = niz[i];
                niz[i] = niz[j];
                niz[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j) {
            quickSort(niz, l, j);
        }
        if (d > i) {
            quickSort(niz, d, i);
        }
    }

    public void BubbleSort(int niz[]){

        int i, j, temp;
        for  (i=niz.length-1; i>0; i--){
            for(j=0; j<i; j++){
                if(niz[j] > niz[j+1]){
                    temp = niz[j];
                    niz[j] = niz[j+1];
                    niz[j+1] = temp;
                }
            }
        }
    }
}
