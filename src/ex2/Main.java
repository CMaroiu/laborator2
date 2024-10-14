package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import ex2.Vers;


    public class Main
    {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner sc=new Scanner(new File("cantec_in.txt"));
            PrintStream pot=new PrintStream("cantec_out.txt");
            Vers[] versuri=new Vers[100];
            int i=0;
            while(sc.hasNext()){
                versuri[i]=new Vers();
                //System.out.println(sc.nextLine());
                versuri[i].setVers(sc.nextLine());
                i++;
            }

            Scanner sc1=new Scanner(System.in);
            String a=sc1.nextLine();
            for(int j=0;j<i;j++){
                if(versuri[j].gruplit(a)==true){
                    if(versuri[j].issmaller()==true)
                        pot.println(versuri[j].getVers().toUpperCase() +" "+versuri[j].numarCuvinte()+" cuvinte "+versuri[j].numarVocale()+" vocale"+" *");
                    else
                        pot.println(versuri[j].getVers() +" "+versuri[j].numarCuvinte()+" cuvinte "+versuri[j].numarVocale()+" vocale"+" *");
                }
                else {
                    if(versuri[j].issmaller()==true)
                        pot.println(versuri[j].getVers().toUpperCase() +" "+versuri[j].numarCuvinte()+" cuvinte "+versuri[j].numarVocale()+" vocale");
                    else
                        pot.println(versuri[j].getVers() +" "+versuri[j].numarCuvinte()+" cuvinte "+versuri[j].numarVocale()+" vocale");
                }
            }

            pot.close();
            sc.close();

        }
    }