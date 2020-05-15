public class MonGonfler implements Amarrable{
    int surface;

    @Override
    public int combienDecorde(int vitesseduvent) {
        int nbcord=surface/50;
        nbcord=nbcord+vitesseduvent/100;
        return nbcord;
    }
}
