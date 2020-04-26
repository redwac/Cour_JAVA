import org.w3c.dom.ls.LSOutput;

public class Voiture extends Vehicule{
    int nbrPort = 4;
    boolean auto;
    String coleur ;
    int vitesse ;
    static int nbroue=4;
    int nbrou2;
    Voiture(){
        System.out.println("la voiture est encoure de construction");
    }
    Voiture(String coleur){
        this.coleur=coleur;
        System.out.println("la vcouleur de la voiture est :"+this.coleur);
    }
    Voiture(Moteur coleur){
        this.coleur=coleur;
        System.out.println("la vcouleur de la voiture est :"+this.coleur);
    }
    Voiture(int nbrou2){
        this.nbrou2=nbrou2;
        System.out.println("le nombre de roues est : "+nbrou2);
    }
    static void klaxonner(){
        System.out.println("tuuuuuuutuuuuuutuuuuu!!!!!");
    }
    int accelerer(){
        System.out.println("j'accelère");
        return 5;
    }
    int rapportC(boolean b){
        if (b){
            vitesse++ ;
        }
        else {
            vitesse-- ;
        }
        return vitesse;
    }
    static void tourner(boolean droite,int anglet){
        String direction = null;
        if(droite){
            direction="droite";
        }
        else {
            direction="gauche";
        }
        System.out.println("la voiture est tourné à " + direction + " d'une anglet de : " + anglet);
    }

}
