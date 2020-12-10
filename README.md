# Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application

## Description du projet

Ce projet est destiné à analyser les tendances. L'objectif est d'obtenir à partir d'une liste de symptômes présents dans un fichier nommé "symptoms.txt", 
le nombre d'occurence de chaque symptôme. Une fois le comptage effectué, le résultat de celui-ci est écrit dans un fichier de sortie nommé "results.out" au format csv.

## Statut du projet

Le projet est en béta test. Il est terminé mais n'a pas subit de tests utilisateur.

## Environnement de développement

Le projet a été développé en java 11 en utilisant l'IDE Intellij.	

## Structure du programme

Le programme est constitué de 9 fichiers java (classes et interfaces) y compris le fichier main. Les différentes classes utilisées sont dispatchées dans 3 packages nommés reader, counter et writer. Le fichier
main n'est pas inclu dans un packetage.

Le package reader contient 2 classes java et une interface. La classe principale est nommée "SymptomsFileReader". Elle lit les données en provenance d'un fichier. Le fichier lu est initialisé dans le programme main et se nomme "symptoms.txt". L'interface "ISymptomsReader" permet de lier un contrat avec la classe "SymptomsFileReader" en définissant la méthode "readSymptoms". Enfin, la classe ReaderException permet de définir une exception personnalisée pour une erreur de type RuntimeException.

Le package counter contient une classe et une interface. La classe "SymptomsFileDataCounter" compte le nombre d'occurences pour les symptômes présents dans le fichier lu. L'interface définit le contrat avec la classe "SymptomsFileDataCounter" en définissant la méthode "Treatment".

Le package writer est structuré de la même façon que le package reader autour des classes et interfaces suivantes : "SymptomsFileWriter", "ISymptomsWriter" et "WriterException". La classe "SymptomsFileWriter" se charge d'ouvrir en écriture un fichier csv "Results.out" et d'écrire les occurences comptés grâce à "SymptomsFileDataCounter" dans le fichier de sortie.

## Installation

* Créer les fichiers class avec la commande javac (javac AnalyticsCounter.java reader/\*.java counter/\*.java writer/\*.java)

* Créer un nouveau dossier et copier les fichiers class créés par javac dans ce dossier en gardant l'arborescence (reader, counter et writer)

* Créer un fichier MANIFEST.MF contenant la ligne suivante "Main-Class: AnalyticsCounter" (sans les guillemets) suivie d'un retour à la ligne

* En ligne de commande sous windows cmd, tapez jar cvmf MANIFEST.MF analyticsCounter.jar \*.class reader/\*.class counter/\*.class writer/\*.class symptoms.txt

* Exécuter le programme en saisissant toujours en ligne de commande java -jar AnalyticsCounter.jar
