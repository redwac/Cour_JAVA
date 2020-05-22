public class Bateau implements Amarrable{
    int masse;
    @Override
    public int combienDecorde(int vitesseduvent) {
        int nbcord=masse/10;
        nbcord=nbcord+vitesseduvent/100;
        return nbcord;
    }
}
