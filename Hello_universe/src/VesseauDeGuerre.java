public class VesseauDeGuerre extends Vesseau{

    void attaque(Vesseau vesseauattaque,String materierle, int duree){
        System.out.println("un vesseau de type : "+typV+"  attque un vesseau de type"+vesseauattaque.typV+"en utilisant l'arme "+materierle+" pendant "+duree+" Minute");
        vesseauattaque.resistanceDeBuclier=0;
        vesseauattaque.blindage=vesseauattaque.blindage/2;
    }
}
