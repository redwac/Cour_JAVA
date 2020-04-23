public class Planetes {

    String nom ;
    String martiere ;
    long diametre ;
    int totalVisiteur ;
    int nbV ;
    Atmosphere atmosphere ;



    void acceuillirveasseau(){
        nbV=nbV+8;

    }


    void acceuillirveasseau(String car){

        if (car.equals("chasseur")){
            nbV=nbV+3;
        }
        else if(car.equals("fregate")){
            nbV=nbV+12;

        }
        else if(car.equals("croiseur")){
            nbV=nbV+50;

        }

        System.out.println("le nombre des abbitants est : " + nbV);
    }



    void rotation(int DR){
        System.out.println("la planete " + nom + " est en " + DR + " degré de retation");
    }
}
