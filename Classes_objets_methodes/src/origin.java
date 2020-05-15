import javax.swing.plaf.synth.SynthOptionPaneUI;

public class origin {
    public static void main(String[] args){

    Voiture peugeot=new Voiture();
    peugeot.typB=TypeBoitVitesse.auto;
        System.out.println("le type de ma boite vitesse est : "+peugeot.typB.nomTypeBoite);
        System.out.println("le type de ma boite vitesse est : "+peugeot.typB.ordinal());

    }
}
