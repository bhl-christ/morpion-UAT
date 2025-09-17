package com.cbahouas.morpion;

import io.cucumber.java.fr.Étantdonné;

public class SetupSteps {
    private MyWorld myWorld;

    public SetupSteps(MyWorld myWorld) {
        this.myWorld = myWorld;
    }

    @Étantdonné("que le plateau est vide")
    public void lePlateauEstVide() {}

    @Étantdonné("qu’une case est déjà occupée par {string}")
    public void uneCaseEstDejaOccupeePar(String joueur) {}

    @Étantdonné("qu’un joueur a déjà deux symboles alignés")
    public void unJoueurADejaDeuxSymbolesAlignes() {}

    @Étantdonné("que la partie est presque terminée")
    public void laPartieEstPresqueTerminee() {}

    @Étantdonné("que toutes les cases du plateau sont remplies sauf la dernière")
    public void toutesLesCasesRempliesSaufDerniere() {}

    @Étantdonné("qu’aucune ligne, colonne ou diagonale complète n’est gagnante")
    public void aucuneVictoirePossible() {}

    @Étantdonné("que c’est au joueur {string} de jouer")
    public void cestAuJoueurDeJouer(String joueur) {}

    @Étantdonné("que c’est à lui de jouer")
    public void cestALuiDeJouer() {}
}
