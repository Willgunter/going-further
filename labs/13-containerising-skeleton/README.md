# Module 13 Lab — Containerising the Project Skeleton

## Objectives

By the end of this lab your team will have:

- A minimal Dockerfile for a "hello world" project skeleton
- That skeleton committed to your team repository using the branching strategy you agreed in
  Module 12
- A container every team member can independently build and run from a clean checkout

## Setup

- Your team repository from Module 12, with its branching strategy documented
- Docker Desktop 27.x
- The [`starter/`](starter) folder from this lab (a minimal "hello world" Java app)

## Task sheet

### Part A — Branch

1. As a team, create a branch for this work, following whatever branch naming your Module 12
   strategy calls for (or `feature/docker-skeleton` if it doesn't specify one).

### Part B — Add the skeleton and containerise it

2. Copy the [`starter/`](starter) files into your team repository, on that branch.
3. Edit `Main.java` to replace `<team-name>` with your actual team name.
4. Build it locally with Maven and confirm it runs and prints your message.
5. Write a minimal, single-stage Dockerfile for it, based on what you practised in Module 11.
6. Build the image and run a container from it with `docker run --rm <image-name>` — confirm
   your message is printed, then the container exits (there's no need for `-d` here, this isn't
   a long-running app).

### Part C — Commit and merge, using your team's strategy

7. Commit the skeleton app and the Dockerfile, and push the branch.
8. Merge it into `main` following whatever process your team agreed in Module 12 (a quick
   review first, or a direct merge, depending on your strategy).
9. Push the merged `main`.

### Part D — Confirm it's reproducible

10. Have a **different** team member than whoever did steps 2-9 pull the latest `main`, build
    the image themselves, and run it.
11. Confirm they see the same output, from a completely clean checkout.

## Acceptance criteria

- `main` in your team repository contains the skeleton app and a working Dockerfile.
- `docker build` and `docker run --rm` succeed for at least two different team members, each
  starting from a fresh `git pull` of `main`.
- Your team can point to the exact commit (or merge) where the skeleton was integrated, and
  explain which branching strategy step they followed to get it there.

This is the last hands-on lab of Sprint 1. Module 14 wraps up and prepares you for Friday's
assessment.
