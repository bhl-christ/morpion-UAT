# language: fr
Fonctionnalité: Victoire de l'IA dans le jeu de morpion
  En tant que joueur
  Je veux que l'IA puisse gagner la partie lorsqu'elle a une opportunité


  Scénario: Victoire de l'IA
    Étant donné que l'IA a déjà deux symboles alignés
    Et que c’est à lui de jouer
    Quand il joue sur la troisième case de l’alignement
    Alors l'IA doit être déclaré gagnant
    Et la partie doit être terminée

  Scénario: Match nul
    Étant donné que la partie est presque terminée
    Et que toutes les cases du plateau sont remplies sauf la dernière
    Et qu’aucune ligne, colonne ou diagonale complète n’est gagnante
    Et que c’est à l'IA de jouer
    Quand l'IA joue dans la dernière case vide
    Alors aucune victoire ne doit être détectée
    Et le résultat de la partie doit être déclaré comme un match nul