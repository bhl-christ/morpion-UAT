package com.cbahouas.morpion;

import io.cucumber.java.fr.Quand;

public class ActionSteps {
    private MyWorld myWorld;

    public ActionSteps(MyWorld myWorld) {
        this.myWorld = myWorld;
    }

    @Quand("le joueur {string} commence une partie")
    public void leJoueurCommenceUnePartie(String joueur) {}

    @Quand("le joueur {string} joue dans une case vide")
    public void leJoueurJoueDansUneCaseVide(String joueur) {}

    @Quand("le joueur {string} tente de jouer dans cette case")
    public void leJoueurTenteDeJouerDansCetteCase(String joueur) {}

    @Quand("il joue sur la troisième case de l’alignement")
    public void ilJoueSurLaTroisiemeCase() {}

    @Quand("le joueur {string} joue dans la dernière case vide")
    public void leJoueurJoueDerniereCaseVide(String joueur) {}
}
