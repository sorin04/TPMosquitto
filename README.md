# Projet IoT - Décodage des Messages TTN avec Java

## Objectif
Ce projet démontre comment connecter une application Java à TTN via MQTT, recevoir des messages IoT uplink, et les traiter.

## Fonctionnalités
- Connexion à TTN via HiveMQ.
- Décodage des messages uplink (payload Base64, température, batterie).
- Gestion des configurations et fichiers externes.
- Organisation modulaire avec des packages (`pojo`, `utili`).

## Structure du Projet
- **`org.example`** : Point d'entrée principal.
- **`org.example.utili`** : Classes utilitaires (décodage, lecture de fichiers).
- **`org.example.pojo`** : Représentation des données JSON en objets Java.

## Exécution
1. Cloner le dépôt : `git clone https://github.com/<utilisateur>/<projet>.git`
2. Compiler le projet : `mvn clean install`
3. Lancer l'application : `java -jar target/projet.jar`

## Exemple de Résultat
```plaintext
Message reçu sur le topic 'uplink/messages': Temperature: 25.50°C, Battery: 60-80%
