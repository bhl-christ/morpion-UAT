# language: fr
Fonctionnalité: Jouer une partie de morpion
  Afin de m’assurer que le jeu de morpion fonctionne correctement
  En tant que joueur
  Je veux pouvoir jouer une partie, respecter les règles et obtenir un résultat correct

  Scénario: Démarrer une nouvelle partie
    Étant donné que le plateau est vide
    Quand l'IA commence une partie
    Alors le plateau doit contenir 9 cases vides
    Et l'IA doit être le premier à jouer

  Scénario: Placer un symbole sur une case vide
    Étant donné que le plateau est vide
    Quand l'IA joue dans une case vide
    Alors la case doit contenir "X"
    Et le tour doit passer au joueur O

  Scénario: Tenter de jouer sur une case déjà occupée
    Étant donné qu’une case est déjà occupée par "0"
    Quand l'IA tente de jouer dans cette case
    Alors le jeu doit refuser le coup
    Et la case doit toujours contenir "0"
    Et c’est encore à l'IA de jouer


