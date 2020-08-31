# 02-ci-lab

I dagens lab skal vi øve på Trunk basert utvikling i team på 4. (Automatisk via Zoom breakout rooms). 

## Bowling game kata

Sammen skal dere løse følgende oppgave ; https://speakerdeck.com/artenes/the-bowling-game-kata-in-java - Oppgaven går ut på å lage et Javaprogram som kalkulerer poeng for Bowling. For de som ikke er så flinke, følger et lynkurs her; 

_
* Det spilles i en serie på 10 omganger ( også kalt rute), hver på to kast til hver deltager. 
* Kjeglene reises mellom hver omgang. 
* Felles alle kjeglene på første kast kalles det ”strike” som gir 10 poeng pluss bonus i form av verdient på de neste to kastene.
* Ved strike er ruten vanligvis ferdig etter det ene kastet. 
* Felles alle kjeglene i løpet av to kast skalles det ”spare”, som gir 10 poeng pluss bonus for det neste kastet i påfølgende rute. 
* Får man strike i siste omgang/rute får man to ekstra kast, som legges til poengsummen. 
* Får man spare i siste omgang/rute får man ett ekstra kast, som legges til poengsummen. 
* Felles ikke alle kjeglene på to kast gis ett poeng for hver fellte kjegle. 
* Maksimalt antall oppnåelige poeng er 300

## Hvordan dere skal jobbe 

* I denne oppgaven skal hver gruppe lage et repository. Det er ikke lov å comitte direkte på master branch, men alle endringer på master skal gjøres via pull request.
* Jeg vil anbefale at hver gruppe diskuterer seg frem til og starter med et enkelt rammeverk for spillet, med klasser og tester som gjør mulig å jobbe effektivt sammen
* Jeg vil anbefale at dere lager kode- og tester som verifiserer koden i samme PR.

## Nyttige lenker 

* https://docs.github.com/en/github/administering-a-repository/about-protected-branches
* https://docs.travis-ci.com/user/languages/java/
* https://trunkbaseddevelopment.com/
* https://devcenter.heroku.com/articles/pipelines
