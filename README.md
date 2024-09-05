# GestCantineADA

## Description

GestCantineADA est une application de gestion de cantine , permettant aux utilisateurs de gérer les menus et les plats associés. L'application offre une interface utilisateur simple pour ajouter, modifier et supprimer des plats et des menus.

## Fonctionnalités Principales

- **Gestion des Plats** : Ajouter, modifier et supprimer des plats avec des informations telles que le nom et le résumé.
- **Gestion des Menus** : Créer des menus en associant des plats à des dates spécifiques.
- **Interface Utilisateur** : Une interface conviviale pour une navigation facile et intuitive.

## Prérequis

Avant de commencer, assurez-vous d'avoir installé les éléments suivants :

- **Java 17 ou version supérieure** : Assurez-vous que Java est installé et configuré dans votre système.
- **Maven** : Pour la gestion des dépendances ou si vous avez un IDE comme IJ actualise mon Pom.xml.
- **Base de données** : MySQL  (configurable dans le fichier `application.properties`).

## Étapes d'Installation

1. **Clonez le dépôt** :
   ```bash
   git clone https://votre-repo-url.git

    Configurer la Base de Données :
        Créez une base de données dans MySQL installer wamp ou xamps.
        Modifiez le fichier src/main/resources/application.properties pour configurer les paramètres de la base de données :
        properties

spring.datasource.url=jdbc:mysql://localhost:3306/nom_de_votre_base
spring.datasource.username=VotreUtilisateur
spring.datasource.password=VotreMotDePass
