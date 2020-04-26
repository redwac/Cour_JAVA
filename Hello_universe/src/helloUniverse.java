public class helloUniverse {

    public static void main(String... args){


        System.out.println(Planete.expansion(10.2d));
        System.out.println(Planete.expansion(14.2d));
        Planete soleil = new Planete();
        soleil.nomP="solei";
        soleil.mariereP="gazeuse";
        soleil.diametreP=1391000l;
        Planete mars = new Planete();
        mars.nomP="mars";
        mars.mariereP="tellurique";
        mars.diametreP=	6792l;
        Vesseau nouveauVesseau = new Vesseau();
        nouveauVesseau.typV="fraget";
        nouveauVesseau.nbrPassager=9;
        mars.acceuillirVesseau(nouveauVesseau);

        Vesseau autreVeseau = new Vesseau();
        autreVeseau.typV="croiseur";
        autreVeseau.nbrPassager=42;
        mars.acceuillirVesseau(autreVeseau);
        System.out.println("le nombre des habittant est : "+ mars.vesseauA.nbrPassager);

        Planete jupiter = new Planete();
        jupiter.nomP="JUPITER";
        jupiter.mariereP="gazeuse";
        jupiter.diametreP=	142984;
        Planete saturne = new Planete();
        saturne.nomP="saturne";
        saturne.mariereP="gazeuse";
        saturne.diametreP= 120536l;


        mars.revolution();
        saturne.retation();

        System.out.println("le nom du planete 1 est : " + soleil.nomP + "matire du planete est ; " + soleil.mariereP + " le diametre du planete est : " + soleil.diametreP);



        System.out.println("hello universe");
        int nbrPlanet = 9;

        String c1 = "le nombre de planetes dans le systeme solaire et de : ";
        System.out.println(c1 + nbrPlanet );
        nbrPlanet-- ;
        if (nbrPlanet == 8){
            c1="i l ya quelque années le nombre est changer : maintenant il est :";
            System.out.println(c1 + nbrPlanet );
        }
        System.out.println("la forme de tous les planetes est : "+Planete.forme);
        System.out.println("la forme de mars est :"+ mars.forme);
        System.out.println("le nombre des planette est : "+Planete.nombreplanette);

        VesseauDeGuerre chasseur=new VesseauDeGuerre();
        chasseur.blindage=156;
        chasseur.resistanceDeBuclier=2;
        chasseur.typV="CHASSEUR";

        VesseauCivil vesseauMonde=new VesseauCivil();
        vesseauMonde.blindage=4784;
        vesseauMonde.resistanceDeBuclier=30;
        vesseauMonde.typV="Vesseau-Monde";

        vesseauMonde.activerBouclier();
        chasseur.activerBouclier();
        chasseur.attaque(vesseauMonde,"lasére photomique",3);
        vesseauMonde.desactiverBouclier();

        System.out.println("la résistance d'une bouclier de VM est "+vesseauMonde.resistanceDeBuclier);
        System.out.println("le blindage de VM est "+vesseauMonde.blindage);

    }

}
