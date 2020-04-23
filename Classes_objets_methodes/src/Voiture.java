public class Voiture {

    int nbrPort  ;
    String nom ;
    boolean auto;
    String coleur ;
    int vitesse ;
    int vitesseV ;
    Moteur moteur ;
    Proprietaire proprietair ;
    Passager pass ;
    Ville vil;
    //void transporter(Passager passagera,Ville villeDeppart){
      //  System.out.println("je transporte un passager qui s'appel : "+pass.nomPassager);
        //System.out.println("le passager est parti de la ville de : "+vil.nomVille);


    //}
Voiture(Moteur moteur){
    this.moteur=moteur;
}
    Ville transporter(Passager passagera,Ville villeDeppart){
        System.out.println("je transporte un passager qui s'appel : "+pass.nomPassager);
        System.out.println("le passager est parti de la ville de : "+vil.nomVille);

        Ville villeDest=new Ville();
        villeDest.nomVille="rabat";
        return villeDest ;
    }

    void accelerer(){
        System.out.println("la voiture de " + nom + " accelere");
    }
    int accelerer2 (int vitesseV){
        this.vitesseV=this.vitesseV+vitesseV;

        return this.vitesseV ;
    }

    void tourner(boolean droite, int angle){

        String direction ;
        if (droite){
             direction ="droite";
        }
        else{
             direction ="gauche";
        }
        System.out.println("la voiture de " + nom + " à tourné à " + direction + " a une anglet de : " + angle);
    }

    int passrapport(boolean pass){

        if (pass){
            vitesse++ ;
        }
        else{
            vitesse--;
        }
        return vitesse ;
    }
}
