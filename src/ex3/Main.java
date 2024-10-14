package ex3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Sirul este:");
        String original = scanner.nextLine();

        System.out.println("Sirul de inserat este");
        String toInsert = scanner.nextLine();

        System.out.println("Pozitia: ");
        int insertPosition = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pozitia pentru stergere:");
        int deletePosition = scanner.nextInt();

        System.out.println("Numarul de caractere pentru stergere:");
        int deleteCount = scanner.nextInt();

        StringBuilder sb = new StringBuilder(original);

        sb.insert(insertPosition, toInsert);
        sb.delete(deletePosition, deletePosition + deleteCount);

        System.out.println("Stringul modificat: " + sb.toString());
        scanner.close();
    }
}
