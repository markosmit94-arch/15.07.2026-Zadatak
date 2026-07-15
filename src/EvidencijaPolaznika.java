import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class EvidencijaPolaznika {
    //private static Set<Polaznik> Polaznici = new TreeSet<>(new Provjera());
    //private static Set<Polaznik> Polaznici = new HashSet<>();
    public static void main(String[] args) throws IOException {

        TreeSet<Polaznik> Polaznici = new TreeSet<>(new Provjera());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int brojac=0;
        boolean izbor=true;

        while(izbor) {
            System.out.println("Izaberite opciju:");
            System.out.println("1. Unos polaznika");
            System.out.println("2. Ispis polaznika");
            System.out.println("3. Kraj");
            String opcija=br.readLine();

            switch(opcija) {
                case "1":
                    System.out.println("Ime polaznika: ");
                    String ime = br.readLine();
                    System.out.println("Prezime polaznika: ");
                    String prezime = br.readLine();
                    System.out.println("Email polaznika: ");
                    String email = br.readLine();

                    for (Polaznik polaznik : Polaznici) {
                        if(email.equals(polaznik.getEmail())) {
                            System.out.println("Polaznik vec postoji.");
                            brojac++;
                        }
                    }

                    if(brojac==0){
                        Polaznici.add(new Polaznik(ime, prezime, email));
                        System.out.println("Unos uspjesan.");
                    }
                    brojac=0;
                    break;

                case "2":
                    System.out.println("Ispis polaznika: ");
                    for (Polaznik polaznik : Polaznici) {
                        System.out.println(polaznik);
                    }
                    break;

                case "3":
                    izbor=false;
                    break;
            }
        }
    }
}
