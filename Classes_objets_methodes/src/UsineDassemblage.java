public class UsineDassemblage {

    VehiculeAmoteur assemblageM(){
        Moteur moteur=new Moteur();
        VehiculeAmoteur vam=new VehiculeAmoteur(moteur);
        return vam;
    }

}
