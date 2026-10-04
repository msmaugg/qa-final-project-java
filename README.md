# qa-final-project-java
Proiect curs java

![CI](https://github.com/USERNAME/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

# qa-final-project-java

Proiect de QA Automation în Java/Maven, cu configurare YAML, pseudocod pentru
testele API și pipeline CI/CD (GitHub Actions + Docker Hub).

## Ce face proiectul
- Conține structura unui proiect de testare automată în Java (Maven).
- `config/app.yaml` – configurarea mediului (`env`, `service.baseUrl`, `timeouts`).
- `src/test/java/com/yourname/tests/ApiTest.txt` – pseudocod pentru un test API
  (GET `/todos/1` → status 200 și câmpul `title`).
- La fiecare push pe `main` rulează testele și se publică imaginea Docker.

## Cum rulez testele local
Cerințe: JDK 17 și Maven.

```bash
mvn test
```

(Momentan nu există teste Java, deci comanda se termină cu succes fără să ruleze nimic.)

## Cum folosesc Docker
```bash
# build
docker build -t qa-final-project-java .

# rulare (execută mvn test în container)
docker run --rm qa-final-project-java
```

## CI/CD
Workflow-ul `.github/workflows/ci.yml` are două job-uri:
1. `test` – rulează `mvn test`.
2. `build-and-push` – rulează doar dacă `test` a trecut (`needs: test`),
   construiește imaginea și o publică pe Docker Hub.

Secrete necesare în GitHub (Settings → Secrets and variables → Actions):
`DOCKERHUB_USERNAME`, `DOCKERHUB_TOKEN`.