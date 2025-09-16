# language: fr
Fonctionnalité: Jouer une partie de morpion
  Afin de m’assurer que le jeu de morpion fonctionne correctement
  En tant que joueur
  Je veux pouvoir jouer une partie, respecter les règles et obtenir un résultat correct

  Scénario: Démarrer une nouvelle partie
    Étant donné que le plateau est vide
    Quand le joueur X commence une partie
    Alors le plateau doit contenir 9 cases vides
    Et le joueur X doit être le premier à jouer

  Scénario: Placer un symbole sur une case vide
    Étant donné que le plateau est vide
    Quand le joueur X joue dans une case vide
    Alors la case doit contenir "X"
    Et le tour doit passer au joueur O

  Scénario: Tenter de jouer sur une case déjà occupée
    Étant donné qu’une case est déjà occupée par "X"
    Quand le joueur O tente de jouer dans cette case
    Alors le jeu doit refuser le coup
    Et la case doit toujours contenir "X"
    Et c’est encore au joueur O de jouer

  Scénario: Victoire d’un joueur
    Étant donné qu’un joueur a déjà deux symboles alignés
    Et que c’est à lui de jouer
    Quand il joue sur la troisième case de l’alignement
    Alors ce joueur doit être déclaré gagnant
    Et la partie doit être terminée

  Scénario: Match nul
    Étant donné que la partie est presque terminée
    Et que toutes les cases du plateau sont remplies sauf la dernière
    Et qu’aucune ligne, colonne ou diagonale complète n’est gagnante
    Et que c’est au joueur X de jouer
    Quand le joueur X joue dans la dernière case vide
    Alors aucune victoire ne doit être détectée
    Et le résultat de la partie doit être déclaré comme un match nul
