# Module 13 Lab — Walkthrough (Instructor Reference)

```bash
git switch -c feature/docker-skeleton

# copy starter/ files in, edit Main.java's <team-name> placeholder

mvn clean package
docker build -t team-skeleton .
docker run --rm team-skeleton
# Hello world from Sprint Squad's Sprint 1 project skeleton

git add Dockerfile pom.xml src
git commit -m "Add containerised hello world skeleton"
git push -u origin feature/docker-skeleton

# merge according to the team's Module 12 strategy, e.g. for trunk-based:
git switch main
git merge feature/docker-skeleton
git push
```

## What to check as an instructor

- The Dockerfile is single-stage and minimal, matching Module 11's pattern (base image,
  `WORKDIR`, `COPY`, `ENTRYPOINT`). A multi-stage build isn't wrong, but isn't required at this
  stage either.
- The merge into `main` actually followed whatever the team documented in Module 12, not just
  "whatever was quickest." Ask a team member to explain the step they took and why.
- A second team member, working from a clean `git pull`, can reproduce the exact same
  `docker build` and `docker run` result. This confirms the skeleton isn't accidentally relying
  on something local to one person's machine (a stray file, a cached layer, a locally installed
  tool not captured anywhere in the repo).
