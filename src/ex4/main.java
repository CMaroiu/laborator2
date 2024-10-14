package ex4;

import java.util.Scanner;
import ex4.Persoana;
import java.time.LocalDate;
import java.util.Scanner;


    public class main {
        public static boolean verifCNP(String cnp) {
            long x, s = 0;
            int[] c = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
            int k = 11;
            if (cnp.length() != 13) {
                System.out.println("leng");
                return false;
            }
            if (!cnp.matches("[0-9]+")) {
                System.out.println("nr");
                return false;
            }
            if (!cnp.substring(0, 1).equals("1") && !cnp.substring(0, 1).equals("2") && !cnp.substring(0, 1).equals("5") && !cnp.substring(0, 1).equals("6")) {
                System.out.printf("prima");
                return false;
            }
            x = Long.parseLong(cnp.substring(0, 12));
            while (x != 0) {
                s = s + (c[k] * (x % 10));
                k--;
                x /= 10;
            }

            if (s % 11 == 10) {
                s = 1;
            } else {
                s = s % 11;
            }
            if (!cnp.substring(12, 13).equals(String.valueOf(s))) {
                System.out.println("ultima");
                return false;
            }
            return true;

        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Persoana[] v = new Persoana[n];
            String CNP;
            String Nume;
            for (int i = 0; i < n; i++) {
                System.out.printf("cnp="); CNP= sc.next();

                if (verifCNP(CNP)==false) {
                    System.out.printf("CNP INCORECT\n");
                    i--;
                    continue;
                }
                System.out.printf("nume=");Nume = sc.next();

                v[i] = new Persoana(Nume, CNP);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(v[i]._name + " " + v[i]._cnp + " " + v[i].getVarsta());
            }
        }
    }

