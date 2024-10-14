package ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File(  "judete_in.txt"));

    String[] judete = new String[42];
    int i = 0;
    while(sc.hasNext()) {
        judete[i] = sc.nextLine();
        i++;
    }
    Arrays.sort(judete);
    Scanner sc1=new Scanner(System.in);
    System.out.println("Introduceti judetul cautat: ");
    String judet = sc1.nextLine();
    int index = Arrays.binarySearch(judete, judet);
    if(index >= 0) {
        System.out.println("Judetul " + judet + " a fost gasit pe pozitia " + index);
    } else {
        System.out.println("Judetul " + judet + " nu a fost gasit");
    }
    sc.close();
}
}
