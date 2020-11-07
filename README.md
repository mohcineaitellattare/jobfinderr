## Etape à suivre:

1.  Vous devrez d'abord **cloner** ou **télécharger et décompresser** le dépositaire de l'application.

2. Crée un nouvelle base de donne avec le nom **jobfinder**, vous pouvez utilisé (Xamp, Wamp..).

3. Exécuter l’app avec n’importe quel IDE(intelej,netbeans,eclipse…).

4. Pour tester l'app vous pouvez utilisé **POSTMAN** pour exécuter les requête suivant.

         ENTREPRISE :
                type requete: post.
                url: http://localhost:8090/job.finder/entreprise/
                json body: {"nom":"gemoghrafy","email":"gemoghraphy@gmail.com","telephone":"0630565493","adress":"teeeest"}

         INDIVIDU:
                type requete: post
                url: http://localhost:8090/job.finder/individu/
                json body: {"reference":"ind-3","prenom":"mohcine","nom":"ait ellattar","email":"mohcine@gmail.com","telephone":"0630565493"}

         ANNONCE
                type requete: post
                url: http://localhost:8090/job.finder/anonce/
                json body: {"code":"an-1","niveau":"+5","experiance":"+2 ans","information":"devlopeur node.js",
                "entreprise":{"nom":"gemoghrafy"}}

         APPLY TO ANNONCE

                type requete: post
                url: ocalhost:8090/job.finder/anonce/applytoannonce/annonceCode/an-1/individuReference/ind-3
            
            
         pour les requete de type get vous pouver utilise les lien dens les **ws** dans le repertoire **jobfinderr/src/main/java/com/job/finderr/model/ws/**
