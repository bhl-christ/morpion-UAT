package com.cbahouas.morpion;

import io.cucumber.java.PendingException;
import io.cucumber.java.fr.*;

public class VictorySteps {
    private MyWorld myWorld;
    public VictorySteps(MyWorld myWorld) { this.myWorld = myWorld; }

    @Et("la troisième case de l’alignement est vide")
    public void laTroisièmeCaseDeLAlignementEstVide() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("c’est à lui de jouer")
    public void cEstÀLuiDeJouer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("l'IA doit jouer dans cette case")
    public void lIADoitJouerDansCetteCase() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("la partie doit être terminée")
    public void laPartieDoitÊtreTerminée() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Etantdonnéque("la partie est presque terminée")
    public void laPartieEstPresqueTerminée() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("toutes les cases du plateau sont remplies sauf la dernière")
    public void toutesLesCasesDuPlateauSontRempliesSaufLaDernière() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("qu’aucune ligne, colonne ou diagonale complète n’est gagnante")
    public void quAucuneLigneColonneOuDiagonaleComplèteNEstGagnante() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("c’est à l'IA de jouer")
    public void cEstÀLIADeJouer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("l'IA joue dans la dernière case vide")
    public void lIAJoueDansLaDernièreCaseVide() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("aucune victoire ne doit être détectée")
    public void aucuneVictoireNeDoitÊtreDétectée() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Et("le résultat de la partie doit être déclaré comme un match nul")
    public void leRésultatDeLaPartieDoitÊtreDéclaréCommeUnMatchNul() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
