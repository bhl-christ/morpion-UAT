package com.cbahouas.morpion;

import io.cucumber.java.PendingException;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Étantdonnéque;

public class StrategieSteps {
    private MyWorld myWorld;

    public StrategieSteps(MyWorld myWorld) { this.myWorld = myWorld; }

    @Étantdonnéque("le joueur a deux symboles alignés et qu’il est à son tour de jouer")
    public void leJoueurADeuxSymbolesAlignésEtQuIlEstÀSonTourDeJouer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("l'IA joue son tour")
    public void lIAJoueSonTour() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("l'IA doit placer son symbole dans la case qui bloque la victoire du joueur")
    public void lIADoitPlacerSonSymboleDansLaCaseQuiBloqueLaVictoireDuJoueur() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("c’est encore au joueur de jouer")
    public void cEstEncoreAuJoueurDeJouer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Étantdonnéque("l'IA a déjà deux symboles alignés")
    public void lIAADéjàDeuxSymbolesAlignés() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("qu’il lui manque un seul coup pour gagner")
    public void quIlLuiManqueUnSeulCoupPourGagner() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("l'IA doit placer son symbole pour compléter l’alignement")
    public void lIADoitPlacerSonSymbolePourCompléterLAlignement() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("la partie doit être déclarée gagnée par l’IA")
    public void laPartieDoitÊtreDéclaréeGagnéeParLIA() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Étantdonnéque("l'IA peut soit bloquer le joueur soit gagner immédiatement")
    public void lIAPeutSoitBloquerLeJoueurSoitGagnerImmédiatement() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("l'IA doit choisir le coup qui lui assure la victoire")
    public void lIADoitChoisirLeCoupQuiLuiAssureLaVictoire() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
