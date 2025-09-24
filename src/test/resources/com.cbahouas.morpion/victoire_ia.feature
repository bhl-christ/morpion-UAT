# language: fr
#Fonctionnalité: Détection de victoire au Morpion
#  En tant que joueur de morpion
#  Je veux que le système détecte automatiquement les victoires
#  Afin de déterminer le gagnant de la partie

Fonctionnalité: Victoire de l'IA dans le jeu de morpion
  En tant que joueur
  Je veux que l'IA puisse gagner la partie lorsqu'elle a une opportunité

  Scénario: Victoire de l'IA
    Étant donné que le plateau est vide
    Quand l'IA a déjà deux symboles alignés
    Et que la troisième case de l’alignement est vide
    Et que c’est à lui de jouer
    Alors l'IA doit jouer dans cette case
    Et la partie doit être terminée

  Scénario: Match nul
    Étant donné que la partie est presque terminée
    Et que toutes les cases du plateau sont remplies sauf la dernière
    Et qu’aucune ligne, colonne ou diagonale complète n’est gagnante
    Et que c’est à l'IA de jouer
    Quand l'IA joue dans la dernière case vide
    Alors aucune victoire ne doit être détectée
    Et le résultat de la partie doit être déclaré comme un match nul