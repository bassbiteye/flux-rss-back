# flux-rss-back

MINI PROJET FLUX RSS : PROGRAMME SOFTWARE ENGINEERING EDACY - DIGITAL
AFRICA
L’objectif de ce mini projet est de développer un lecteur de flux RSS
Use case:
● récupérer le flux du 'le monde' https://www.lemonde.fr/rss/en_continu.xml
● l'afficher sous un format listing avec image et extrait
● prévoir la pagination
● pouvoir modifier le titre
● pouvoir modifier l'extrait
Langage front imposé : Angular
Langage back : au choix
Délai : 2 jours, à rendre au plus tard le jeudi 21 avril à 12h00 GMT
.
Livrables :
● Repo Github du projet
● Un README qui explique les technologies utilisées et le processus de lancement de
l’application
● Un bonus pour ceux qui pourront partager un lien ou on peut tester (par exemple sur
Heroku)
# flux-rss-back


## pour lancer le serveur angular
https://github.com/bassbiteye/flux-rss-front

Taper  `ng serve` dans un terminal pour demarrer puis naviger via  `http://localhost:4200/`. 
Pour la partie Back J'ai  utilisé du springboot,donc c'est elle qui recupére le fichier xml https://www.lemonde.fr/rss/en_continu.xml ensuite elle fait le traitement pour pouvoir retourner un api rest  qui est utilisé dans la partie front 

## pour lancer springboot il faut taper 
 mvnw spring-boot:run
Backend https://github.com/bassbiteye/flux-rss-back
