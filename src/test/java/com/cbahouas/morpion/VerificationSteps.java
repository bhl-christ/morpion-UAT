package com.cbahouas.morpion;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;

public class VerificationSteps {
    private MyWorld myWorld;

    public VerificationSteps(MyWorld myWorld) {
        this.myWorld = myWorld;
    }

    @Alors("le plateau doit contenir {int} cases vides")
    public void lePlateauDoitContenirCasesVides(int casesVides) {}

    @Et("le joueur {string} doit être le premier à jouer")
    public void leJoueurDoitEtreLePremierAJouer(String joueur) {}

    @Alors("la case doit contenir {string}")
    public void laCaseDoitContenir(String symbole) {}

    @Et("le tour doit passer au joueur {string}")
    public void leTourDoitPasserAuJoueur(String joueur) {}

    @Alors("le jeu doit refuser le coup")
    public void leJeuDoitRefuserLeCoup() {}

    @Et("la case doit toujours contenir {string}")
    public void laCaseDoitToujoursContenir(String symbole) {}

    @Et("c’est encore au joueur {string} de jouer")
    public void cestEncoreAuJoueurDeJouer(String joueur) {}

    @Alors("ce joueur doit être déclaré gagnant")
    public void ceJoueurDoitEtreDeclareGagnant() {}

    @Et("la partie doit être terminée")
    public void laPartieDoitEtreTerminee() {}

    @Alors("aucune victoire ne doit être détectée")
    public void aucuneVictoireNeDoitEtreDetectee() {}

    @Et("le résultat de la partie doit être déclaré comme un match nul")
    public void leResultatDoitEtreMatchNul() {}
}
