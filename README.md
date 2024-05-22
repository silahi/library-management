# Gestion de Bibliothèque

Ce projet est une application de gestion de bibliothèque développée avec Spring Boot et Thymeleaf. Il permet aux utilisateurs de gérer leur collection de livres, y compris l'ajout, la recherche, la modification et la suppression de livres.

## Vidéo YouTube

Découvrez une démonstration de cette application sur YouTube :

[![Démonstration de l'Application](https://img.youtube.com/vi/NB4VVYfScIQ/0.jpg)](https://www.youtube.com/watch?v=NB4VVYfScIQ)

## Fonctionnalités

- **Ajout de Livres** : Les utilisateurs peuvent ajouter des livres à leur bibliothèque en fournissant des informations telles que le titre, l'auteur, le genre, l'année de publication, etc.
- **Recherche de Livres** : Les utilisateurs peuvent rechercher des livres dans leur bibliothèque en utilisant différents critères comme le titre, l'auteur, le genre, etc.
- **Modification des Détails d'un Livre** : Les utilisateurs peuvent modifier les détails d'un livre existant dans leur bibliothèque.
- **Suppression de Livres** : Les utilisateurs peuvent supprimer des livres de leur bibliothèque.
- **Liste des Livres** : Les utilisateurs ont accès à une liste complète de tous les livres présents dans leur bibliothèque.

## Prérequis

- Java Development Kit (JDK) 8 ou supérieur
- Maven
- Docker (pour exécuter la base de données PostgreSQL avec Docker Compose)

## Installation et Exécution

1. Clonez ce dépôt sur votre machine locale :

   ```bash
   git clone https://github.com/votre_utilisateur/gestion-bibliotheque.git
   ```

2. Accédez au répertoire du projet :

   ```bash
   cd gestion-bibliotheque
   ```

3. Lancez la base de données PostgreSQL en exécutant la commande Docker Compose :

   ```bash
   docker-compose up -d
   ```

4. Compilez et exécutez l'application Spring Boot à l'aide de Maven :

   ```bash
   mvn spring-boot:run
   ```

5. Accédez à l'application dans votre navigateur web à l'adresse suivante : [http://localhost:8080](http://localhost:8080)

## Configuration de la Base de Données

La configuration de la base de données se trouve dans le fichier `src/main/resources/application.properties`. Vous pouvez modifier les paramètres de la base de données selon vos besoins.

## Contribution

Les contributions sont les bienvenues ! Si vous souhaitez contribuer à ce projet, veuillez ouvrir une pull request.

## Auteurs

- [Ali Houssene Silahi](https://github.com/silahi)

## License

Ce projet est sous licence MIT. Voir le fichier [LICENSE](LICENSE) pour plus de détails. 
