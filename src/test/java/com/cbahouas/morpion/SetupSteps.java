package com.cbahouas.morpion;

import io.cucumber.java.PendingException;
import io.cucumber.java.fr.*;

public class SetupSteps {
    private MyWorld myWorld;

    public SetupSteps(MyWorld myWorld) { this.myWorld = myWorld; }

    @Étantdonnéque("le plateau est vide")
    public void lePlateauEstVide() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("l'IA commence une partie")
    public void lIACommenceUnePartie() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("le plateau doit contenir {int} cases vides")
    public void lePlateauDoitContenirCasesVides(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("l'IA doit être le premier à jouer")
    public void lIADoitÊtreLePremierÀJouer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("l'IA joue dans une case vide")
    public void lIAJoueDansUneCaseVide() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("la case doit contenir {string}")
    public void laCaseDoitContenir(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("le tour doit passer au joueur {string}")
    public void leTourDoitPasserAuJoueur(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Étantdonné("qu’une case est déjà occupée par {string}")
    public void quUneCaseEstDéjàOccupéePar(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("l'IA tente de jouer dans cette case")
    public void lIATenteDeJouerDansCetteCase() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("le jeu doit refuser le coup")
    public void leJeuDoitRefuserLeCoup() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("la case doit toujours contenir {string}")
    public void laCaseDoitToujoursContenir(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("c’est encore à l'IA de jouer")
    public void cEstEncoreÀLIADeJouer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("l'IA joue le premier coup")
    public void lIAJoueLePremierCoup() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("l'IA doit placer son symbole {string} dans un coin")
    public void lIADoitPlacerSonSymboleDansUnCoin(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("le tour doit passer au joueur")
    public void leTourDoitPasserAuJoueur() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
