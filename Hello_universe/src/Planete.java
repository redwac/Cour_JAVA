public class Planete {
    String nomP ;
    String mariereP ;
    long diametreP ;
    int nbrH ;
    Vesseau vesseauA ;
    static int nombreplanette;
    Planete(){
        nombreplanette++;
    }
    public static String forme="SPHERE";

     static String expansion(double distance){
        if(distance<14){
            System.out.println("c'est tres rappide");
        }

           // return "ohhh c'est plus rappide que la vitesse de la lumiere ";
        else {
         return "ohhh c'est plus rappide que la vitesse de la lumiere"; }return "";
     }

       // else {
            //return "oh la c'est plus rapide que la lumiere";
       // }




    void revolution(){
        System.out.println("je suis la planete " + nomP + "je tourne autour de mon etoile");
    }
    void retation(){
        System.out.println("je suis la planete " + nomP + "je tourne sur moi meme");
    }
    void acceuillirVesseau(Vesseau vesseau) {
        nbrH = nbrH + vesseau.nbrPassager;
        vesseauA = vesseau;
        if (vesseauA == null) {
            System.out.println("aucun vesseau ne s'en va");
        }
        else {
            System.out.println("un vesseau de type :" + vesseauA.TypV + " doit s'en aller");
        }


    }

}
