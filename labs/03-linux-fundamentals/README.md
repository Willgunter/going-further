# Module 03 Lab — Linux Fundamentals for Engineers

## Objectives

By the end of this lab you will have:

- Logged into a shared Linux host over SSH
- Navigated the filesystem and inspected file permissions
- Created, copied, moved, and removed files and directories
- Viewed running processes and read/followed a log file
- Edited a file at the command line using `nano`

## Setup

- SSH client (built into Windows Terminal / PowerShell / Git Bash)
- Credentials for the shared Linux training host (provided by your trainer)
- A copy of [`app.log`](../../demos/03-linux-fundamentals/app.log) will already exist on the
  host at `~/sprint1/logs/app.log`

## Task sheet

Work through each step on the shared Linux host. Keep a note of the command you used for each
step.

1. **Connect and orient yourself**
   - SSH into the host using the credentials provided.
   - Print your current working directory.
   - List the contents of your home directory, including hidden files, in long-listing format.

2. **Create a working area**
   - Create a directory called `sprint1-notes` in your home directory.
   - Inside it, create an empty file called `day1.txt`.
   - Confirm both now exist using a long listing.

3. **Copy, rename, and move**
   - Make a copy of `day1.txt` called `day1-backup.txt`.
   - Rename `day1-backup.txt` to `day1.bak` (hint: this is the same command as moving a file).
   - Move `day1.bak` into a new subdirectory called `archive`.

4. **Permissions**
   - Run a long listing of `day1.txt` and note down the permission string (e.g. `-rw-r--r--`).
   - Change the permissions so that only you can read and write the file, and no one else has
     any access.
   - Re-run the long listing and confirm the permission string changed as expected.

5. **Processes**
   - List all running processes and find any process related to Java.
   - Note the process ID (PID) of one such process.

6. **Logs**
   - Navigate to `~/sprint1/logs/`.
   - View the last 20 lines of `app.log`.
   - Find the single `ERROR` line in the file and note what class and line number it references.
   - Follow the log file live for a few seconds (you won't see new output unless the trainer is
     writing to it, but confirm you know how to stop following it).

7. **Edit at the command line**
   - Open `day1.txt` in `nano`.
   - Add a line summarising one thing you learned about Linux permissions today.
   - Save and exit.
   - Print the file contents to confirm your line was saved.

## Acceptance criteria

- `sprint1-notes/day1.txt` exists, is owned by you, has permissions `-rw-------` (600), and
  contains your one-line summary.
- `sprint1-notes/archive/day1.bak` exists.
- You can state the PID of a Java process and the line number of the `ERROR` in `app.log`
  without looking it up again.

If you finish early, compare notes with a partner: did you use the same commands for step 4?
There's often more than one valid way to do the same thing in Linux.
