# Demo: Module 13 — Containerising the Project Skeleton

**Duration:** 8 minutes
**Prerequisite:** A team repository already set up with a branching strategy (Module 12). Docker
Desktop running. No new commands beyond Modules 07 and 11.

## Part 1: Framing the task (1 min)

Narration: like Module 12, there's nothing new to learn here technically. This is Module 11's
Dockerfile skills and Module 07's branching skills, applied together, on the team repository you
just created.

## Part 2: Branch, add the skeleton (3 min)

Using whatever branch naming the team agreed in Module 12 (or a sensible default like
`feature/docker-skeleton` if their strategy doesn't specify one):

```bash
git switch -c feature/docker-skeleton
```

Add a minimal "hello world" app, a Dockerfile, and build it:

```dockerfile
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/team-skeleton-0.1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

```bash
mvn clean package
docker build -t team-skeleton .
docker run --rm team-skeleton
```

Narration: `--rm` here instead of `-d`, this app just prints a message and exits, there's
nothing to leave running or inspect afterwards, unlike Module 11's app.

## Part 3: Commit and merge via the team's strategy (3 min)

```bash
git add Dockerfile pom.xml src
git commit -m "Add containerised hello world skeleton"
git push -u origin feature/docker-skeleton
```

Narration: this is exactly the moment the team's Module 12 decision matters. If they chose
trunk-based, merge straight back to `main` quickly. If they chose something with a review step,
have a teammate look at the branch first. Either way, the mechanics are identical to Module 07.

```bash
git switch main
git merge feature/docker-skeleton
git push
```

## Part 4: Confirm everyone can reproduce it (1 min)

Have a second team member pull `main`, build the image, and run it themselves.

Narration: the point isn't just "it builds on my machine", it's confirming the whole team can
reproduce the same containerised skeleton from a clean checkout. That's the property CI (coming
properly in a later sprint) will eventually verify automatically.

## Key message

A working, committed, containerised skeleton is the last piece needed before the team starts
building on top of it. Everything from here on in the programme builds on this same repo, same
strategy, same container pattern.
