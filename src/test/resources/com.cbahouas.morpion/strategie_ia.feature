# language: fr
Fonctionnalité: Stratégie de l'IA dans le jeu de morpion
    En tant que joueur
    Je veux que l'IA utilise une stratégie pour jouer de manière optimale

    Scénario : Bloquer une victoire imminente du joueur
      Étant donné que le joueur a deux symboles alignés et qu’il est à son tour de jouer
      Quand l'IA joue son tour
      Alors l'IA doit placer son symbole dans la case qui bloque la victoire du joueur
      Et c’est encore au joueur de jouer

  Scénario: Saisir une occasion de victoire
    Étant donné que l'IA a déjà deux symboles alignés
    Et qu’il lui manque un seul coup pour gagner
    Quand l'IA joue son tour
    Alors l'IA doit placer son symbole pour compléter l’alignement
    Et la partie doit être déclarée gagnée par l’IA

  Scénario: Prioriser la victoire plutôt que le blocage
    Étant donné que l'IA peut soit bloquer le joueur soit gagner immédiatement
    Quand l'IA joue son tour
    Alors l'IA doit choisir le coup qui lui assure la victoire
    Et la partie doit être déclarée gagnée par l’IA