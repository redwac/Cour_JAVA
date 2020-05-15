public class Port {

    void acceuilleEngin(Amarrable amarable){
        if (amarable instanceof Bateau){
            System.out.println("c'ette amarable est un bateau");
        }
        int nbcorde=amarable.combienDecorde(50);
        System.out.println("le nombre de corde necessaire est : "+nbcorde);
    }
}
