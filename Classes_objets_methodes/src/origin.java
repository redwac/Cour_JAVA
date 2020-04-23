public class origin {
    public static void main(String[] args){

        Voiture reda = new Voiture();
        reda.nom="Reda";
        reda.nbrPort= 2 ;
        reda.coleur="rouge";

        Voiture mohcine = new Voiture();
        mohcine.nbrPort=4;
        mohcine.nom="mohcine";
        mohcine.coleur="verte";

        Moteur moteur1= new Moteur();
        moteur1.carbuant="Diesel";
        moteur1.cylindre=6;
        mohcine.moteur=moteur1;

        Proprietaire p1 = new Proprietaire();
        p1.NomP="hicham";
        mohcine.proprietair=p1;
        reda.proprietair=p1;

        Passager pass1=new Passager();
        pass1.nomPassager="yazid";
        reda.pass=pass1;


        Ville rabat=new Ville();
        rabat.nomVille="casablanca";
        reda.vil=rabat;
        Ville destination= reda.transporter(pass1,rabat);
        System.out.println("le passager arrive à :"+destination.nomVille);


        System.out.println("le proprietaire de la voiture de : "+mohcine.nom+" est : "+p1.NomP);
        System.out.println("le proprietaire de la voiture de : "+reda.nom+" est : "+p1.NomP);

        System.out.println("le nombre de cylindre de mohcine est : "+mohcine.moteur.cylindre);

        // reda.accelerer2();  n'affiche pas le return de la methode
        // System.out.println(reda.accelerer2());  affiche le return de la methode
        reda.tourner(true,45);
        System.out.println("la vitesse de la voiture de " + reda.nom + " a une vitesse de " + reda.passrapport(true));

        System.out.println("la vitesse de voiture est : "+reda.accelerer2(100));



    }
}
