public enum  TypeBoitVitesse {
    auto("automatique"),
    manuel("semi-manuelle"),
    semiAuto("Manuelle");
    String nomTypeBoite;
    // java essaie de trouver un constructeur avec strin en argument: on va l'jouter
    private TypeBoitVitesse(String nomTypeBoite){
        this.nomTypeBoite=nomTypeBoite;
    }
}
