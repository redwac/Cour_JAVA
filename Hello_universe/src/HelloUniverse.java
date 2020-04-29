import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {


        Vaisseau fregat = new VaisseauDeGuerre("fregat");

        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        Vaisseau cargo = new VaisseauDeGuerre("CARGO");
        Vaisseau veasseauMonde = new VaisseauDeGuerre("Terre");

        Scanner sc=new Scanner(System.in);
        System.out.println("quel vaisseau choisissez vous ? ");
        String vaisseauChoisi=sc.nextLine();
        System.out.println("sur quel planete ? ");
        String planeteChoisi=sc.nextLine();
        System.out.println("quel tonnage ? ");
        int tonnageChoisi=sc.nextInt();

        Vaisseau vaisseau=null;
        switch (vaisseauChoisi){
            case "fregat":
                vaisseau=fregat;
            break;
            case "chasseur":
                vaisseau=chasseur;
                break;
            case "cargo":
                vaisseau=cargo;
                break;
        }
        PlaneteTellurique planeteC=null;
        switch (planeteChoisi){
            case "mars":
                vaisseau=cargo;
                break;
            case "uranus":
                vaisseau=cargo;
                break;
        }
        Planete.accueillirVaisseau(vaisseau);


    int i3=Integer.parseInt(String.valueOf(5));
    String s4=String.valueOf(i3);




    }

}