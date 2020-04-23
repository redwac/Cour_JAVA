public class Helloworld {

    public static void main(String[] args){

        Planetes mars = new Planetes();
        mars.nom="mars";
        mars.diametre=4800l;
        //mars.rotation(780);
        //mars.acceuillirveasseau();
        //mars.acceuillirveasseau("fregate");
        //mars.acceuillirveasseau("chasseur");

        Planetes uranus=new Planetes();
        uranus.nom="uranus";
        uranus.diametre=5778l;

        Atmosphere atmouranus= new Atmosphere();
        atmouranus.tazote=23f;
        atmouranus.thydrogine=34f;
        atmouranus.tmetane=16f;
        uranus.atmosphere=atmouranus;
        System.out.println("le pourcentage d'azote dans uranus est : "+uranus.atmosphere.tazote+"%");
        System.out.println("le pourcentage de hydrogine dans uranus est : "+uranus.atmosphere.thydrogine+"%");
        System.out.println("le pourcentage de metane dans uranus est : "+uranus.atmosphere.tmetane+"%");


       // System.out.println("le nombre des habitants est :" + mars.acceuillirveasseau("fregate"));

    }



}
