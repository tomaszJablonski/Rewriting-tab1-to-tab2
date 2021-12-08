package com.company;

import java.util.Scanner;

/**
 * Użytkowink posiada tablicę int o wymiarze n. Użytkownik podaje wartości całkowite.
 * Jeżeli podamy double -> rzutujemy na int. // *od razu zrobiłem na int bez rzutowania
 * Następnie program tworzą nową tablicę N, do której przepisuje podane wartości w sposób rosnący.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int sizeArray = scan.nextInt();

        int tab1[] = new int[sizeArray];
        int tab2[] = new int[sizeArray];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < sizeArray; i++) {
            tab1[i] = scan.nextInt();
        }
        // wypisuje elementy z tablicy tab 1 do tab 2
        //TODO teraz napisać żeby  wypisywało je rosnąco
        for (int i=0;i<sizeArray;i++) {
            if (tab2[i] <= sizeArray) {
                tab2[i] = tab1[i];
                tab1[i]--;
            }
        }
        for (int i = sizeArray - 1; i>=0 ; i--){
            System.out.println(tab2[i]);
            tab2[i]--;


        }


    }

}
