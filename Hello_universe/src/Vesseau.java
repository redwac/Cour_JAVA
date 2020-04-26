import javax.swing.*;
import java.sql.SQLOutput;

public class Vesseau {
    String typV;
    int nbrPassager;
    int blindage;
    int resistanceDeBuclier;

    void activerBouclier(){
        System.out.println("le vesseau " +typV+" à activé le bouclier");

    }
    void desactiverBouclier(){

        System.out.println("le vesseau " +typV+" à désactivé le bouclier");

    }
}
