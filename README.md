# SpringCompte

API de gestion de compte réalisé dans le cadre d'une formation sur les micro-services.
Ce projet se base sur ce tutoriel : https://www.youtube.com/watch?v=jDLaKOBkLI4&feature=emb_title .

## Lancer l'API

### Pré-requis
* Avoir un JDK 1.8
* Avoir un IDE
* Télécharger le projet puis les dépendances
* Lancer le projet et se rendre sur l'url `http://localhost:7766`

## Fonctionalité

* Gestion de compte
* Faire une transaction d'un compte à l'autre
* Se connecter pour accéder à certaine partie de l'API

### Micro Service

Cette API est un projet indépendant qui contient son propre domaine, et sa propre logique métier.
En se rendant sur `http://localhost:7766/swagger-ui/index.html` on peut voir la documentation de l'API qui répertorie toutes les méthodes existantes

### Monitoring

Le monitoring se fait gràce à Actuator.

En se rendant `http://localhost:7766/actuator` on peut accéder au monitoring de l'application.
En se rendant sur `http://localhost:7766/browser/index.html` on peut accéder à d'autre options de monitoring.

### Sécurité

Pour accéder à l'API, il existe deux utilisateurs:
* admin / admin
* user / user

Seul admin peut se rendre à la route `/info`.

## Todo
 - [ ] Utiliser les tokens JWT pour se connecter
