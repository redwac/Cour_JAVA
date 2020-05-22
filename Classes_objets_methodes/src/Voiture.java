

public class Voiture extends Vehicule implements Videngeable {

    TypeBoitVitesse typB;
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
    // supe est conseiller pour rappeler le onstructeur par defaut de la classe mère
    Voiture(){
        super();
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

    @Override
    public void videnger() {
        System.out.println("devisser le bouchon et attend que ca coule ");
    }

    @Override
    void klaxoner() {
        System.out.println("tuuutuuu!!!!!");

    }
}
